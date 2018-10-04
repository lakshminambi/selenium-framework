package herokuapp.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ContextMenuPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "/html/body/div[2]/div/ul/li[6]/a")
    WebElement contextMenuLink;

    // @FindBy(xpath="//*[@id='hot-spot']")
    @FindBy(xpath = "/html/body/div[2]/div/strong/a")
    WebElement contextBox;

    public ContextMenuPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickContextMenuLink() {

        contextMenuLink.click();
    }

     public void rightClickTest()  throws InterruptedException {

         Actions action = new Actions(driver).contextClick(contextBox);
         action.build().perform();
         for(int i=0;i<2;i++)
         {
             contextBox.sendKeys(Keys.ARROW_DOWN);
             Thread.sleep(1000);
         }
         contextBox.sendKeys(Keys.ENTER);
         Thread.sleep(1000);

//         Alert cbAlert = driver.switchTo().alert();
//
//         String alertText = cbAlert.getText();
//
//         Assert.assertEquals(alertText,"You selected a context menu");
//
//         cbAlert.accept();

     }

}
