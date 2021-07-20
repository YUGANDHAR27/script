package com.automationAspireportal.testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC20_Admin_FreezeShifts extends TestsuiteBase
{
	ReadTimesheetModuleLocators read= new ReadTimesheetModuleLocators();
	public TC20_Admin_FreezeShifts(WebDriver driver) {
		this.driver = driver;

	}
	public void freezeshifts() 
	{
	//	String confirmmessage = "Are you sure want to freeze?";
		AdminLogin login=new AdminLogin(driver);
		login.adminlogin();
		 driver.findElement(By.xpath(read.clickonshifts())).click();	
		 driver.findElement(By.xpath("//*[@id=\"nav-profile-tab\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"freezedate\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"confirmFreeze\"]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Actualres=driver.findElement(By.xpath("//div[contains(text(),'Are you sure want to freeze?')]")).getText();
		String Expectedres="Are you sure want to freeze?";
		assertEquals(Actualres, Expectedres);
		driver.findElement(By.xpath(read.clickonclosepopup())).click();
		
		 }
}
