package by.itacademy.filenkovvladislav.taf.sites.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzatempoPage {
    private WebDriver driver;
    private String baseUrl = "https://www.pizzatempo.by/";
    private String emailAddressName = "astroauth_login";
    private String passwordName = "astroauth_pass";
    private String buttonSignInName = "astroauth_submit";
    public String alertInvalidLogOrPwdLocator = "//div[@class='popupContent']";

    public PizzatempoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openWebSite() {
        driver.get(baseUrl);
    }

    public void inputEmailAddress(String email) {
        driver.findElement(By.name(emailAddressName)).sendKeys(email);
    }

    public void inputPassword(String password) {
        driver.findElement(By.name(passwordName)).sendKeys(password);
    }

    public void clickButtonSignIn() {
        driver.findElement(By.name(buttonSignInName)).click();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public String getAlertText(String locator) {
        WebElement alertText = driver.findElement(By.xpath(locator));
        return alertText.getText();
    }
}
