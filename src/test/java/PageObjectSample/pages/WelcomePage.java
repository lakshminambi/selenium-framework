package PageObjectSample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
    WebDriver driver;
    @FindBy(xpath = "//html//body//table//tbody//tr//td//table//tbody//tr[3]//td")
    WebElement welcomeMsg;

    public WelcomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public String getWelcomeMsg()
    {
        return welcomeMsg.getText();
    }
}
