package Task;

import UserInterface.SignUpPage;
import Util.GetCellValue;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FullData implements Task {

    public static FullData datos (){ return instrumented(FullData.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
        actor.attemptsTo(
                Enter.theValue(GetCellValue.getStringCellValueExcel("Hoja1",0,0)).into(SignUpPage.FIRSTNAME),
                Enter.theValue(GetCellValue.getStringCellValueExcel("Hoja1",0,1)).into(SignUpPage.LASTNAME),
                Enter.theValue(GetCellValue.getStringCellValueExcel("Hoja1",0,2)).into(SignUpPage.EMAIL),
                Enter.theValue(GetCellValue.getStringCellValueExcel("Hoja1",0,3)).into(SignUpPage.AGE),
                Enter.theValue(GetCellValue.getStringCellValueExcel("Hoja1",0,4)).into(SignUpPage.SALARY),
                Enter.theValue(GetCellValue.getStringCellValueExcel("Hoja1",0,5)).into(SignUpPage.DEPARTMENT),
                Click.on(SignUpPage.ClickSubmit)
        );
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
