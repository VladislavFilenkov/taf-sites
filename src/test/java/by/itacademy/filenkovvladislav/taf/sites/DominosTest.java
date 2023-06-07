package by.itacademy.filenkovvladislav.taf.sites;

import by.itacademy.filenkovvladislav.taf.sites.alerts.DominosAlerts;
import by.itacademy.filenkovvladislav.taf.sites.pages.DominosPage;
import by.itacademy.filenkovvladislav.taf.sites.steps.DominosStep;
import by.itacademy.filenkovvladislav.taf.sites.utils.Util;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DominosTest {
    ChromeDriver driver;
    DominosPage page;
    DominosAlerts alerts;
    DominosStep step;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        page = new DominosPage(driver);
        alerts = new DominosAlerts();
        step = new DominosStep(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        step.preparatoryActions();
    }

    @Test
    public void testLoginWithIncorrectEmailAndAnyPassword() {
        step.fillLoginFormAndSubmit(Util.randomIncorrectEmail(), Util.randomPassword());
    }

    @Test
    public void testLoginWithCorrectEmailAndAnyPassword() {
        step.fillLoginFormAndSubmit(Util.randomCorrectEmail(), Util.randomPassword());
        Assertions.assertEquals(page.getAlertText(page.alertInvalidLogOrPwdLocator), alerts.alertInvalidLogOrPwd);
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
