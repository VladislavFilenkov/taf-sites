package by.itacademy.filenkovvladislav.taf.sites;

import by.itacademy.filenkovvladislav.taf.sites.alerts.BookingAlerts;
import by.itacademy.filenkovvladislav.taf.sites.pages.BookingPage;
import by.itacademy.filenkovvladislav.taf.sites.steps.BookingStep;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BookingTest {
    ChromeDriver driver;
    BookingPage page;
    BookingAlerts alerts;
    BookingStep step;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        alerts = new BookingAlerts();
        page = new BookingPage(driver);
        step = new BookingStep(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        step.preparatoryActions();
    }

    @Test
    public void testLoginWithEmptyEmail() {
        step.fillEmailAddressAndSubmit("");
        Assertions.assertEquals(page.getAlertText(page.alertEmailId), alerts.alertEmptyEmail);
    }

    @Test
    public void testLoginWithIncorrectEmail() {
        step.fillEmailAddressAndSubmit("email");
        Assertions.assertEquals(page.getAlertText(page.alertEmailId), alerts.alertIncorrectEmail);
    }

    @Test
    public void testLoginWithCorrectEmail() {
        step.fillEmailAddressAndSubmit("test@mail.com");
    }

    @Test
    public void testLoginWithCorrectEmailAndEmptyPassword() {
        step.fillLoginFormAndSubmit("test@mail.com", "");
        Assertions.assertEquals(page.getAlertText(page.alertPasswordId), alerts.alertEmptyPassword);
    }

    @Test
    public void testLoginWithCorrectEmailAndAnyPassword() {
        step.fillLoginFormAndSubmit("test@mail.com", "asdfg234");
        Assertions.assertEquals(page.getAlertText(page.alertPasswordId), alerts.alertNoCombination);
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
