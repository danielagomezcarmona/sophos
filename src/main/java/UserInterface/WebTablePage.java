package UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoqa.com/")

public class WebTablePage extends PageObject {
    public static final Target ClickAdd = Target
            .the("Click en adicionar registro")
            .located(By.id("addNewRecordButton"));
    public static final Target ClickSubmit = Target
            .the("Click en cargar registro")
            .located(By.id("submit"));

}

