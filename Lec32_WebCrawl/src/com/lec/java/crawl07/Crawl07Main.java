package com.lec.java.crawl07;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Crawl07Main {
	
	private static final String PATH = "books";
	
	public static void main(String[] args) throws IOException {
		System.out.println("인터파크 도서 검색결과 페이지");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색어를 입력하세요: ");
		String search = sc.nextLine(); 
		sc.close();
		
		Crawl07Main app = new Crawl07Main();
		ArrayList<InfoBook> list = app.crawlInterPark(search);
		
		// 썸네일 이미지 다운로드 받아서
		// thumb001.jpg ~ thumb002.jpg ...
		
		int fileIndex = 1;
		for(InfoBook e : list) {
			System.out.println(e);	//크롤링 정보 출력
			
			// 썸네일 이미지 다운로드
			String fileName = String.format(PATH+File.separator+"thumb%03d.jpg", fileIndex);
			
			URL imgUrl = new URL(e.getImUrl());
			BufferedImage imgData = ImageIO.read(imgUrl);
			File file = new File(fileName);
			ImageIO.write(imgData, "jpg", file);
			
			System.out.println(fileName+" 이 저장되었습니다.");
			
			fileIndex++;
		}
		
		System.out.println("\n프로그램 종료");
	} // end main()

	
	private ArrayList<InfoBook> crawlInterPark(String search) throws IOException {
		ArrayList<InfoBook> list = new ArrayList<InfoBook>();
		
		String url;
		Document doc;
		Response response;
		Elements elements;
		Elements rowElements;
		Elements title;
		String inside;
		String img;
		String money;
		// http://book.interpark.com/
		//책이름 , URL*, 썸네일이미지다운로드, 상세페이지, 돈
		
		url = "http://bsearch.interpark.com/dsearch/book.jsp?sch=all&query="+URLEncoder.encode(search, "euc-kr");
		doc = Jsoup.connect(url).execute().parse();
		
		
		rowElements = doc.select("#bookresult > form > div.list_wrap");
		System.out.println(rowElements.size());
		
		title = doc.select("#bookresult > form > div:nth-child(2) > div.info > p.tit > b > a");
		inside = title.attr("href").trim();
		img = doc.select("#bookresult > form > div:nth-child(2) > div.bookImg > div > div.bimgWrap > a > img").attr("src");
		money = doc.selectFirst("#bookresult > form > div:nth-child(2) > div.price > div > p").text().replaceAll("원","");
		
		int num = 2;
		for (Element e : rowElements) {
			title = doc.select("#bookresult > form > div:nth-child("+num+") > div.info > p.tit > b > a");
			inside = title.attr("href").trim();
			img = doc.select("#bookresult > form > div:nth-child("+num+") > div.bookImg > div > div.bimgWrap > a > img").attr("src");
			money = doc.selectFirst("#bookresult > form > div:nth-child("+num+") > div.price > div > p").text().replaceAll("원","");

		String name = title.text();
		System.out.println(name);
		System.out.println(url);
		System.out.println(img);//이미지
		
		System.out.println(inside);
		System.out.println(money);//돈
		num++;
		}


		
		
		
		
		
		
		return list;
	}
	
	
	
} // end class





