package herokuapp.tests;

import herokuapp.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class herokuappTest extends WelcomePageTest{
    WelcomePage<WelcomePage> objWelcomePage;

    @Test
    public void validation()
    {
        objWelcomePage = new WelcomePage<WelcomePage>(driver);
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle,"The Internet");
    }
}
