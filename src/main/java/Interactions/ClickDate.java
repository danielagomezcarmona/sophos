package Interactions;

import UserInterface.WidgetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickDate implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WidgetPage.ClickDate)
        );
    }

    public static ClickDate date() {return Tasks.instrumented(ClickDate.class);
    }
}
