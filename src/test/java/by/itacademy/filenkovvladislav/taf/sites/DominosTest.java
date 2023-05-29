package by.itacademy.filenkovvladislav.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosTest {
    ChromeDriver driver;
    DominosStep step;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        step = new DominosStep(driver);
        step.preparatoryActions();
    }

    @Test
    public void testLoginWithIncorrectEmailAndAnyPassword() {
        step.fillLoginFormAndSubmit("email", "3edc4f");
    }

    @Test
    public void testLoginWithCorrectEmailAndAnyPassword() {
        step.fillLoginFormAndSubmit("test@mail.com", "3edc4f");
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
