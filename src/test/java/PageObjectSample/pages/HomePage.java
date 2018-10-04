package PageObjectSample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath="//html//body/form//table/tbody//tr[1]//td[2]//input")
    WebElement userIdName;

    @FindBy(xpath="//html//body//form//table//tbody//tr[2]//td[2]//input")
    WebElement passwordName;

    @FindBy(xpath = "//html//body//form//table//tbody//tr[3]//td[2]//input[1]")
    WebElement loginButton;

    @FindBy(xpath="//html//body//div[2]//h2")
    WebElement pageContent;


    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setUserIdName(String userIdValue)
    {
        userIdName.sendKeys(userIdValue);
    }

    public void setPasswordName(String passwordValue)
    {
        passwordName.sendKeys(passwordValue);
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }

    public void loginToHomePage(String userIdValue, String passwordValue)
    {
        this.setUserIdName(userIdValue);
        this.setPasswordName(passwordValue);
        this.clickLoginButton();

    }
    public String getPageContent()
    {
        return pageContent.getText();
    }

}
