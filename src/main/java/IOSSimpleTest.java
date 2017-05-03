import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
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
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("platformVersion", "10.2");
        capabilities.setCapability("browserName", "");
        //capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("appiumVersion", "1.0.0");

        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
