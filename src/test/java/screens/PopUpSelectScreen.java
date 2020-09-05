package screens;

import base.BaseClass;
import ids.DialogIds;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PopUpSelectScreen extends BaseClass {

    AppiumDriver driver;
    DialogIds ids = new DialogIds();

    public PopUpSelectScreen(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        methods.initElements(ids);
    }

    public DialogAlert openAlert() {
        methods.clickElement(ids.dialogAlert);
        return new DialogAlert(driver);
    }


}
