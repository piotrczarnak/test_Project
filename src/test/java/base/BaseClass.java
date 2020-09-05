package base;

import io.appium.java_client.AppiumDriver;

public class BaseClass {

    protected Methods methods;
    Assertions assertions;

    public BaseClass(AppiumDriver driver) {
        methods = new Methods(driver);
        assertions = new Assertions(driver);
    }
}
