package co.com.demoqa.StepDefinitions.reto;

import Interactions.ClickButton1;
import Interactions.ClickButton2;
import Interactions.ClickButton3;
import Interactions.ClickButton4;
import Util.GetCellValue;
import exceptions.DemoException;
import questions.ValidateText;
import Task.SelectAlerts;
import Task.SelectAlertss;
import UserInterface.AlertsPage;
import UserInterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class Flujo3Step {

    private HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Given("^El cliente esta ubicado en la pagina de inicio$")
    public void elClienteEstaUbicadoEnLaPaginaDeInicio() {
        theActorCalled("Cliente").wasAbleTo(Open.browserOn(homePage));
    }

    @When("^Selecciona la opcion de Alerts, Frame y Windows$")
    public void seleccionaLaOpcionDeAlertsFrameYWindows() {
        theActorInTheSpotlight().attemptsTo(SelectAlerts.alerts());
    }

    @And("^Selecciona la opcion de Alerts$")
    public void seleccionaLaOpcionDeAlerts() {
        theActorInTheSpotlight().attemptsTo(SelectAlertss.alerts());
    }

    @Then("^Selecciona el primer boton y cierra la ventana emergente$")
    public void seleccionaElPrimerBotonYCierraLaVentanaEmergente() {
        theActorInTheSpotlight().attemptsTo(ClickButton1.boton1());
        homePage.getDriver().switchTo().alert().accept();
    }

    @And("^Selecciona el segundo boton y cierra la ventana emergente$")
    public void seleccionaElSegundoBotonYCierraLaVentanaEmergente() {
        theActorInTheSpotlight().attemptsTo(ClickButton2.boton2());
        homePage.getDriver().switchTo().alert().accept();
    }

    @And("^Selecciona el tercer boton y cierra la ventana emergente$")
    public void seleccionaElTercerBotonYCierraLaVentanaEmergente() {
        theActorInTheSpotlight().attemptsTo(ClickButton3.boton3());
        homePage.getDriver().switchTo().alert().accept();
    }

    @And("^Selecciona el cuarto boton ingresa el nombre y cierra la ventana emergente$")
    public void seleccionaElCuartoBotonIngresaElYCierraLaVentanaEmergente(){
        theActorInTheSpotlight().attemptsTo(ClickButton4.boton4());
        homePage.getDriver().switchTo().alert().sendKeys(GetCellValue.getStringCellValueExcel("Hoja1", 0, 0));
        homePage.getDriver().switchTo().alert().accept();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("^Verifica de manera exitosa el dato$")
    public void verificaDeManeraExitosaEl() {
        theActorInTheSpotlight().should(seeThat(ValidateText.getText(AlertsPage.TextoNombre),
                equalTo("You entered " + GetCellValue.getStringCellValueExcel("Hoja1", 0, 0))).orComplainWith(DemoException.class, "El valor obtenido difiere del esperado"));
    }
}
