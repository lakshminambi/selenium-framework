package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ABTestingPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath="/html/body/div[2]/div/ul/li[1]/a")
    WebElement clickABLink;

    public ABTestingPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickABTesting()
    {
        clickABLink.click();
    }
}
