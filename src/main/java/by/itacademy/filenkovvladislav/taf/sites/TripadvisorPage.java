package by.itacademy.filenkovvladislav.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class TripadvisorPage {
    private WebDriver driver;

    public TripadvisorPage(WebDriver driver) {
        this.driver = driver;
    }

    String iframeSignInCssSelector = "body > div.VZmgo.D.X0.X1.Za.Ra > div > div.TocEc._Z.S2.H2._f.WHsPz > div > div > iframe";

    public WebElement getSignInOrRegister() {
        return driver.findElement(By.xpath("//*[@id='lithium-root']/header/div/nav/div/div[2]/a[3]"));
    }

    public WebElement getInputEmailAddress() {
        return driver.findElement(By.xpath("//*[@id='regSignIn.email']"));
    }

    public WebElement getButtonContinueWithEmail() {
        return driver.findElement(By.cssSelector("#ssoButtons > button"));
    }
    public WebElement getInputPassword() {
        return driver.findElement(By.xpath("//*[@id='regSignIn.password']"));
    }
    public WebElement getButtonSignIn() {
        return driver.findElement(By.xpath("//*[@id='regSignIn']/div[4]/button[1]"));
    }
}
