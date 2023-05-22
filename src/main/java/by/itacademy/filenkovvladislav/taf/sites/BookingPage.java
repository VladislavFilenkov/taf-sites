package by.itacademy.filenkovvladislav.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingPage {
    private WebDriver driver;

    public BookingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement closePopUp() {
        return driver.findElement(By.cssSelector("button[aria-label='Скрыть меню входа в аккаунт.']"));
    }

    public WebElement getSignInOrRegister() {
        return driver.findElement(By.xpath("//*[@id='b2indexPage']/div[1]/div/header/nav[1]/div[2]/a[2]"));
    }

    public WebElement getInputEmailAddress() {
        return driver.findElement(By.xpath("//*[@id='username']"));
    }

    public WebElement getButtonContinueWithEmail() {
        return driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button"));
    }
    public WebElement getInputPassword() {
        return driver.findElement(By.xpath("//*[@id='password']"));
    }
    public WebElement getButtonSignIn() {
        return driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[2]/button"));
    }
}
