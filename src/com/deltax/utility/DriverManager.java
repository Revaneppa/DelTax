package com.deltax.utility;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;


public class DriverManager {

    public static WebDriver driver;
    public static HashMap<String,HashMap<String,String>> test_data;

    public static void createDriver(){
        if(driver==null) {
            System.setProperty("webdriver.chrome.driver", "src/com/deltax/resources/chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Constants.pageLoadTimeout, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(Constants.implicit_wait, TimeUnit.SECONDS);
        }
    }

    public static WebDriver getDriver(){
        createDriver();
        return driver;
    }

    public static HashMap<String,HashMap<String,String>> getTestData(){
        if(test_data==null) {
            test_data = ExcelUtil.prepareTestDataMap();
        }

        return test_data;
    }

    public static void kill_driver() {

        driver.quit();
        driver=null;
    }
}
