package herokuapp.tests;

import herokuapp.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class herokuappTest{
    WebDriver driver;
    WebDriverWait wait;
    WelcomePage objWelcomePage;
    ABTestingPage objABTestingPage;
    ContextMenuPage objContextMenuPage;
    CheckboxesPage objCheckboxesPage;
    DragAndDropPage objDragAndDropPage;
    DisappearingElementsPage objDisappearingElementsPage;
    DropdownPage objDropDownPage;

    @BeforeTest
    public void startUp()
    {
        System.setProperty("webdriver.gecko.driver", "d:\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 20);
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @Test(priority=0)
    public void homePageTitle()
    {
        objWelcomePage = new WelcomePage(driver);
        String pageContent = objWelcomePage.validatePage();
        Assert.assertTrue(pageContent.contains("Welcome to the-internet"));
        System.out.println("Page title is correct");
    }

    @Test(priority=1)
    public void clickABTestingLink()
    {
       new WebDriverWait(driver,10);
        objABTestingPage = new ABTestingPage(driver);
        objABTestingPage.clickABTesting();
        driver.navigate().back();
        System.out.println("ABtesting is correct");
    }

    @Test(priority=2)
    public void checkBoxesTest()
    {
        new WebDriverWait(driver,10);
        objCheckboxesPage = new CheckboxesPage(driver);
        objCheckboxesPage.clickCheckboxesLink();
        objCheckboxesPage.validateCheckboxes();
        driver.navigate().back();
        System.out.println("Checkbox is correct");
    }

    @Test(priority=3)
    public void contextMenuTest() throws InterruptedException
    {
        new WebDriverWait(driver,10);
        objContextMenuPage = new ContextMenuPage(driver);
        objContextMenuPage.clickContextMenuLink();
        objContextMenuPage.rightClickTest();
        driver.navigate().back();
        System.out.println("ContextMenu is correct");
    }

    @Test(priority=4)
    public void dragAndDropTest()
    {
        new WebDriverWait(driver,10);
        objDragAndDropPage = new DragAndDropPage(driver);
        objDragAndDropPage.clickDragAndDropLink();
        objDragAndDropPage.dragAndDrop();
        driver.navigate().back();
        System.out.println("Drag and drop is correct");
    }

    @Test(priority=5)
    public void disappearingElementsTest() throws InterruptedException
    {
        new WebDriverWait(driver,10);
        objDisappearingElementsPage = new DisappearingElementsPage(driver);
        objDisappearingElementsPage.clickDisappearingElementsLink();
        objDisappearingElementsPage.pageReloadElement();
        driver.navigate().back();
        System.out.println("DisappearingElement is correct");
    }

    @Test(priority=6)
    public void dropDownTest()
    {
        new WebDriverWait(driver,10);
        objDropDownPage = new DropdownPage(driver);
        objDropDownPage.clickDropDownLink();
        objDropDownPage.selectOption();
        driver.navigate().back();
        System.out.println("Dropdown test is correct");
    }
}
