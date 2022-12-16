package Interactions;

import UserInterface.WidgetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

public class ClickDateTime implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
        actor.attemptsTo(
                Click.on(WidgetPage.ClickOption),
                Click.on(WidgetPage.ClickDate2),
                new MoveMouseToTarget(WidgetPage.ClickTime)
        );
            Thread.sleep(2000);
            actor.attemptsTo(
                    new ScrollToTarget(WidgetPage.SelectTime),
                    Click.on(WidgetPage.SelectTime));
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static ClickDateTime dateandtime() {return Tasks.instrumented(ClickDateTime.class);
    }
}
