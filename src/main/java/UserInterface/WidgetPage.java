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
    public static final Target ClickMonth1 = Target
            .the("Click en campo de mes1")
            .located(By.className("react-datepicker__month-select"));
    public static final Target ClickYear1 = Target
            .the("Click en campo de año1")
            .located(By.className("react-datepicker__year-select"));
    public static final Target ClickDate = Target
            .the("Seleccionar fecha en Date")
            .locatedBy("//div[@aria-label='Choose Friday, January 15th, 2021']");
    public static final Target ClickSelectDateAndTime = Target
            .the("Click en campo de Date and Time")
            .located(By.id("dateAndTimePickerInput"));
    public static final Target ClickYear = Target
            .the("Click en año")
            .located(By.className("react-datepicker__year-read-view--down-arrow"));
    public static final Target SelectYear = Target
            .the("Seleccionar un año")
            .locatedBy("//*[text()='2024']");
    public static final Target ClickMonth = Target
            .the("Click en mes")
            .located(By.className("react-datepicker__month-read-view--selected-month"));
    public static final Target SelectMonth = Target
            .the("Seleccionar un mes")
            .locatedBy("//*[text()='April']");
    public static final Target ClickDate2 = Target
            .the("Seleccionar fecha en Date 2")
            .locatedBy("//div[@aria-label='Choose Thursday, April 4th, 2024']");
    public static final Target ClickTime = Target
            .the("Click zona de tiempo")
            .located(By.className("react-datepicker__time-box"));
    public static final Target SelectTime = Target
            .the("Seleccionar tiempo")
            .locatedBy("//li[normalize-space()='18:30']");
}
