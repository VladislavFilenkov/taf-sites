package by.itacademy.filenkovvladislav.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DominosPage {
    private WebDriver driver;
    Util util = new Util();

    public DominosPage(WebDriver driver) {
        this.driver = driver;
    }

    public void closePopUp() {
        WebElement popUp = driver.findElement(By.cssSelector("body > div.custom-modal.custom-modal--size-content.custom-modal--padding-none.custom-modal--bg-transparent > div.custom-modal__content-holder > button"));
        if (popUp != null) {
            popUp.click();
        }
    }

    public void clickSignIn() {
        driver.findElement(By.xpath("//*[@id='app-root']/div/div[1]/div[1]/div/div[4]/div/div/div[3]/button")).click();
    }

    public void inputCorrectEmailAddress(int numberOfLetters) {
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div[1]/input")).sendKeys(util.generateRandomEmail(numberOfLetters));
    }

    public void inputIncorrectEmailAddress(int numberOfLetters) {
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div[1]/input")).sendKeys(util.randomString(numberOfLetters));
    }

    public void inputPassword(int numberOfLetters) {
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div[2]/input")).sendKeys(util.generateRandomPassword(numberOfLetters));
    }

    public void clickButtonSignIn() {
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[2]/div[2]/div/form/div/button")).click();
    }
}
