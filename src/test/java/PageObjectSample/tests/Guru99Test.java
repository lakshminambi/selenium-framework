package PageObjectSample.tests;

import PageObjectSample.pages.HomePage;
import PageObjectSample.pages.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99Test {
    WebDriver driver;
    HomePage objHomePage;
    WelcomePage objWelcomePage;

    @BeforeTest
    public void startUp()
    {
        System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        String baseUrl = "http://demo.guru99.com/V4/";
        driver.get(baseUrl);

    }
    @Test(priority=0)
    public void firstPage()
    {
        objHomePage = new HomePage(driver);
        String pageText = objHomePage.getPageContent();
//        Assert.assertEquals(pageText,"Guru99 Bank");
        Assert.assertTrue(pageText.toLowerCase().contains("guru99 bank"));
        objHomePage.loginToHomePage("mgr123","mgr!23");
    }

    @Test(priority=1)
    public void demoSite()
    {
        objWelcomePage = new WelcomePage(driver);
        String welcomeText=objWelcomePage.getWelcomeMsg();
        Assert.assertTrue(welcomeText.contains("Manger Id : mgr123"));
    }
}
