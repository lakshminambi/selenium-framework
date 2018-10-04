package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CheckboxesPage {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[2]/div/ul/li[5]/a")
    WebElement checkBoxesLink;

    @FindBy(xpath = "//input[@type='checkbox']")
    List<WebElement> allCheckboxes;

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCheckboxesLink() {
        checkBoxesLink.click();
    }

    public void validateCheckboxes() {

        for (WebElement checkBox : allCheckboxes) {
                String checkboxName = checkBox.getText();
            if (checkBox.isSelected()) {

                System.out.println( checkboxName + " is selected");
            }
            else {
                checkBox.click();
            }
        }
    }
}
