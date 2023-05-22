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
        if (page.closePopUp() != null) {
            page.closePopUp().click();
        }
        page.getSignInOrRegister().click();
    }

    @Test
    public void testLoginWithEmptyEmail() {
        page.getButtonContinueWithEmail().click();
    }

    @Test
    public void testLoginWithIncorrectEmail() {
        page.getInputEmailAddress().sendKeys("email");
        page.getButtonContinueWithEmail().click();
    }

    @Test
    public void testLoginWithCorrectEmail() {
        page.getInputEmailAddress().sendKeys("test@mail.com");
        page.getButtonContinueWithEmail().click();
    }

    @Test
    public void testLoginWithCorrectEmailAndEmptyPassword() {
        page.getInputEmailAddress().sendKeys("test@mail.com");
        page.getButtonContinueWithEmail().click();
        page.getButtonSignIn().click();
    }

    @Test
    public void testLoginWithCorrectEmailAndAnyPassword() {
        page.getInputEmailAddress().sendKeys("test@mail.com");
        page.getButtonContinueWithEmail().click();
        page.getInputPassword().sendKeys("fgfhj134jj7");
        page.getButtonSignIn().click();
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
