package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Loginpage {
	
	WebDriver dr;
	
	
	
	@FindBy(xpath="//*[@id=\"sign-in-form\"]/div/div[2]/div[2]/div[1]/input")
	WebElement Email;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div/div/div/div[2]/button")
	WebElement Signinbtn1;
	
	@FindBy(xpath="//*[@id=\"sign-in-form\"]/div/div[2]/div[3]/div[1]/input")
	WebElement Password;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div/div/div/div[2]/button")
	WebElement btn2;
	
	public Loginpage(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
		
	}
	
	
	
	
	public void setValues(String email, String pass) throws Exception
	{
		Email.clear();
		Email.sendKeys(email);
		Signinbtn1.click();
		Thread.sleep(1000);
		Password.clear();
		Password.sendKeys(pass);
		Thread.sleep(1000);
		
	}
	
	public void Signinbutton()
	{
		btn2.click();
	}


}
