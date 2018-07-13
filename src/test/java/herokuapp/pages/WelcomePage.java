package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage<C extends WelcomePage> {
    WebDriver driver;
    @FindBy(linkText = "checkboxes")
    WebElement checkBoxLink;

    public WelcomePage(WebDriver driver)
    {
        this.driver = driver;
    }

//    public CheckboxPage clickCheckboxesLink()
//    {
//        checkBoxLink.click();
//        PageFactory.initElements(driver,this);
//    }
}
