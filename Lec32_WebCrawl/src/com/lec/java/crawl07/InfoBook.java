package com.lec.java.crawl07;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InfoBook {
	private String bookTitle;
	private double price;
	private String url;
	private String imUrl;
	
	
	// 기본생성자
	public InfoBook() {}

	public InfoBook(String bookTitle, double price, String url, String imUrl) {
		super();
		this.bookTitle = bookTitle;
		this.price = price;
		this.url = url;
		this.imUrl = imUrl;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImUrl() {
		return imUrl;
	}

	public void setImUrl(String imUrl) {
		this.imUrl = imUrl;
	}
	
	@Override
	public String toString() {
	
		return bookTitle+":"+price+"원, URL: "+url+", img: "+imUrl;
	}
	
	
	
	
}
