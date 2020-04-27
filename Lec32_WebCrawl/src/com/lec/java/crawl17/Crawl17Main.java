package com.lec.java.crawl17;
/*
 * Selenium 라이브러리 다운로드 (Java 버젼으로!)
 * 	https://www.seleniumhq.org/download/
 * 
 *  BuildPath 추가
 *  
 * 브라우저 드라이버 다운로드 
 *  http://chromedriver.chromium.org/downloads
 *  
 *  
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Crawl17Main {

	
	// WebDriver
	private WebDriver driver;
	private WebElement element;
	private String url;
	
	private static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	private static final String WEB_DRIVER_PATH = "C:/Program_Files_(x86)/Google/Chrome/Application/chrome.exe";
	
	public static void main(String[] args) {
		System.out.println("Selenium");
		
		Crawl17Main app = new Crawl17Main();
		app.init();
		
//		app.naverlogin();
		
		System.out.println("\n프로그램종료");
	}

	public void init() {
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		
		// Driver setup
		ChromeOptions options = new ChromeOptions();
		
		options.setCapability("ignoreProtectedModeSettings", true);
		driver = new ChromeDriver(options);
	}
	
	public void naverlogin() {
		String url = "https://nid.naver.com/nidlogin.login";
		driver.get(url);
		
		element = driver.findElement(By.id("id"));
		System.out.println(element.getSize());
		element.sendKeys("dudnsp03");	// 키보드 타이핑
		
		element = driver.findElement(By.id("pw"));
		element.sendKeys("비밀번호");
		
		//로그인 버튼 클릭
		element = driver.findElement(By.className("bnt_global"));
		element.click();
	}
	
	public void likeFaceBook() {
		String url = "https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110";
		driver.get(url);
		
		element = driver.findElement(By.id("email"));
		System.out.println(element.getSize());
		element.sendKeys("dudnsp03");	// 키보드 타이핑
		
		element = driver.findElement(By.id("pass"));
		element.sendKeys("비밀번호");
		
		//로그인 버튼 클릭
		element = driver.findElement(By.className("login"));
		element.click();
		
		//비번치고 엔터누르기
//		element = driver.findElement(By.className("login"));
//		element.sendKeys(Keys.ENTER);
		
		url = "페북게시물 url";
		driver.get(url);
		
	}
	
}
