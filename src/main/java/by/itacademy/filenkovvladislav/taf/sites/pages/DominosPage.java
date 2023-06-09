package by.itacademy.filenkovvladislav.taf.sites.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DominosPage {
    private WebDriver driver;

    private String baseUrl = "https://dominos.by/";
    private String popUpXpath = "//button[@data-test-type='close']";
    private String signInXpath = "//button[@data-test-type='login']";
    private String emailAddressByName = "email";
    private String passwordByName = "password";
    private String buttonSignInXpath = "//button[@type='submit' and @data-test='custom-button']";
    public String alertInvalidLogOrPwdLocator = "//div[@class='notification__content']";

    public DominosPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openWebSite() {
        driver.get(baseUrl);
    }

    public void closePopUp() {
        WebElement popUp = driver.findElement(By.xpath(popUpXpath));
        if (popUp != null) {
            popUp.click();
        }
    }

    public void clickSignIn() {
        driver.findElement(By.xpath(signInXpath)).click();
    }

    public void inputEmailAddress(String email) {
        driver.findElement(By.name(emailAddressByName)).sendKeys(email);
    }

    public void inputPassword(String password) {
        driver.findElement(By.name(passwordByName)).sendKeys(password);
    }

    public void clickButtonSignIn() {
        driver.findElement(By.xpath(buttonSignInXpath)).click();
    }

    public String getAlertText(String locator) {
        WebElement alertText = driver.findElement(By.xpath(locator));
        return alertText.getText();
    }
}
