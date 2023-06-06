package by.itacademy.filenkovvladislav.taf.sites.steps;

import by.itacademy.filenkovvladislav.taf.sites.pages.DominosPage;
import org.openqa.selenium.WebDriver;

public class DominosStep {
    DominosPage page;

    public DominosStep(WebDriver driver) {
        page = new DominosPage(driver);
    }

    public void preparatoryActions() {
        page.openWebSite();
        page.closePopUp();
        page.clickSignIn();
    }
    public void fillLoginFormAndSubmit(String email, String password) {
        page.inputEmailAddress(email);
        page.inputPassword(password);
        page.clickButtonSignIn();
    }
}
