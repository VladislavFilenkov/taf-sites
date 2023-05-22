package by.itacademy.filenkovvladislav.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TripadvisorTest {
    ChromeDriver driver;
    TripadvisorPage page;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        page = new TripadvisorPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tripadvisor.com");
        page.getSignInOrRegister().click();
        driver.switchTo().frame(driver.findElement(By.cssSelector(page.iframeSignInCssSelector)));
        page.getButtonContinueWithEmail().click();
    }

    @Test
    public void testLoginWithEmptyEmailAndPassword() {
        page.getButtonSignIn().click();
    }

    @Test
    public void testLoginWithIncorrectEmail() {
        page.getInputEmailAddress().sendKeys("email");
        page.getButtonSignIn().click();
    }

    @Test
    public void testLoginWithCorrectEmailAndEmptyPassword() {
        page.getInputEmailAddress().sendKeys("test@mail.com");
        page.getButtonSignIn().click();
    }

    @Test
    public void testLoginWithCorrectEmailAndAnyPassword() {
        page.getInputEmailAddress().sendKeys("test@mail.com");
        page.getInputPassword().sendKeys("fgfhj134jj7");
        page.getButtonSignIn().click();
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
