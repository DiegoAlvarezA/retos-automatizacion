package co.com.choucair.certification.proyectobase.dalvareza.stepdefinitions;

import co.com.choucair.certification.proyectobase.dalvareza.model.FinancialCanonSimulator;
import co.com.choucair.certification.proyectobase.dalvareza.tasks.*;
import co.com.choucair.certification.proyectobase.dalvareza.userinterface.BancolombiaPortalEmpresasPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.thucydides.core.pages.components.HtmlTable.rowsFrom;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BancolombiaCanonFinancieroStepDefinitions {

    @Given("^I am in the Simulador de canon financiero$")
    public void iAmInTheSimuladorDeCanonFinanciero() {
        theActorCalled("I").wasAbleTo(
                OpenUpBancolombia.portalEmpresasPage()
                /*Click.on(BancolombiaPortalEmpresasPage.SERVICES_AND_PRODUCTS_LINK),
                Click.on(BancolombiaPortalEmpresasPage.LEASING_LINK),
                Click.on(BancolombiaPortalEmpresasPage.LEASING_INMOBILIARIO_LINK),
                Click.on(BancolombiaPortalEmpresasPage.SIMULADOR_CANON_FINANCIERO_BUTTON)*/
        );
    }

    @When("^I fill the simulation form$")
    public void iFillTheSimulationForm(List<FinancialCanonSimulator> formData) {
        theActorInTheSpotlight().attemptsTo(FillTheSimulationForm.with(formData.get(0)));
    }

    @Then("^I see the simulation result$")
    public void iSeeTheSimulationResult() {

    }
}
