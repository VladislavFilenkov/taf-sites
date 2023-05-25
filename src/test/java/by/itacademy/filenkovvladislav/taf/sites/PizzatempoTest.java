package by.itacademy.filenkovvladislav.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PizzatempoTest {
    ChromeDriver driver;
    PizzatempoPage page;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        page = new PizzatempoPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.pizzatempo.by/");
    }

    @Test
    public void testLoginWithEmptyEmailAndEmptyPassword() {
        page.clickButtonSignIn();
    }

    @Test
    public void testLoginWithIncorrectEmail() {
        page.inputIncorrectEmailAddress(8);
        page.clickButtonSignIn();
    }

    @Test
    public void testLoginWithEmptyEmailAndAnyPassword() {
        page.inputPassword(8);
        page.clickButtonSignIn();
    }

    @Test
    public void testLoginWithCorrectEmailAndEmptyPassword() {
        page.inputCorrectEmailAddress(8);
        page.clickButtonSignIn();
    }

    @Test
    public void testLoginWithCorrectEmailAndAnyPassword() {
        page.inputCorrectEmailAddress(8);
        page.inputPassword(8);
        page.clickButtonSignIn();
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
