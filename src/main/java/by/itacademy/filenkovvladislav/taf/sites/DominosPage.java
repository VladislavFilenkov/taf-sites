package by.itacademy.filenkovvladislav.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DominosPage {
    private WebDriver driver;

    public DominosPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement closePopUp() {
        return driver.findElement(By.cssSelector("body > div.custom-modal.custom-modal--size-content.custom-modal--padding-none.custom-modal--bg-transparent > div.custom-modal__content-holder > button"));
    }

    public WebElement getSignIn() {
        return driver.findElement(By.xpath("//*[@id='app-root']/div/div[1]/div[1]/div/div[4]/div/div/div[3]/button"));
    }

    public WebElement getInputEmailAddress() {
        return driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div[1]/input"));
    }

    public WebElement getInputPassword() {
        return driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div[2]/input"));
    }

    public WebElement getButtonSignIn() {
        return driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[2]/div[2]/div/form/div/button"));
    }
}
