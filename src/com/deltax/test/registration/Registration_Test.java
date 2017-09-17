package com.deltax.test.registration;

import com.deltax.utility.Constants;
import com.deltax.utility.DriverManager;
import com.deltax.utility.RegistrationFormPageObjects;
import com.deltax.utility.SeleniumUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import org.openqa.selenium.support.ui.Select;
import java.util.HashMap;

public class Registration_Test {

   WebDriver driver=null;
   HashMap<String,HashMap<String,String>> test_data=null;

    @BeforeMethod
    public void set_up(){
        DriverManager.getDriver();
        test_data=DriverManager.getTestData();
        System.out.println("Calling Before Test");
        DriverManager.driver.get(Constants.AUT_URL);
    }


    @AfterMethod
    public void tear_down(){
        DriverManager.kill_driver();
        System.out.println("Calling After Test");
    }


    @Test
    public void DeltaX_Registration_001(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_001");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_success_message());
    }


    @Test
    public void DeltaX_Registration_002(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_002");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_success_message());
    }


    @Test
    public void DeltaX_Registration_003(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_003");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_error_message_displayed(RegistrationFormPageObjects.label_first_name,RegistrationFormPageObjects.err_mandatory_first_name));
    }


    @Test
    public void DeltaX_Registration_004(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_004");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_error_message_displayed(RegistrationFormPageObjects.label_first_name,RegistrationFormPageObjects.invalid_first_name));
    }


    @Test
    public void DeltaX_Registration_005(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_005");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_error_message_displayed(RegistrationFormPageObjects.label_last_name,RegistrationFormPageObjects.err_mandatory_last_name));
    }


    @Test
    public void DeltaX_Registration_006(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_006");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_success_message());
    }


    @Test
    public void DeltaX_Registration_007(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_007");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_error_message_displayed(RegistrationFormPageObjects.label_last_name,RegistrationFormPageObjects.invalid_last_name));
    }


    @Test
    public void DeltaX_Registration_008(){
        Assert.assertTrue(new Select(SeleniumUtility.findElement(RegistrationFormPageObjects.department_list)).getFirstSelectedOption().getText().contains("Select"));
    }


    @Test
    public void DeltaX_Registration_009(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_009");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_success_message());
    }


    @Test
    public void DeltaX_Registration_010(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_010");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_success_message());
    }



    @Test
    public void DeltaX_Registration_011(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_011");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_success_message());
    }


    @Test
    public void DeltaX_Registration_012(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_012");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_error_message_displayed(RegistrationFormPageObjects.label_username,RegistrationFormPageObjects.err_mandatory_username));
    }


    @Test
    public void DeltaX_Registration_013(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_013");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_error_message_displayed(RegistrationFormPageObjects.label_username,RegistrationFormPageObjects.invalid_user_name));
    }


    @Test
    public void DeltaX_Registration_014(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_014");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_error_message_displayed(RegistrationFormPageObjects.label_username,RegistrationFormPageObjects.invalid_user_name));
    }


    @Test
    public void DeltaX_Registration_015(){

        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_015");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_success_message());
    }



    @Test
    public void DeltaX_Registration_016(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_016");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        String passwordText=SeleniumUtility.findElement(By.name("user_password")).getText();
        Assert.assertTrue(passwordText.length()==0);
    }


    @Test
    public void DeltaX_Registration_017(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_017");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_success_message());
    }


    @Test
    public void DeltaX_Registration_018(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_018");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_success_message()==false);
    }


    @Test
    public void DeltaX_Registration_019(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_019");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_success_message());
    }


    @Test
    public void DeltaX_Registration_020(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_020");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_error_message_displayed(RegistrationFormPageObjects.label_email,RegistrationFormPageObjects.invalid_email));
    }


    @Test
    public void DeltaX_Registration_021(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_021");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_error_message_displayed(RegistrationFormPageObjects.label_email,RegistrationFormPageObjects.invalid_email));
    }


    @Test
    public void DeltaX_Registration_022(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_022");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_success_message());
    }


    @Test
    public void DeltaX_Registration_023(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_023");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_success_message());
    }


    @Test
    public void DeltaX_Registration_024(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_024");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_contact_no,test_data_map.get("ContactNo"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_error_message_displayed(RegistrationFormPageObjects.label_contact_no,RegistrationFormPageObjects.invalid_user_name));
    }


    @Test
    public void DeltaX_Registration_025(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_025");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_last_name,test_data_map.get("LastName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        SeleniumUtility.click(RegistrationFormPageObjects.submit_button);
        Assert.assertTrue(SeleniumUtility.verify_success_message());
    }


    @Test
    public void DeltaX_Registration_026(){
        HashMap<String,String> test_data_map=test_data.get("DeltaX_Registration_025");
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_first_name,test_data_map.get("FirstName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_username,test_data_map.get("UserName"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_password,test_data_map.get("Password"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_confirm_password,test_data_map.get("ConfirmPassword"));
        SeleniumUtility.type_in_registration_form(RegistrationFormPageObjects.label_email,test_data_map.get("Email"));
        SeleniumUtility.select_by_visbleText(RegistrationFormPageObjects.department_list,test_data_map.get("Department"));
        Assert.assertTrue(SeleniumUtility.findElement(RegistrationFormPageObjects.submit_button).isEnabled()==false);
    }





}
