package tests;

import driver.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import screens.PopUpSelectScreen;

public class DialogTest {

    PopUpSelectScreen mainScreen;

    @Before
    public void start() {
        mainScreen = new PopUpSelectScreen(new DriverFactory().createDriver("Android"));
    }

    @Test
    public void firstTest() {

    }

    @After
    public void end() {

    }
}
