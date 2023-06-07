package by.itacademy.filenkovvladislav.taf.sites;

import by.itacademy.filenkovvladislav.taf.sites.alerts.TripadvisorAlerts;
import by.itacademy.filenkovvladislav.taf.sites.pages.TripadvisorPage;
import by.itacademy.filenkovvladislav.taf.sites.steps.TripadvisorStep;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TripadvisorTest {
    ChromeDriver driver;
    TripadvisorPage page;
    TripadvisorAlerts alerts;
    TripadvisorStep step;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        page = new TripadvisorPage(driver);
        alerts = new TripadvisorAlerts();
        step = new TripadvisorStep(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        step.preparatoryActions();
    }

    @Test
    public void testLoginWithEmptyEmailAndEmptyPassword() {
        step.fillLoginFormAndSubmit("", "");
        Assertions.assertEquals(page.getAlertText(page.alertLocator), alerts.alertEmptyEmail);

    }

    @Test
    public void testLoginWithIncorrectEmail() {
        step.fillLoginFormAndSubmit("email", "");
        Assertions.assertEquals(page.getAlertText(page.alertLocator), alerts.alertIncorrectEmail);
    }

    @Test
    public void testLoginWithCorrectEmailAndEmptyPassword() {
        step.fillLoginFormAndSubmit("test@mail.com", "");
        Assertions.assertEquals(page.getAlertText(page.alertLocator), alerts.alertEmptyPassword);
    }

    @Test
    public void testLoginWithCorrectEmailAndAnyPassword() {
        step.fillLoginFormAndSubmit("test@mail.com", "fvsd76f");
        Assertions.assertEquals(page.getAlertText(page.alertInvalidLogOrPwdLocator), alerts.alertInvalidLogOrPwd);
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
