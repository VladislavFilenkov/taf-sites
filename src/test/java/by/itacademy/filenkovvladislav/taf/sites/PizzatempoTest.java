package by.itacademy.filenkovvladislav.taf.sites;

import by.itacademy.filenkovvladislav.taf.sites.steps.PizzatempoStep;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PizzatempoTest {
    ChromeDriver driver;
    PizzatempoStep step;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        step = new PizzatempoStep(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        step.preparatoryActions();
    }

    @Test
    public void testLoginWithEmptyEmailAndEmptyPassword() {
        step.fillLoginFormAndSubmit("", "");
    }

    @Test
    public void testLoginWithIncorrectEmail() {
        step.fillLoginFormAndSubmit("email", "");
    }

    @Test
    public void testLoginWithEmptyEmailAndAnyPassword() {
        step.fillLoginFormAndSubmit("", "cd6fv6frd");
    }

    @Test
    public void testLoginWithCorrectEmailAndEmptyPassword() {
        step.fillLoginFormAndSubmit("test@mail.com", "");
    }

    @Test
    public void testLoginWithCorrectEmailAndAnyPassword() {
        step.fillLoginFormAndSubmit("test@mail.com", "cd6fv6frd");
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
