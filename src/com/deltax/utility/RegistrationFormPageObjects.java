package com.deltax.utility;

import org.openqa.selenium.By;


public class RegistrationFormPageObjects {


    public static String input_field_xpath="//div[@class='form-group has-feedback' and label[contains(text(),'{TEXT_FIELD_LABEL}')]]//input";
    public static By.ByName department_list= new By.ByName("department");
    public static By.ByXPath submit_button=new By.ByXPath("//button[@type='submit']");
    public static String department_option_xpath="//select[@name='department']/option[text()='{OPTION_TEXT}']";
    public static String error_message_xpath="//div[contains(@class,'form-group has-feedback') and label[contains(text(),'{TEXT_FIELD_LABEL}')]]//small[text()='{ERROR_MESSAGE}']";


    //Labels on the page

    public static final String label_first_name="First Name";
    public static final String label_last_name="Last Name";
    public static final String label_username="Username";
    public static final String label_password="Password";
    public static final String label_confirm_password="Confirm Password";
    public static final String label_email="E-Mail";
    public static final String label_contact_no="Contact No";

    //Values for Department Drop Down

    public static final String value_default="Select your Department/Office";
    public static final String value_engineering="Engineering";
    public static final String value_marketing="Marketing";
    public static final String value_sales="Sales";
    public static final String value_support="Support";

    //Error Messages

    public static final String err_mandatory_first_name="Please enter your First Name";
    public static final String err_mandatory_last_name="Please enter your Last Name";
    public static final String err_mandatory_username="Please enter your Username";
    public static final String invalid_first_name="This value is not valid";
    public static final String invalid_last_name="This value is not valid";
    public static final String invalid_user_name="This value is not valid";
    public static final String invalid_password="This value is not valid";
    public static final String err_mandatory_password="Please enter your Password";
    public static final String err_mandatory_confirm_password="Please confirm your Password";
    public static final String invalid_confirm_password="This value is not valid";
    public static final String err_mandatory_email="Please enter your Email Address";
    public static final String invalid_email="This value is not valid";

}
