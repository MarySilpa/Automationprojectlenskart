package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Baseclass {
	
		public static WebDriver dr;
		
	
		
		
		@BeforeTest
		public void setUp()
		{
			dr=new ChromeDriver();
		}
		
		@Test
		
		public void siteLoad() throws InterruptedException 
		{
			dr.get("https://www.lenskart.com/");
			dr.manage().window().maximize();
			
			
			
			
		}

	


}
