package by.itacademy.filenkovvladislav.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosTest {
    ChromeDriver driver;
    Util util;
    DominosStep step;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        util = new Util();
        step = new DominosStep(driver);
        step.preparatoryActions();
    }

    @Test
    public void testLoginWithIncorrectEmailAndAnyPassword() {
        step.fillLoginFormAndSubmit(util.randomIncorrectEmail, util.randomPassword);
    }

    @Test
    public void testLoginWithCorrectEmailAndAnyPassword() {
        step.fillLoginFormAndSubmit(util.randomCorrectEmail, util.randomPassword);
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
