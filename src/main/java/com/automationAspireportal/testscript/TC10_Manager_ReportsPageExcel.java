package com.automationAspireportal.testscript;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC10_Manager_ReportsPageExcel 
{
	ReadTimesheetModuleLocators read = new ReadTimesheetModuleLocators();
	private WebDriver driver;

	public TC10_Manager_ReportsPageExcel(WebDriver driver) {
		this.driver = driver;
	}


	public void managerReportsexcel() throws AWTException {
		
		TC08_manager_ReportsPage excel = new TC08_manager_ReportsPage(driver);
		excel.managerReports();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(read.clickonexcel())).click();	
	}
}
