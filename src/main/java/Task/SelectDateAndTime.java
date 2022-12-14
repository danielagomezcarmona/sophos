package Task;

import UserInterface.WidgetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ScrollToTarget;

public class SelectDateAndTime implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                new ScrollToTarget(WidgetPage.ClickSelectDateAndTime),
                Click.on(WidgetPage.ClickSelectDateAndTime)
        );

    }
    public static SelectDateAndTime campo() {return Tasks.instrumented(SelectDateAndTime.class);
    }
}
