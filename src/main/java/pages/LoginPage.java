package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {

    /**Constructor*/
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**Web Elements*/
    By userNameId = By.xpath("(//input[@type='text'])[2]");
    By passwordId = By.xpath("//input[@type='password']");
    By loginButtonId = By.xpath("(//button[@type='submit'])[2]");
    By errorMessageUsernameXpath = By.xpath("(//div[@class='_39M2dM JB4AMj undefined']//span)[4]");
    By errorMessagePasswordXpath = By.xpath("(//div[@class='_39M2dM JB4AMj']//span)[8]");

    /**Page Methods
     * @throws InterruptedException */
    @Step("Login Step with username: {0}, password: {1}, for method: {method} step...----------1--")
    public LoginPage loginToApplication(String username, String password) throws InterruptedException {
    	Thread.sleep(5000);
        writeText(userNameId, username);
        Thread.sleep(5000);
        writeText(passwordId, password);
        Thread.sleep(5000);
        click(loginButtonId);
        return this;
    }

    //Verify Username Condition
    @Step("Verify username: {0} step...")
    public LoginPage verifyLoginUserName(String expectedText) throws InterruptedException {
    	 Thread.sleep(5000);
        waitVisibility(errorMessageUsernameXpath);
        Assert.assertEquals(readText(errorMessageUsernameXpath), expectedText);
        return this;
    }

    //Verify Password Condition
    @Step("Verify verifyLoginPassword: {0} step...")
    public LoginPage verifyLoginPassword(String expectedText) throws InterruptedException {
    	 Thread.sleep(5000);
        waitVisibility(errorMessageUsernameXpath);
        Assert.assertEquals(readText(errorMessageUsernameXpath), expectedText);
        return this;
    }
}