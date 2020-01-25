package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    /**Constructor*/
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**Variables*/
    String baseURL = "https://www.flipkart.com/";

    /**Web Elements*/
    By loginButton = By.xpath("//a[text()='Login']");
    By popup = By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]");
    
    /**Page Methods*/
    //Go to Homepage
    @Step("Open application flifkart..-----------------1.")
    public HomePage launchApplication() {
        driver.get(baseURL);
        return this;
    }

    @Step("handle popup")
    public HomePage clickpopup() {
    	click(popup);
		return this;
    }
    
    
    //Go to LoginPage
    @Step("Go to Login Page Step..----------------1.")
    public LoginPage goToLoginPage() {
    	
        click(loginButton);
        return new LoginPage(driver);
    }
    
    @Step("git test.----------------1.")
    public HomePage demo() {
    	
        System.out.println("git test");
		return this;
    } 
    
}