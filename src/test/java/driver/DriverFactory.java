package driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

     AppiumDriver driver;

    public AppiumDriver createDriver(String platform) {
        DesiredCapabilities dc = new DesiredCapabilities();
        if (platform.equals("Android")) {
            dc.setCapability(CapabilityType.PLATFORM_NAME, "Android");
            dc.setCapability("platformVersion", "10");
            dc.setCapability("deviceName", "emulator-5554");
            dc.setCapability("appPackage", "com.codepath.example.menuspopupsdialogsdemo");
            dc.setCapability("appActivity", "com.codepath.example.menuspopupsdialogsdemo.MainActivity");
            try {
                return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } else {

        }
    }

    public void quitDriver() {
        driver.quit();
    }
}
