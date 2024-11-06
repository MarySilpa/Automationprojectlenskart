package Pagepkg;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	
	WebDriver dr;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/main/div[1]/div/div[2]/div/div[2]/div/form/input")
	WebElement Search;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/main/div[2]/div/div/div[2]/div/div/section/div/div[3]/div/div[1]/div/div[1]/a/div[2]/img")
	WebElement Firstitem;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/main/div[2]/div/div[2]/aside/div[1]/div[4]/div/button")
	WebElement Buynow;
	
	@FindBy(xpath="//*[@id=\"Alert\"]")
	WebElement Login;
	
	

	public Addtocart(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);
	}
	
	public void Addtocartsetup() throws Exception
	{
		
		Search.sendKeys("Sunglasses",Keys.ENTER);
		//Search.click();
	Thread.sleep(2000);
		String parentwindow=dr.getWindowHandle();
		Firstitem.click();
		Set<String> allwindowHandles=dr.getWindowHandles();
		for(String handle: allwindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				dr.switchTo().window(handle);
				Thread.sleep(3000);		
				Buynow.click();
				Thread.sleep(5000);
				Login.click();
				
				
				Thread.sleep(2000);
				
			}
		}

}
}
