package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePage{
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath="//*[@id=\"content\"]/h1")
    WebElement welcomePageTitle;

    public WelcomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String validatePage()
    {
    return welcomePageTitle.getText();
    }
}
