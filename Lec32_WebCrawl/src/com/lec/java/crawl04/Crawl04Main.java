package com.lec.java.crawl04;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Scanner;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawl04Main {

	public static void main(String[] args) throws IOException {
		System.out.println("네이버 연관 검색어");
		
		String url;
		Document doc;
		Response response;
		Elements elements;
		
		String searchKeyword;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색어를 입력하세요");
		
		searchKeyword = sc.nextLine();
		String encoded = URLEncoder.encode(searchKeyword,"utf-8");	// 네이버 검색 페이지는 utf-8 url로 encode 하더라
		url = "https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query="+encoded;
		
		System.out.println(url);
		
		doc = Jsoup.connect(url).execute().parse();
		
		sc.close();
		
		Elements serarch_elements = doc.select("#nx_related_keywords ul._related_keyword_ul li a");
		System.out.println(serarch_elements.size()+" 개");
		
		for (Element e : serarch_elements) {
			System.out.println(e.text().trim());
		}
		
		// nx_related_keywords
		//_related_keyword_ul
		// li - a
		
		
		System.out.println("\n프로그램종료");

	}

}
