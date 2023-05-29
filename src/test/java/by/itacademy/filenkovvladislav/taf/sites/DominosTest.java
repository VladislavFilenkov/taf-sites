package by.itacademy.filenkovvladislav.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DominosTest {
    ChromeDriver driver;
    DominosStep step;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
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
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
