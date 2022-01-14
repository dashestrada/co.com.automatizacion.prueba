package co.com.automatizacion.prueba.stepdefinitions;

import co.com.automatizacion.prueba.model.UtestDatos;
import co.com.automatizacion.prueba.questions.Responder;
import co.com.automatizacion.prueba.task.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegistoExitosoStepDefinitions {
    @Before
    public  void sepUp(){
        setTheStage(new OnlineCast());
    }

    @Given("^the Dayana wants to enter the Utest page$")
    public void theDayanaWantsToEnterTheUtestPage() {
        theActorCalled("Dayana").wasAbleTo(OpenUp.theUtestPage());
    }


    @When("^she performs the registration of your personal data$")
    public void shePerformsTheRegistrationOfYourPersonalData(List<UtestDatos> datos)
    {theActorInTheSpotlight().attemptsTo(EnterPersonalData.theUtestPage(datos), EnterLocationData.theUtestPage(datos),
            EnterDevices.theUthestPage(datos), EnterFinalData.theUtestPage(datos));}

    @Then("^she has successfully registered$")
    public void sheHasSuccesfullyRegistered(List<UtestDatos> datos)
    {theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.thoThe(datos)));


    }
}
