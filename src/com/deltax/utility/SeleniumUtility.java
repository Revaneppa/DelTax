package com.deltax.utility;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {

    public static ArrayList<HashMap<String, String>> hashData = null;

    public static WebElement findElement(By locator) {
        WebElement element = null;
        for (int i = 0; i < Constants.findElementRetryCount; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("SeleniumUtiltiy.findElement :: Finding Element " + locator.toString() + " Try " + i);
                element = DriverManager.driver.findElement(locator);
                return element;
            } catch (NoSuchElementException | StaleElementReferenceException | InterruptedException e) {
                System.out.println("SeleniumUtiltiy.findElement ::" + e.getMessage());
                System.out.println("SeleniumUtiltiy.findElement :: Element Not Found");
            }
        }
        return element;
    }


    public static boolean verify_success_message(){

        return DriverManager.driver.getCurrentUrl().contains("thanks");
    }

    public static Boolean isElementAccessible(By locator) {
        WebElement element = findElement(locator);
        if (element == null) {
            System.out.println("SeleniumUtiltiy.isElementAccessible :: Element Not Accessible ");
            return false;
        }
        for (int i = 0; i < Constants.findElementRetryCount; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("SeleniumUtiltiy.isElementAccessible :: Accessing Element " + locator.toString() + " Try " + i);
                if (element.isDisplayed() && element.isEnabled()) {
                    System.out.println("SeleniumUtiltiy.isElementAccessible :: Element is Accessible");
                    return true;
                }
            } catch (NoSuchElementException | StaleElementReferenceException | InterruptedException e) {
                System.out.println("SeleniumUtiltiy.findElement ::" + e.getMessage());
                System.out.println("SeleniumUtiltiy.findElement :: Element Not Accessible");
            }
        }
        return false;
    }

    public static boolean verify_error_message_displayed(String field_label,String error_message_value){
        try{
            By.ByXPath error_message=new By.ByXPath(RegistrationFormPageObjects.error_message_xpath.replace("{TEXT_FIELD_LABEL}",field_label).replace("{ERROR_MESSAGE}",error_message_value));
            return isElementAccessible(error_message);
        }catch(Exception e){
            System.out.println("SeleniumUtiltiy.verify_error_message_displayed ::" + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public static void typeText(By locator, String value) {
        try {
            WebElement textBox = findElement(locator);
            textBox.clear();
            textBox.sendKeys(value);
            System.out.println("SeleniumUtiltiy.typeText :: Successful");
        } catch (Exception e) {
            System.out.println("SeleniumUtiltiy.typeText :: Failed " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void type_in_registration_form(String field_name,String value){
        try{
            By.ByXPath text_field=new By.ByXPath(RegistrationFormPageObjects.input_field_xpath.replace("{TEXT_FIELD_LABEL}",field_name));
            typeText(text_field,value);
        }catch(Exception e){
            System.out.println("SeleniumUtiltiy.type_in_registration_form :: Failed " + e.getMessage());
            e.printStackTrace();
        }

    }
    public static void click(By locator) {
        try {
            WebElement textBox = findElement(locator);
            textBox.click();
            System.out.println("SeleniumUtiltiy.click :: Successful");
        } catch (Exception e) {
            System.out.println("SeleniumUtiltiy.click :: Failed " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static Boolean select_by_visbleText(By locator, String value) {
        try {
            click(locator);
            Select dropDownList = new Select(findElement(locator));
            System.out.println("Options :: " + dropDownList.getOptions());
            dropDownList.selectByVisibleText(value);
            if (dropDownList.getFirstSelectedOption().getText().equalsIgnoreCase(value)) {
                System.out.println("SeleniumUtiltiy.select_by_visbleText :: Successful");
                return true;
            } else {
                System.out.println("SeleniumUtiltiy.select_by_visbleText :: Failed");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void read_excel() {
        hashData = ExcelUtil.getMapOfRows();
    }



}
