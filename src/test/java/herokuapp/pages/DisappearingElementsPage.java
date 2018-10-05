package herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DisappearingElementsPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "/html/body/div[2]/div/ul/li[7]/a")
    WebElement disappearingElementsLink;

//    @FindBy(xpath = "/html/body/div[2]/div/div/ul/li[5]/a")
//    WebElement hiddenElement;


    public DisappearingElementsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickDisappearingElementsLink() {
        disappearingElementsLink.click();
    }

    public void pageReloadElement() {
        while(true)
        {
            driver.navigate().refresh();
               WebElement galleryLink=driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[5]/a"));
                if(galleryLink != null && galleryLink.isDisplayed()) {
                    break;
                }
                else
                {
                    continue;
                }

            }
    }
}
