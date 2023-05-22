package by.itacademy.filenkovvladislav.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DominosTest {
    ChromeDriver driver;
    DominosPage page;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        page = new DominosPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://dominos.by/");
        if (page.closePopUp() != null) {
            page.closePopUp().click();
        }
        page.getSignIn().click();
    }

    @Test
    public void testLoginWithIncorrectEmailAndAnyPassword() {
        page.getInputEmailAddress().sendKeys("email");
        page.getInputPassword().sendKeys("fgfhj134jj7");
        page.getButtonSignIn().click();
    }

    @Test
    public void testLoginWithCorrectEmailAndAnyPassword() {
        page.getInputEmailAddress().sendKeys("test@mail.com");
        page.getInputPassword().sendKeys("fgfhj134jj7");
        page.getButtonSignIn().click();
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
