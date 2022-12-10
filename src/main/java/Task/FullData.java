package Task;

import UserInterface.WebTablePage;
import Util.FillForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.junit.annotations.UseTestDataFrom;

@UseTestDataFrom(value = "testdata/users.csv")
public class FullData implements Task {

    private String firstname;
    private String lastname;
    private String email;
    private String age;
    private String salary;
    private String department;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                FillForm.firstname(firstname),
                FillForm.lastName(lastname),
                FillForm.email(email),
                FillForm.age(age),
                FillForm.salary(salary),
                FillForm.department(department),
                Click.on(WebTablePage.ClickSubmit)

        );

    }

    public static FullData data() {return Tasks.instrumented(FullData.class);
    }

}
