package Pagepkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Screenshot {
	
	WebDriver dr;
	
	//@FindBy(xpath="//*[@id=\"lrd11\"]")
	//WebElement kidsglass;
	
	public Screenshot(WebDriver dr)
	{
		this.dr=dr;
		//PageFactory.initElements(dr, this);
	}
	
	public void Screenshotmainpage() throws IOException
	{
		
			File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("D://lenskartscreenshot.png"));
			
			/*kidsglass screenshot
			File src1=lenskartlogo.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src1, new File("./Screenshotfold/buttonscreeshot.png"));*/
	}

}
