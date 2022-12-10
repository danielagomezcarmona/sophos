package co.com.demoqa.Runners.reto;

import UserInterface.SignUpPage;
import UserInterface.WebTablePage;
import Util.BaseConf;
import Util.FillForm;
import UserInterface.NavigateTo;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "testdata/users.csv")

    public class ParaTest extends BaseConf {

        private String firstname;
        private String lastname;
        private String email;
        private String age;
        private String salary;
        private String department;

        @Before
        public void navigate(){
            actor.attemptsTo(
                    NavigateTo.signUpPage()
            );
        }

        @Test
        public void should_UserSignUpSuccessfully_When_She_FillTheForm() {
            actor.attemptsTo(
                    Click.on(WebTablePage.ClickAdd),
                    FillForm.firstname(firstname),
                    FillForm.lastName(lastname),
                    FillForm.email(email),
                    FillForm.age(age),
                    FillForm.salary(salary),
                    FillForm.department(department),
                    Click.on(SignUpPage.ClickSubmit)
            );
        }
}
