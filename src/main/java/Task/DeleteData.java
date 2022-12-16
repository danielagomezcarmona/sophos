package Task;

import UserInterface.WebTablePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DeleteData implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WebTablePage.DeleteData)
        );
    }

    public static DeleteData dat() {return Tasks.instrumented(DeleteData.class);
    }
}
