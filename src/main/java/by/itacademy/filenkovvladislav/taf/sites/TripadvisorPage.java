package by.itacademy.filenkovvladislav.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TripadvisorPage {
    private WebDriver driver;
    Util util = new Util();

    public TripadvisorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToIframe() {
        driver.switchTo().frame(driver.findElement(By.cssSelector("body > div.VZmgo.D.X0.X1.Za.Ra > div > div.TocEc._Z.S2.H2._f.WHsPz > div > div > iframe")));
    }

    public void clickSignInOrRegister() {
        driver.findElement(By.xpath("//*[@id='lithium-root']/header/div/nav/div/div[2]/a[3]")).click();
    }

    public void inputCorrectEmailAddress(int numberOfLetters) {
        driver.findElement(By.xpath("//*[@id='regSignIn.email']")).sendKeys(util.generateRandomEmail(numberOfLetters));
    }

    public void inputIncorrectEmailAddress(int numberOfLetters) {
        driver.findElement(By.xpath("//*[@id='regSignIn.email']")).sendKeys(util.randomString(numberOfLetters));
    }

    public void clickButtonContinueWithEmail() {
        driver.findElement(By.cssSelector("#ssoButtons > button")).click();
    }

    public void inputPassword(int numberOfLetters) {
        driver.findElement(By.xpath("//*[@id='regSignIn.password']")).sendKeys(util.generateRandomPassword(numberOfLetters));
    }

    public void clickButtonSignIn() {
        driver.findElement(By.xpath("//*[@id='regSignIn']/div[4]/button[1]")).click();
    }
}
