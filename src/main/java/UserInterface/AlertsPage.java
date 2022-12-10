package UserInterface;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/")

public class AlertsPage extends PageObject {

    public static final Target ClickBoton1 = Target
            .the("Click en primer boton")
            .located(By.id("alertButton"));
    public static final Target ClickBoton2 = Target
            .the("Click en segundo boton")
            .located(By.id("timerAlertButton"));
    public static final Target ClickBoton3 = Target
            .the("Click en tercer boton")
            .located(By.id("confirmButton"));
    public static final Target ClickBoton4 = Target
            .the("Click en cuarto boton")
            .located(By.id("promtButton"));

}
