package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage {
    WebDriver driver;

    @FindBy(xpath="/html/body/div[2]/div/ul/li[8]/a")
    WebElement dragAndDropLink;

    @FindBy(xpath="//*[@id='column-a']")
    WebElement boxA;

    @FindBy(xpath="//*[@id='column-b']")
    WebElement boxB;

    @FindBy(xpath = "/html/body/div[2]/div/div/h3")
    WebElement tmp;

    public DragAndDropPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickDragAndDropLink()
    {
        dragAndDropLink.click();
    }

    public void dragAndDrop()
    {
        Actions action = new Actions(driver);
        //action.dragAndDrop(boxA,boxB).build().perform();
    }
}
