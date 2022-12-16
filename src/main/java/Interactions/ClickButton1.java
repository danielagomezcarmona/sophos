package Interactions;

import UserInterface.AlertsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class ClickButton1 implements Task {

    public static ClickButton1 boton1() {
        return Tasks.instrumented(ClickButton1.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AlertsPage.ClickBoton1));
    }
}




