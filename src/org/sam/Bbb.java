package org.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bbb {
	public void t1
	{
		system.out.println("test1");
	}
	public static void main(String[] args) {
		
		System.out.println("browser launching");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");}
}
