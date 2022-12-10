package UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoqa.com/")

public class WidgetPage extends PageObject {
    public static final Target ClickSelectDate = Target
            .the("Click en campo de Select Date")
            .located(By.id("datePickerMonthYearInput"));
    public static final Target ClickDate = Target
            .the("Seleccionar fecha en Date")
            .locatedBy("//div[@aria-label='Choose Thursday, December 22nd, 2022']");
    public static final Target ClickSelectDateAndTime = Target
            .the("Click en campo de Date and Time")
            .located(By.id("dateAndTimePickerInput"));
    public static final Target ClickDate2 = Target
            .the("Seleccionar fecha en Date 2")
            .locatedBy("//div[@aria-label='Choose Thursday, December 15th, 2022']");
    public static final Target ClickTime = Target
            .the("Seleccionar tiempo")
            .locatedBy("//li[normalize-space()='17:15']");
}
