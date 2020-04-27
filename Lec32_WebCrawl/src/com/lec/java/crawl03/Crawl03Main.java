package com.lec.java.crawl03;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawl03Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Daum 실시간 검색어");
		
		//TODO
		// http://www.daum.net
		// 15개
		
		String url;
		Response response;
		Document doc;		
		Elements elements;
		
		url = "https://news.naver.com/";
		response = Jsoup.connect(url).execute();
		System.out.println(response.statusCode());
		
		doc = response.parse();
		
//		System.out.println(doc.outerHtml());
//		elements = doc.select("#searchword");	// 검색된 Element 들 중 최초 1개만 Element 로 리턴
//		System.out.println(elements);
//		Elements newsElements = doc.select("#searchword");	// 검색된 Element 들이 담겨 있는 Elements 리턴
//		System.out.println(newsElements);

		Elements search_elements = doc.select(".section_list_ranking li");
		System.out.println(search_elements.size()+" 개");
		
		for (Element e : search_elements) {
			System.out.println(e.text().trim());
		}
		
	}

}
