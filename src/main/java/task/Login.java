package task;


import actions.GoToHome;
import actions.GoToSingIn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private String email;
    private String password;

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Step("{0} fill the login form")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                GoToHome.navigate(),
                GoToSingIn.clickButton()

        );
    }

    public static Login fillWith(String email, String password){
        return instrumented(Login.class, email, password);
    }

}
