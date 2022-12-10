package Interactions;

import UserInterface.WidgetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickDateTime implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WidgetPage.ClickDate2),
                Click.on(WidgetPage.ClickTime)
        );

    }

    public static ClickDateTime dateandtime() {return Tasks.instrumented(ClickDateTime.class);
    }
}
