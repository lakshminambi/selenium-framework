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
    }

//    @Test(priority=1)
//    public void clickABTestingLink()
//    {
//       new WebDriverWait(driver,10);
//        objABTestingPage = new ABTestingPage(driver);
//        objABTestingPage.clickABTesting();
//        driver.navigate().back();
//    }

//    @Test(priority=2)
//    public void checkBoxesTest()
//    {
//        objCheckboxesPage = new CheckboxesPage(driver);
//        objCheckboxesPage.clickCheckboxesLink();
//        objCheckboxesPage.validateCheckboxes();
//    }
//
//    @Test(priority=3)
//    public void contextMenuTest() throws InterruptedException
//    {
//        new WebDriverWait(driver,10);
//        objContextMenuPage = new ContextMenuPage(driver);
//        objContextMenuPage.clickContextMenuLink();
//        objContextMenuPage.rightClickTest();
//        driver.navigate().back();
//    }
//    @Test(priority=4)
//    public void dragAndDropTest()
//    {
//        objDragAndDropPage = new DragAndDropPage(driver);
//        objDragAndDropPage.clickDragAndDropLink();
//        objDragAndDropPage.dragAndDrop();
//    }
    @Test(priority=5)
    public void disappearingElementsTest() throws InterruptedException
    {
        objDisappearingElementsPage = new DisappearingElementsPage(driver);
        objDisappearingElementsPage.clickDisappearingElementsLink();
        objDisappearingElementsPage.pageReloadElement();
    }

}
