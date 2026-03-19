package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By email = By.id("username");
    By password = By.id("password");
    By signInBtn = By.xpath("//button[@type='submit']");
    By errorMsg = By.xpath("//div[@role='alert']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String userEmail) {
        driver.findElement(email).sendKeys(userEmail);
    }

    public void enterPassword(String userPassword) {
        driver.findElement(password).sendKeys(userPassword);
    }

    public void clickSignIn() {
        driver.findElement(signInBtn).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMsg).getText();
    }
}
