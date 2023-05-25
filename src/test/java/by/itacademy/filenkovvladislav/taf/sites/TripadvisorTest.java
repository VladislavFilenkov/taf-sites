package by.itacademy.filenkovvladislav.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
        page.clickSignInOrRegister();
        page.switchToIframe();
        page.clickButtonContinueWithEmail();
    }

    @Test
    public void testLoginWithEmptyEmailAndEmptyPassword() {
        page.clickButtonSignIn();
    }

    @Test
    public void testLoginWithIncorrectEmail() {
        page.inputIncorrectEmailAddress(8);
        page.clickButtonSignIn();
    }

    @Test
    public void testLoginWithCorrectEmailAndEmptyPassword() {
        page.inputCorrectEmailAddress(8);
        page.clickButtonSignIn();
    }

    @Test
    public void testLoginWithCorrectEmailAndAnyPassword() {
        page.inputCorrectEmailAddress(8);
        page.inputPassword(8);
        page.clickButtonSignIn();
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
