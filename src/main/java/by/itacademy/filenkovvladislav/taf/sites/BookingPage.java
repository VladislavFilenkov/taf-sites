package by.itacademy.filenkovvladislav.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingPage {
    private WebDriver driver;

    Util util = new Util();

    public BookingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void closePopUp() {
        WebElement popUp = driver.findElement(By.cssSelector("button[aria-label='Скрыть меню входа в аккаунт.']"));
        if (popUp != null) {
            popUp.click();
        }
    }

    public void clickSignInOrRegister() {
        driver.findElement(By.xpath("//*[@id='b2indexPage']/div[1]/div/header/nav[1]/div[2]/a[2]")).click();
    }

    public void inputCorrectEmailAddress(int numberOfLetters) {
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(util.generateRandomEmail(numberOfLetters));
    }

    public void inputIncorrectEmailAddress(int numberOfLetters) {
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(util.randomString(numberOfLetters));
    }

    public void clickButtonContinueWithEmail() {
        driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button")).click();
    }

    public void inputPassword(int numberOfLetters) {
        driver.findElement(By.xpath("//*[@id='new_password']")).sendKeys(util.generateRandomPassword(numberOfLetters));
    }

    public void clickButtonSignIn() {
        driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button")).click();
    }
}
