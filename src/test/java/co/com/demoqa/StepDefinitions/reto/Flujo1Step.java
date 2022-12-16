package co.com.demoqa.StepDefinitions.reto;

import Task.*;
import UserInterface.HomePage;
import UserInterface.WebTablePage;
import Util.GetCellValue;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.DemoException;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidateText;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class Flujo1Step {

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Given("^El cliente esta ubicado en el home de la aplicacion$")
    public void elClienteEstaUbicadoEnElHomeDeLaAplicacion() {
        theActorCalled("Usuario").wasAbleTo(Open.browserOn(new HomePage()));
    }

    @When("^Selecciona la opcion de Elements$")
    public void seleccionaLaOpcionDeElements() {
        theActorInTheSpotlight().attemptsTo(SelectElement.elements());
    }

    @And("^Selecciona la opcion de Web tables$")
    public void seleccionaLaOpcionDeWebTables() {
        theActorInTheSpotlight().attemptsTo(SelectWebT.webtables());
    }

    @And("^Selecciona agregar registro$")
    public void seleccionaAgregarRegistro() {
        theActorInTheSpotlight().attemptsTo(AddRegister.register());
    }

    @Then("^Guarda los datos del formulario diligenciado$")
    public void guardaLosDatosDelFormularioDiligenciado() {
        theActorInTheSpotlight().attemptsTo(FullData.datos());
    }

    @And("^Agrega un registro completo exitosamente$")
    public void agregaUnRegistroCompletoExitosamente() {
        theActorInTheSpotlight().should(seeThat(ValidateText.getText(WebTablePage.VerifyData),
                equalTo(GetCellValue.getStringCellValueExcel("Hoja1",0,0))).orComplainWith(DemoException.class, "El valor obtenido difiere del esperado"));
    }

    @And("^Elimina cualquier registro completo exitosamente$")
    public void eliminaCualquierRegistroCompletoExitosamente() {
        theActorInTheSpotlight().attemptsTo(DeleteData.dat());
    }

}
