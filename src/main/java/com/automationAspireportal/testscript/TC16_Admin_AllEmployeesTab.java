package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC16_Admin_AllEmployeesTab extends TestsuiteBase {
	ReadTimesheetModuleLocators read = new ReadTimesheetModuleLocators();
	public TC16_Admin_AllEmployeesTab(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void allemployeetab() {
		AdminLogin login = new AdminLogin(driver);
		login.adminlogin();
		Select admindrp = new Select(driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[1]/section[1]/div[1]/div[3]/form[1]/div[1]/select[1]")));
		admindrp.selectByVisibleText("Admin");
		driver.findElement(By.xpath(read.clickonreports())).click();
		driver.findElement(By.xpath("//*[@id=\"exportallemp-tab\"]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select selectemployee = new Select(driver.findElement(By.xpath("//select[@id='selectAllEmployee']")));
		selectemployee.deselectByVisibleText("All");
		selectemployee.selectByVisibleText("Employee Login");
		
		WebElement startdate = driver.findElement(By.xpath("//*[@id=\"allstartDate\"]"));
		startdate.sendKeys("12/07/2021");
		startdate.sendKeys(Keys.ENTER);
		WebElement endate = driver.findElement(By.xpath("//*[@id=\"allendDate\"]"));
		endate.sendKeys("16/07/2021");
		endate.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"empDownloadForm\"]/div/div[4]/button")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(read.clickonpdf())).click();
		
	}

}
