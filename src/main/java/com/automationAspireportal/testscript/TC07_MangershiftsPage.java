package com.automationAspireportal.testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC07_MangershiftsPage extends TestsuiteBase {
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	ReadExcel excel= new ReadExcel(3);

	public TC07_MangershiftsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void updatingshifts() throws AWTException {
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
	   driver.findElement(By.xpath(read.clickonshifts())).click();
		Select selectproject=new Select(driver.findElement(By.xpath(read.clickonselectprojecttb())));
		selectproject.selectByValue("56");;
		driver.findElement(By.xpath(read.updateshifts())).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Select selectemployee=new Select(driver.findElement(By.xpath(read.cickonselectemployee())));
	selectemployee.deselectByValue("0");
	selectemployee.selectByValue("1089");
		driver.findElement(By.xpath(read.clickonstartdate())).click();
		driver.findElement(By.xpath(read.enterstartingdate())).click();
		driver.findElement(By.xpath(read.clickonenddate())).click();
		driver.findElement(By.xpath(read.enterenddate())).click();
		driver.findElement(By.xpath(read.clickonshift())).click();
		driver.findElement(By.xpath(read.selectshift())).click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath(read.clickonBack())).click();

	}

}
