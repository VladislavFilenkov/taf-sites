package by.itacademy.filenkovvladislav.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingPage {
    private WebDriver driver;
    private String popUpXpath = "//button[@aria-label='Скрыть меню входа в аккаунт.']";
    private String signInOrRegisterXpath = "//a[@data-testid='header-sign-up-button']";
    private String emailAddressName = "username";
    private String buttonContinueWithEmailXpath = "//button[@type='submit']";
    private String passwordId = "password";
    private String buttonSignInXpath = "//button[@type='submit']";

    public BookingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openWebSite() {
        driver.get("https://www.booking.com");
    }

    public void closePopUp() {
        WebElement popUp = driver.findElement(By.xpath(popUpXpath));
        if (popUp != null) {
            popUp.click();
        }
    }

    public void clickSignInOrRegister() {
        driver.findElement(By.xpath(signInOrRegisterXpath)).click();
    }

    public void inputEmailAddress(String email) {
        driver.findElement(By.name(emailAddressName)).sendKeys(email);
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
}
