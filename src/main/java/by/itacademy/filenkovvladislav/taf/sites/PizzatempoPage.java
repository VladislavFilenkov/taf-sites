package by.itacademy.filenkovvladislav.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PizzatempoPage {
    private WebDriver driver;
    Util util = new Util();

    public PizzatempoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputCorrectEmailAddress(int numberOfLetters) {
        driver.findElement(By.xpath("/html/body/div/div[1]/form/p[1]/input")).sendKeys(util.generateRandomEmail(numberOfLetters));
    }

    public void inputIncorrectEmailAddress(int numberOfLetters) {
        driver.findElement(By.xpath("/html/body/div/div[1]/form/p[1]/input")).sendKeys(util.randomString(numberOfLetters));
    }

    public void inputPassword(int numberOfLetters) {
        driver.findElement(By.xpath("/html/body/div/div[1]/form/p[2]/input[1]")).sendKeys(util.generateRandomPassword(numberOfLetters));
    }

    public void clickButtonSignIn() {
        driver.findElement(By.xpath("/html/body/div/div[1]/form/p[2]/input[2]")).click();
    }
}
