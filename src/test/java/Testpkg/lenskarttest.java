package Testpkg;

import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.Addtocart;
import Pagepkg.Loginpage;
import Pagepkg.Screenshot;
import Pagepkg.Totallinks;
import Utilities.Lenskartutils;

public class lenskarttest extends Baseclass {
	
	
	@Test(priority = 3)
	public void Titleverification()
	{
		
		
		String ActTitle=dr.getTitle();
		System.out.println(ActTitle);
		String ExpTitle="Eyeglasses, Sunglasses, Contact Lens Online - Lenskart IN";
		if(ActTitle.equals(ExpTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	
	@Test(priority = 4)
	public void Textverification()
	{
		
		
		String src=dr.getPageSource();
		if(src.contains("Wishlist"))
		{
			System.out.println("Text is present");
		}
		else
		{
			System.out.println("Text is not present");
		}
	}
	
	@Test(priority = 5)
	
	public void Addtocartcheck() throws Exception
	{
		
		
		Addtocart ac=new Addtocart(dr);
		ac.Addtocartsetup();
		System.out.println("end");
	}
	
	@Test(priority =2)
	public void Verifylinkcheck() throws Exception
	{
		
		Totallinks tl=new Totallinks(dr);
		tl.linkscount();
		System.out.println("end");
	}
	
	@Test
	
	public void Screenshotcheck() throws Exception
	{
	
		
		Screenshot ss=new Screenshot(dr);
		ss.Screenshotmainpage();
		System.out.println("Screenshot taken");
		System.out.println("end");
	}
	
	@Test(priority = 6)
	public void verifyloginwithcred() throws Exception
	{
			
		Loginpage lp=new Loginpage(dr);
		
		
		System.out.println("inside verifylogin");
				
		String xl="D:\\lenskart.xlsx";
		
		String Sheet="nymphaenelumbocred";
		
		int rowcount=Lenskartutils.getRawCount(xl, Sheet);
		System.out.println("rowcount="+rowcount);
		
		for(int i=1;i<rowcount;i++)
		{
			String Username=Lenskartutils.getCellValue(xl, Sheet, i, 0);
			System.out.println("Username..."+Username);
			String Password=Lenskartutils.getCellValue(xl, Sheet, i, 1);
			System.out.println("Password..."+Password);
			
			
			lp.setValues(Username, Password);
			lp.Signinbutton();
			
			/*
			
			String Expurl="https://www.lenskart.com/";
			String Acturl=dr.getCurrentUrl();
			if(Acturl.equals(Expurl))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}*/
			
		}
		
		
	}

	
}
