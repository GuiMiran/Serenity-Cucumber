package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.LoginPage;

public class LoginFailed implements Question<String> {
    public String answeredBy(Actor actor) {
        return LoginPage.ERROR_MSG.resolveFor(actor).getText();
    }
//
//    public String getSubject() {
//        return null;
//    }

    public static Question<String> isErrorShowing(){
        return new LoginFailed();
    }
}
