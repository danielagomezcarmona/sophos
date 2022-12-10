package Task;

import UserInterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectWidgets implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.ClickWidgets)
        );

    }

    public static SelectWidgets widgets() {return Tasks.instrumented(SelectWidgets.class);
    }
}
