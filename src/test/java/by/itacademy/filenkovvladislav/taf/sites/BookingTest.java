package by.itacademy.filenkovvladislav.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingTest {
    ChromeDriver driver;
    BookingStep step;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        step = new BookingStep(driver);
        step.preparatoryActions();
    }

    @Test
    public void testLoginWithEmptyEmail() {
        step.fillEmailAddressAndSubmit("");
    }

    @Test
    public void testLoginWithIncorrectEmail() {
        step.fillEmailAddressAndSubmit("email");
    }

    @Test
    public void testLoginWithCorrectEmail() {
        step.fillEmailAddressAndSubmit("test@mail.com");
    }

    @Test
    public void testLoginWithCorrectEmailAndEmptyPassword() {
        step.fillLoginFormAndSubmit("test@mail.com", "");
    }

    @Test
    public void testLoginWithCorrectEmailAndAnyPassword() {
        step.fillLoginFormAndSubmit("test@mail.com", "asdfg234");
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
