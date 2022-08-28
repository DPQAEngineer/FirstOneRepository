import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class FirstTest2 {

    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "AndroidTestDevice");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "org.wikipedia");
        capabilities.setCapability("appActivity", ".main.MainActivity");
        capabilities.setCapability("app", "C:\\Users\\DPQA\\Desktop\\JavaAppiumAutomation_2\\JavaAppiumAutomation\\apks\\org.wikipedia.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
            public void HasElementText() {
        assertElementHasText(
                (WebElement) By.xpath("//*[@resource-id='org.wikipedia:id/search_container']"),
                "Search Wikipedia",
                "Text 'Search Wikipedia' do not found in the searching field"
        );
    }

    private void assertElementHasText(WebElement element_location, String expected_text, String error_message) {
        String text_in_field = element_location.getAttribute("text");
        if (text_in_field == expected_text) {
            System.out.println(expected_text);
        } else {
            System.out.print(error_message);
        }
        }
    }




