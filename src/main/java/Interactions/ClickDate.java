package Interactions;

import UserInterface.WidgetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

public class ClickDate implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
        actor.attemptsTo(
                Click.on(WidgetPage.ClickMonth1),
                SelectFromOptions.byVisibleText("January").from(WidgetPage.ClickMonth1),
                Click.on(WidgetPage.ClickYear1));
            Thread.sleep(2000);
            actor.attemptsTo(SelectFromOptions.byVisibleText("2021").from(WidgetPage.ClickYear1),
                    Click.on(WidgetPage.ClickDate));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static ClickDate date() {return Tasks.instrumented(ClickDate.class);
    }
}
