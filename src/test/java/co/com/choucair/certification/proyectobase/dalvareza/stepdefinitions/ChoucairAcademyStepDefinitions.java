package co.com.choucair.certification.proyectobase.dalvareza.stepdefinitions;

import co.com.choucair.certification.proyectobase.dalvareza.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.dalvareza.questions.Answer;
import co.com.choucair.certification.proyectobase.dalvareza.tasks.Login;
import co.com.choucair.certification.proyectobase.dalvareza.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.dalvareza.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that Brandon wants to learn about testing in Artificial Intelligence at the academy Choucair$")
    public void thatBrandonWantsToLearnAboutTestingInArtificialIntelligenceAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage(academyChoucairData.get(0).getStrUser(), academyChoucairData.get(0).getStrPassword())));
    }

    @When("^he searches for the course on the choucair academy platform$")
    public void heSearchForTheCourseOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called$")
    public void heFindsTheCourseCalled(List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }

}
