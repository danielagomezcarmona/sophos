package Task;

import UserInterface.WidgetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectDate implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WidgetPage.ClickSelectDate)
       );

    }
    public static SelectDate campo() {return Tasks.instrumented(SelectDate.class);
    }
}
