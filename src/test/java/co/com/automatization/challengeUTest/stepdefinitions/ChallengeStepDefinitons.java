package co.com.automatization.challengeUTest.stepdefinitions;

import co.com.automatization.challengeUTest.model.ChallengeData;
import co.com.automatization.challengeUTest.questions.Question;
import co.com.automatization.challengeUTest.tasks.OpenUp;
import co.com.automatization.challengeUTest.tasks.RegisterForm;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChallengeStepDefinitons {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Alejandro wants check in the UTest platform$")
    public void thanAlejandroWantsCheckInTheUTestPlatform() {
        OnStage.theActorCalled("Alejandro").wasAbleTo(OpenUp.thePage());
    }

    @When("^he fills the form$")
    public void heFillsTheForm(List<ChallengeData> challengeData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterForm.fillForm(challengeData.get(0).getTxtName(),challengeData.get(0).getTxtLastName(),challengeData.get(0).getTxtEmail(),challengeData.get(0).getTxtMonth(),challengeData.get(0).getTxtDay(),challengeData.get(0).getTxtYear(),challengeData.get(0).getTxtLanguage(),challengeData.get(0).getTxtPassword(),challengeData.get(0).getTxtConfirm()));
    }
    @Then("^he is register successfully$")
    public void heIsRegisterSuccessfully(List<ChallengeData> challengeData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Question.thePage(challengeData.get(0).getTxtQuestion())));
    }
}
