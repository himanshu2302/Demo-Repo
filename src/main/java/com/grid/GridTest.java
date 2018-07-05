package com.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {
public static void main(String[] args) throws MalformedURLException {
	
	DesiredCapabilities desCap=new DesiredCapabilities();
	desCap.setBrowserName("chrome");
	desCap.setPlatform(Platform.MAC);
	
	ChromeOptions options=new ChromeOptions();
	options.merge(desCap);
	
	String hubUrl="http://192.168.10.44:4444/wd/hub";
	WebDriver driver=new RemoteWebDriver(new URL(hubUrl), options);
	
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
	driver.close();
	
}
}
