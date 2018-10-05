package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    WebDriver driver;

    @FindBy(xpath="/html/body/div[2]/div/ul/li[9]/a")
    WebElement dropDownLink;

    @FindBy(xpath="//*[@id='dropdown']")
    WebElement dropDownBox;

    public DropdownPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickDropDownLink()
    {
        dropDownLink.click();
    }

    public void selectOption()
    {
        Select drpOption = new Select(dropDownBox);
        drpOption.selectByVisibleText("Option 2");
    }
}
