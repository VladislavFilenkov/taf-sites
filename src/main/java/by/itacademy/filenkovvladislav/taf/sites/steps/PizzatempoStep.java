package by.itacademy.filenkovvladislav.taf.sites.steps;

import by.itacademy.filenkovvladislav.taf.sites.pages.PizzatempoPage;
import org.openqa.selenium.WebDriver;

public class PizzatempoStep {
    PizzatempoPage page;

    public PizzatempoStep(WebDriver driver) {
        page = new PizzatempoPage(driver);
    }

    public void preparatoryActions() {
        page.openWebSite();
    }

    public void fillLoginFormAndSubmit(String email, String password) {
        page.inputEmailAddress(email);
        page.inputPassword(password);
        page.clickButtonSignIn();
    }

}
