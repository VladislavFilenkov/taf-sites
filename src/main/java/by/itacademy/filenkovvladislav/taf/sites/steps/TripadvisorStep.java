package by.itacademy.filenkovvladislav.taf.sites.steps;

import by.itacademy.filenkovvladislav.taf.sites.pages.TripadvisorPage;
import org.openqa.selenium.WebDriver;

public class TripadvisorStep {
    TripadvisorPage page;

    public TripadvisorStep(WebDriver driver) {
        page = new TripadvisorPage(driver);
    }

    public void preparatoryActions() {
        page.openWebSite();
        page.clickSignInOrRegister();
        page.switchToIframe();
        page.clickButtonContinueWithEmail();
    }

    public void fillLoginFormAndSubmit(String email, String password) {
        page.inputEmailAddress(email);
        page.inputPassword(password);
        page.clickButtonSignIn();
    }
}
