package co.com.choucair.certification.proyectobase.dalvareza.stepdefinitions;

import co.com.choucair.certification.proyectobase.dalvareza.model.InLineValidation;
import co.com.choucair.certification.proyectobase.dalvareza.questions.TheForm;
import co.com.choucair.certification.proyectobase.dalvareza.tasks.FillInLineForm;
import co.com.choucair.certification.proyectobase.dalvareza.tasks.GoToForms;
import co.com.choucair.certification.proyectobase.dalvareza.userinterface.ColorlibForms;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class InlineValidationColorlibStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @And("^I go to Inline Validation$")
    public void iGoToInlineValidation() {
        OnStage.theActorInTheSpotlight().attemptsTo(GoToForms.formSubmoduleAndValidation(ColorlibForms.FORMVALIDATION_BUTTON, ColorlibForms.INLINEVALIDATION_TITLE));
        OnStage.theActorInTheSpotlight().should(seeThat("The form title", TheForm.formTitle(ColorlibForms.INLINEVALIDATION_TITLE), equalTo("Inline Validation")));
    }

    @When("^I fill the Inline Validation form$")
    public void iFillTheInlineValidationForm(List<InLineValidation> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillInLineForm.with(data.get(0)));
    }

    @Then("^I see the successful messages in Inline Validation$")
    public void iSeeTheSuccessfulMessagesInInlineValidation() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("The form messages", TheForm.validationStateIn(ColorlibForms.INLINEVALIDATION_FORM),
                        anyOf(
                                not(containsString("This field is required.")),
                                not(containsString("Please enter"))
                        )
                )
        );
    }

    @Then("^I see the error messages in Inline Validation$")
    public void iSeeTheErrorMessagesInInlineValidation() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("The form messages", TheForm.validationStateIn(ColorlibForms.INLINEVALIDATION_FORM),
                        anyOf(
                                containsString("This field is required."),
                                containsString("Please enter")
                        )
                )
        );
    }
}
