package by.itacademy.filenkovvladislav.taf.sites;

import org.openqa.selenium.WebDriver;

public class PizzatempoStep {
    PizzatempoPage page;

    public PizzatempoStep(WebDriver driver) {
        page = new PizzatempoPage(driver);
    }

    public void preparatoryActions() {
        page.enableImplicitlyWait();
        page.openWebSite();
    }

    public void fillLoginFormAndSubmit(String email, String password) {
        page.inputEmailAddress(email);
        page.inputPassword(password);
        page.clickButtonSignIn();
    }

}
