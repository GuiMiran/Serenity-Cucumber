package steps;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.LoginFailed;
import task.Login;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class LoginSteps {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the (Fran|Silvia|Guido) wants to access to the ecommerce$")
    public void theFranWantsToAccessToTheEcommerce(String actorName) {
        Actor actor = theActorCalled(actorName);
//        actor.attemptsTo(
//                GoToSingIn.clickButton()
//        );
    }
    @When("^the (?:Fran|Silvia|Guido) fill the login mandatory field: (.*) and (.*)$")
    public void theUserWantsToAccessToTheEcommerce(String email, String password){
        theActorInTheSpotlight().attemptsTo(
                Login.fillWith(email, password)
        );
    }

    @Then("^the ecommerce should be show an error feedback$")
    public void theEcommerceShouldBeShowAnErrorFeedback(String errorMsg) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        "The Login show an error message",
                        LoginFailed.isErrorShowing(),
                        containsString(errorMsg)
                )
        );
    }
}
