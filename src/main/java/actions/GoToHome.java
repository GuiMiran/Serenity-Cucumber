package actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import ui.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToHome implements Interaction {

    private HomePage homePage;

    @Step("{0} accesc to the ecomerce")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.browserOn().the(homePage)
        );
    }

    public static GoToHome navigate(){
               return instrumented(GoToHome.class);
    }
}
