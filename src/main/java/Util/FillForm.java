package Util;

import UserInterface.SignUpPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

public class FillForm extends PageObject {
    public static Performable firstname(String firstname) {
        return Task.where("{0} enters first name '" + firstname + "'",
                Clear.field(SignUpPage.FIRSTNAME),
                Enter.theValue(firstname).into(SignUpPage.FIRSTNAME));
    }

    public static Performable lastName(String lastName) {
        return Task.where("{0} enters last name '" + lastName + "'",
                Clear.field(SignUpPage.LASTNAME),
                Enter.theValue(lastName).into(SignUpPage.LASTNAME));
    }

    public static Performable email(String email) {
        return Task.where("{0} enters email '" + email + "'",
                Clear.field(SignUpPage.EMAIL),
                Enter.theValue(email).into(SignUpPage.EMAIL));
    }

    public static Performable age(String age) {
        return Task.where("{0} enters age '" + age + "'",
                Clear.field(SignUpPage.AGE),
                Enter.theValue(age).into(SignUpPage.AGE));
    }

    public static Performable salary(String salary) {
        return Task.where("{0} enters salary '" + salary +  "'",
                Clear.field(SignUpPage.SALARY),
                Enter.theValue(salary).into(SignUpPage.SALARY));
    }

    public static Performable department(String department) {
        return Task.where("{0} enters department '" + department +  "'",
                Clear.field(SignUpPage.DEPARTMENT),
                Enter.theValue(department).into(SignUpPage.DEPARTMENT));
    }
}
