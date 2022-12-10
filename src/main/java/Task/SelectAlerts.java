package Task;

import UserInterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectAlerts implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.ClickAlerts)
        );

    }

    public static SelectAlerts alerts() {return Tasks.instrumented(SelectAlerts.class);
    }
}
