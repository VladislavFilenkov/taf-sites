package by.itacademy.filenkovvladislav.taf.sites.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PizzatempoPage {
    private WebDriver driver;
    private String emailAddressName = "astroauth_login";
    private String passwordName = "astroauth_pass";
    private String buttonSignInName = "astroauth_submit";

    public PizzatempoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openWebSite() {
        driver.get("https://www.pizzatempo.by/");
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
}
