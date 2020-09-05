package ids;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DialogIds implements ID{

    @FindBy(id = "com.codepath.example.menuspopupsdialogsdemo:id/btnShowAlertDialog")
    public WebElement dialogAlert;
}
