package com.automationAspireportal.helper;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.DateUtil;
public class datehelper extends TestsuiteBase{
	

    public void DatePicker()
    {
        driver.findElement(By.id("startDate")).click();
        //This is from date picker table
        
        	WebElement dateWidgetFrom = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.className("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']"))).get(0);
                //This are the columns of the from date picker table
                List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));
                DateUtil.clickGivenDay(columns, DateUtil.getCurrentDay());
                //Wait a bit to see that we have selected the data properly.
                Thread.sleep(5000);
    }
           }
 
    