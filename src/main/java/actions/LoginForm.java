package actions;

import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import ui.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginForm implements Interaction {

    private final String email;
    private final String password;

    public LoginForm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Step("{0} fill the login form")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.EMAIL_FIELD, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(email).into(LoginPage.EMAIL_FIELD),
                Enter.theValue(password).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.SUBMIT_BTN)
        );
    }

    public static LoginForm fillWith(String email, String password) {
        return instrumented(LoginForm.class, email, password);
    }
}