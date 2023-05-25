package by.itacademy.filenkovvladislav.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BookingTest {
    ChromeDriver driver;
    BookingPage page;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        page = new BookingPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.booking.com");
        page.closePopUp();
        page.clickSignInOrRegister();
    }

    @Test
    public void testLoginWithEmptyEmail() {
        page.clickButtonContinueWithEmail();
    }

    @Test
    public void testLoginWithIncorrectEmail() {
        page.inputIncorrectEmailAddress(8);
        page.clickButtonContinueWithEmail();
    }

    @Test
    public void testLoginWithCorrectEmail() {
        page.inputCorrectEmailAddress(8);
        page.clickButtonContinueWithEmail();
    }

    @Test
    public void testLoginWithCorrectEmailAndEmptyPassword() {
        page.inputCorrectEmailAddress(8);
        page.clickButtonContinueWithEmail();
        page.clickButtonSignIn();
    }

    @Test
    public void testLoginWithCorrectEmailAndAnyPassword() {
        page.inputCorrectEmailAddress(8);
        page.clickButtonContinueWithEmail();
        page.inputPassword(8);
        page.clickButtonSignIn();
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
