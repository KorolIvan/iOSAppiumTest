import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author by Ivan Korol on 5/3/2017.
 */
public class IOSSimpleTest {

    private AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "38a30851daff2a86e69ef3f176bd81442529fb07");
        capabilities.setCapability("platformVersion", "10.2");
        capabilities.setCapability("browserName", "");
        //capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("bundleId", "management.boost.SBA");
        capabilities.setCapability("appiumVersion", "1.0.0");

        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test
    public void runApp() {
        Assert.assertEquals("Your all in one study planning and grade tracking tool",
                driver.findElement(By.className("./UILabel[@Address = '0x100e66570']")));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
