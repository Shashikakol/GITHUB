package Testscripts;

import org.openqa.selenium.chrome.ChromeDriver;


import POM.Pomyahoo;

public class YahooLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe" );
		 ChromeDriver driver =new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		Thread.sleep(4000);	
		Pomyahoo lp = new Pomyahoo(driver);
		lp.setUsername("sunilk8861");	
		Thread.sleep(2000);
		lp.button1();
		Thread.sleep(2000);
		lp.setPassword("Shashi8861");
		Thread.sleep(2000);
		lp.button2();
		Thread.sleep(2000);
		lp.icon();
		Thread.sleep(2000);	
		lp.clickCompose();
		Thread.sleep(2000);
		lp.to("qspider050@yahoo.com");
		Thread.sleep(1000);
		lp.sub("message");
		Thread.sleep(1000);
		lp.textBody("hello");
		Thread.sleep(1000);
		lp.send();
		Thread.sleep(1000);
		lp.role();
		Thread.sleep(1000);
		lp.signout();
}
}
