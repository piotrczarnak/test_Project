package base;

import ids.ID;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import sun.jvm.hotspot.debugger.Page;

import java.time.Duration;

public class Methods {

    AppiumDriver driver;

    public Methods(AppiumDriver driver) {
        this.driver = driver;
    }

    public void initElements(ID site) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(8)), site);
    }

    public void clickElement(WebElement element) {
        element.click();
    }
}
