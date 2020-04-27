package com.kim.java.saveFile;

import java.io.IOException;

public class BasicCrawling {
	public static void main(String[] args) throws IOException {
		System.out.println("Daum 실시간 검색어");
		
		//TODO
		// http://www.daum.net
		// 15개
		
		String url;
		Response response;
		Document doc;		
		Elements elements;
		
		url = "https://www.daum.net";
		response = Jsoup.connect(url).execute();
		System.out.println(response.statusCode());
		
		doc = response.parse();
		


		Elements search_elements = doc.select("div.slide_favorsch ul.list_favorsch li a ");
		System.out.println(search_elements.size()+" 개");
		
		for (Element e : search_elements) {
			System.out.println(e.text().trim());
		}
		
	}

}
