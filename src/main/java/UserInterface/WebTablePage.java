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
    public static final Target VerifyData = Target
            .the("Verificación de datos").located(By.xpath("//div[normalize-space()='Daniela']"));
    public static final Target DeleteData = Target
            .the("Eliminación de datos").located(By.xpath("//span[@id='delete-record-2']//*[name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]"));
}

