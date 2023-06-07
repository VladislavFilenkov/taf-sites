package by.itacademy.filenkovvladislav.taf.sites.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TripadvisorPage {
    private WebDriver driver;
    private String baseUrl = "https://www.tripadvisor.com";
    private String switchToIframeXpath = "//iframe[@title='regcontroller']";
    private String signInOrRegisterXpath = "//span[text()='Sign in']";
    private String buttonContinueWithEmailXpath = "//span[text()='Continue with email']";
    private String emailAddressId = "regSignIn.email";
    private String passwordId = "regSignIn.password";
    private String buttonSignInXpath = "//*[@id='regSignIn']//button[text()='Sign in']";
    public String alertLocator = "//div[@class='body_text']";
    public String alertInvalidLogOrPwdLocator = "//*[@id='regErrors']//li";

    public TripadvisorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openWebSite() {
        driver.get(baseUrl);
    }

    public void switchToIframe() {
        driver.switchTo().frame(driver.findElement(By.xpath(switchToIframeXpath)));
    }

    public void clickSignInOrRegister() {
        driver.findElement(By.xpath(signInOrRegisterXpath)).click();
    }

    public void inputEmailAddress(String email) {
        driver.findElement(By.id(emailAddressId)).sendKeys(email);
    }

    public void clickButtonContinueWithEmail() {
        driver.findElement(By.xpath(buttonContinueWithEmailXpath)).click();
    }

    public void inputPassword(String password) {
        driver.findElement(By.id(passwordId)).sendKeys(password);
    }

    public void clickButtonSignIn() {
        driver.findElement(By.xpath(buttonSignInXpath)).click();
    }
    public String getAlertText(String locator) {
        WebElement alertText = driver.findElement(By.xpath(locator));
        return alertText.getText();
    }
}
