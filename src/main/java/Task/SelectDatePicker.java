package Task;

import UserInterface.SelectPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ScrollToTarget;

public class SelectDatePicker implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                new ScrollToTarget(SelectPage.ClickDataPicker),
                Click.on(SelectPage.ClickDataPicker)
        );

    }

    public static SelectDatePicker picker() {return Tasks.instrumented(SelectDatePicker.class);
    }

}
