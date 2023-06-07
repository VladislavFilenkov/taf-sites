package by.itacademy.filenkovvladislav.taf.sites;

import by.itacademy.filenkovvladislav.taf.sites.alerts.PizzatempoAlerts;
import by.itacademy.filenkovvladislav.taf.sites.pages.PizzatempoPage;
import by.itacademy.filenkovvladislav.taf.sites.steps.PizzatempoStep;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PizzatempoTest {
    ChromeDriver driver;
    PizzatempoPage page;
    PizzatempoAlerts alerts;
    PizzatempoStep step;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        page = new PizzatempoPage(driver);
        alerts = new PizzatempoAlerts();
        step = new PizzatempoStep(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        step.preparatoryActions();
    }

    @Test
    public void testLoginWithEmptyEmailAndEmptyPassword() {
        step.fillLoginFormAndSubmit("", "");
        Assertions.assertEquals(page.getAlertText(), alerts.alertInvalidForm);
    }

    @Test
    public void testLoginWithIncorrectEmail() {
        step.fillLoginFormAndSubmit("email", "");
        Assertions.assertEquals(page.getAlertText(), alerts.alertInvalidForm);
    }

    @Test
    public void testLoginWithEmptyEmailAndAnyPassword() {
        step.fillLoginFormAndSubmit("", "cd6fv6frd");
        Assertions.assertEquals(page.getAlertText(), alerts.alertInvalidForm);
    }

    @Test
    public void testLoginWithCorrectEmailAndEmptyPassword() {
        step.fillLoginFormAndSubmit("test@mail.com", "");
        Assertions.assertEquals(page.getAlertText(), alerts.alertInvalidForm);
    }

    @Test
    public void testLoginWithCorrectEmailAndAnyPassword() {
        step.fillLoginFormAndSubmit("test@mail.com", "cd6fv6frd");
        Assertions.assertEquals(page.getAlertText(page.alertInvalidLogOrPwdLocator), alerts.alertInvalidLogOrPwd);
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
