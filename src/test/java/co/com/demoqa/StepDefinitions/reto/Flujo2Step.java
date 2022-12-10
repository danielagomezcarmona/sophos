package co.com.demoqa.StepDefinitions.reto;

import Interactions.ClickDate;
import Interactions.ClickDateTime;
import Task.*;
import UserInterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Flujo2Step {

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Given("^El cliente esta ubicado en el home$")
    public void elClienteEstaUbicadoEnElHome() {
        theActorCalled("Cliente").wasAbleTo(Open.browserOn(new HomePage()));
    }

    @When("^Selecciona la opcion de Widgets$")
    public void seleccionaLaOpcionDeWidgets() {
        theActorInTheSpotlight().attemptsTo(SelectWidgets.widgets());
    }

    @And("^Selecciona la opcion de Date Picker$")
    public void seleccionaLaOpcionDeDatePicker() {
        theActorInTheSpotlight().attemptsTo(SelectDatePicker.picker());
    }

    @Then("^Selecciona el campo de Select Date$")
    public void seleccionaElCampoDeSelectDate() {
        theActorInTheSpotlight().attemptsTo(SelectDate.campo());
    }

    @And("^Selecciona una fecha exitosamente$")
    public void seleccionaUnaFechaExitosamente() {
        theActorInTheSpotlight().attemptsTo(ClickDate.date());
    }

    @And("^Selecciona el campo de Date and Time$")
    public void seleccionaElCampoDeDateAndTime() {
        theActorInTheSpotlight().attemptsTo(SelectDateAndTime.campo());
    }

    @And("^Selecciona una fecha y hora exitosamente$")
    public void seleccionaUnaFechaYHoraExitosamente() {
        theActorInTheSpotlight().attemptsTo(ClickDateTime.dateandtime());
    }
}
