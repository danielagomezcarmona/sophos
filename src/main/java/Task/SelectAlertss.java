package Task;

import UserInterface.SelectPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ScrollToTarget;

public class SelectAlertss implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                new ScrollToTarget(SelectPage.ClickAlerts),
                Click.on(SelectPage.ClickAlerts)
        );

    }

    public static SelectAlertss alerts() {return Tasks.instrumented(SelectAlertss.class);
    }
}
