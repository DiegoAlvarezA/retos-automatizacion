package co.com.choucair.certification.proyectobase.dalvareza.stepdefinitions;

import co.com.choucair.certification.proyectobase.dalvareza.model.BlockValidation;
import co.com.choucair.certification.proyectobase.dalvareza.questions.TheForm;
import co.com.choucair.certification.proyectobase.dalvareza.tasks.ColorlibLogin;
import co.com.choucair.certification.proyectobase.dalvareza.tasks.FillTheForm;
import co.com.choucair.certification.proyectobase.dalvareza.tasks.GoToForms;
import co.com.choucair.certification.proyectobase.dalvareza.tasks.OpenUpColorlib;
import co.com.choucair.certification.proyectobase.dalvareza.userinterface.ColorlibForms;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import static org.hamcrest.core.IsEqual.equalTo;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BlockValidationColorlibStepDefinitions {

    @Given("^I am logged in the app, with credentials:$")
    public void iAmLoggedInTheAppWithCredentials(List<String> credentials) {
        theActorCalled("I").wasAbleTo(OpenUpColorlib.thePage(), ColorlibLogin.withCredentials(credentials.get(0), credentials.get(1)));
    }

    @And("^I go to Block Validation$")
    public void iGoToBlockValidation() {
        theActorInTheSpotlight().attemptsTo(GoToForms.formSubmoduleAndValidation(ColorlibForms.FORMVALIDATION_BUTTON, ColorlibForms.BLOCKVALIDATION_TITLE));
        theActorInTheSpotlight().should(seeThat("The form title", TheForm.formTitle(ColorlibForms.BLOCKVALIDATION_TITLE), equalTo("Block Validation")));
    }

    @When("^I fill the form$")
    public void iFillTheForm(List<BlockValidation> data) {
        theActorInTheSpotlight().attemptsTo(FillTheForm.with(data.get(0)));
    }

    @Then("^I see the successful messages$")
    public void iSeeTheSuccessfulMessages() {
        theActorInTheSpotlight().should(
                seeThat("The form messages", TheForm.validationStateIn(ColorlibForms.BLOCKVALIDATION_FORM),
                        anyOf(
                                not(containsString("This field is required.")),
                                not(containsString("Please enter"))
                        )
                )
        );
    }

    @Then("^I see the error messages$")
    public void iSeeTheErrorMessages() {
        theActorInTheSpotlight().should(
                seeThat("The form messages", TheForm.validationStateIn(ColorlibForms.BLOCKVALIDATION_FORM),
                        anyOf(
                                containsString("This field is required."),
                                containsString("Please enter")
                        )
                ));
    }
}
