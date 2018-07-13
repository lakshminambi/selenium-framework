package herokuapp.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class WelcomePageTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void startupPage()
    {
        System.setProperty("webdriver.gecko.driver","d:\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver,20);
        driver.get("http://the-internet.herokuapp.com/");
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}
