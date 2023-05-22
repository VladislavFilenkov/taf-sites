package by.itacademy.filenkovvladislav.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class PizzatempoPage {
    private WebDriver driver;

    public PizzatempoPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getInputEmailAddress() {
        return driver.findElement(By.xpath("/html/body/div/div[1]/form/p[1]/input"));
    }

    public WebElement getInputPassword() {
        return driver.findElement(By.xpath("/html/body/div/div[1]/form/p[2]/input[1]"));
    }

    public WebElement getButtonSignIn() {
        return driver.findElement(By.xpath("/html/body/div/div[1]/form/p[2]/input[2]"));
    }
}
