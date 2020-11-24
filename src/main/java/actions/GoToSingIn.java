package actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import ui.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.HomePage.SIGN_IN_BTN;

public class GoToSingIn implements Interaction {


    @Step("{0} click the signIn button")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SIGN_IN_BTN)
        );

    }

    public static GoToSingIn clickButton(){
        return instrumented(GoToSingIn.class);
    }


}
