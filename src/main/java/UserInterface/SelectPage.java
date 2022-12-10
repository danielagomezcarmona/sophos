package UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoqa.com/")

public class SelectPage extends PageObject {
    public static final Target ClickWebTables = Target
            .the("Click en Web-Tables")
            .located(By.xpath("//span[normalize-space()='Web Tables']"));
    public static final Target ClickDataPicker = Target
            .the("Click en Data Picker")
            .located(By.xpath("//span[normalize-space()='Date Picker']"));
    public static final Target ClickAlerts = Target
            .the("Click en Alerts")
            .located(By.xpath("//span[normalize-space()='Alerts']"));


}
