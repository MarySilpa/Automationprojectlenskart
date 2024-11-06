package Pagepkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Totallinks {
	
	WebDriver dr;
	
	public Totallinks(WebDriver dr)
	{
		this.dr=dr;
	}
	
	
	public void linkscount() {
		List<WebElement> li=dr.findElements(By.tagName("a"));
		System.out.println("No of links"+li.size());
		for(WebElement ele:li)
		{
			String link=ele.getAttribute("href");
			String text=ele.getText();
			verifylink(link);
		}
		
	}
	private void verifylink(String link)
	{
		try
		{
			URI ob=new URI(link);
			HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
			if((con.getResponseCode())==200)
			{
				System.out.println("Successful"+link);
				
			}
			else if((con.getResponseCode())==404)
			{
				System.out.println("Broken"+link);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
