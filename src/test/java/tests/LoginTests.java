package tests;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.Listeners.TestListener;

//In order to eliminate attachment problem for Allure, you should add @Listener line.
//link: https://github.com/allure-framework/allure1/issues/730
@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Login Tests")
public class LoginTests extends BaseTest {

    //Test Data
    String wrongUsername = "onur@swtestacademy.com";
    String wrongPassword = "11122233444";

    @Test (priority = 0, description="  test -----------------Invalid Login Scenario with wrong username and password.")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description-------: Login test with wrong username and wrong password.")
    @Story("Story------------Invalid username and password login test")
    public void invalidLoginTest_InvalidUserNameInvalidPassword () throws InterruptedException {
        homePage
            .launchApplication()
            .clickpopup()
            .goToLoginPage()
            .loginToApplication(wrongUsername, wrongPassword);
            
    }
//.verifyLoginPassword("Please enter valid Email ID/Mobile number");
    
    @Test (priority = 1, description="Invalid Login Scenario with empty username and password.")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test Description: Login test with empty username and empty password.")
    @Story("Empty username and password login test")
    public void invalidLoginTest_EmptyUserEmptyPassword () throws InterruptedException {
        homePage
            .launchApplication()
            .goToLoginPage()
            .loginToApplication("", "");
            
    }
    //.verifyLoginUserName("Please enter valid Email ID/Mobile number")
    //.verifyLoginPassword("Please enter valid Email ID/Mobile number");
}