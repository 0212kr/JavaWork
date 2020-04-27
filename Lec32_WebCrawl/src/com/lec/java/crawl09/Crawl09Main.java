package com.lec.java.crawl09;
// 연습
// 네이버 '검색어'
// 블로그
// 		-post url
//		-post url
//		-blog title

import java.io.IOException;
import java.net.URLEncoder;

import javax.xml.ws.Response;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// 페이징 구현

public class Crawl09Main {

	public static void main(String[] args) throws IOException {
		System.out.println("네이버 검색, 페이징");
		for (int i = 1; i <= 10; i++) {
			crawlNaverBlog("파이썬", i);			
		}
		
		System.out.println("\n프로그램 종료");
	}

	
	//https://search.naver.com/search.naver?where=post&sm=tab_jum&query=%ED%8C%8C%EC%9D%B4%EC%8D%AC
	//https://search.naver.com/search.naver?date_from=&date_option=0&date_to=&dup_remove=1&nso=&post_blogurl=&post_blogurl_without=&query=%ED%8C%8C%EC%9D%B4%EC%8D%AC&sm=tab_pge&srchby=all&st=sim&where=post&start=1
	//https://search.naver.com/search.naver?date_from=&date_option=0&date_to=&dup_remove=1&nso=&post_blogurl=&post_blogurl_without=&query=%ED%8C%8C%EC%9D%B4%EC%8D%AC&sm=tab_pge&srchby=all&st=sim&where=post&start=11
	//https://search.naver.com/search.naver?date_from=&date_option=0&date_to=&dup_remove=1&nso=&post_blogurl=&post_blogurl_without=&query=%ED%8C%8C%EC%9D%B4%EC%8D%AC&sm=tab_pge&srchby=all&st=sim&where=post&start=21
	
	public static void crawlNaverBlog(String search, int page) throws IOException{
		
		if(search == null || search.trim().length() == 0 || page < 1) return;
		
		String url;
		Document doc;
		Response response;
		Element element;
		Elements elements;
		
		System.out.println("현재 : "+page+" 페이지");
		
		url = String.format("https://search.naver.com/search.naver?where=post&sm=tab_jum&query="+search,
				URLEncoder.encode(search, "utf-8"), page);
		System.out.println(url);
		
		doc = Jsoup.connect(url).execute().parse();
		elements = doc.select("#elThumbnailResultArea li dl .sh_blog_title");
		
		for(Element e : elements) {
			String postTitle = e.selectFirst("a.sh_blog_title").text().trim();
			String blogTitle = e.selectFirst("dd.txt_block a .txt84").text().trim();
			String postUrl = e.selectFirst("a.sh_blog_title").attr("href").trim();
			
			System.out.println(postTitle + " : " + blogTitle + " : " + postUrl);
			
		}
	}
}
