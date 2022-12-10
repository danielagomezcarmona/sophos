package UserInterface;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable signUpPage() {
        return Task.where("{0} opens the Sign Up  page",
                Open.url("https://demoqa.com/webtables"));
    }
}
