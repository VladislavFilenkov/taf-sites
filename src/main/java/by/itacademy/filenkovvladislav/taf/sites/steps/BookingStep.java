package by.itacademy.filenkovvladislav.taf.sites.steps;

import by.itacademy.filenkovvladislav.taf.sites.pages.BookingPage;
import org.openqa.selenium.WebDriver;

public class BookingStep {
    BookingPage page;

    public BookingStep(WebDriver driver) {
        page = new BookingPage(driver);
    }

    public void preparatoryActions() {
        page.openWebSite();
        page.closePopUp();
        page.clickSignInOrRegister();
    }

    public void fillEmailAddressAndSubmit(String email) {
        page.inputEmailAddress(email);
        page.clickButtonContinueWithEmail();
    }

    public void fillLoginFormAndSubmit(String email, String password) {
        page.inputEmailAddress(email);
        page.clickButtonContinueWithEmail();
        page.inputPassword(password);
        page.clickButtonSignIn();
    }
}
