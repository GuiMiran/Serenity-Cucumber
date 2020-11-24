package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.BaseTarget;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject   {
    public static final Target EMAIL_FIELD = Target.the("field to set the email")
            .locatedBy("#email");

    public static final Target PASSWORD_FIELD = Target.the("field to set the password")
            .locatedBy("#passwd");

    public static final Target SUBMIT_BTN = Target.the("field to set the email")
            .locatedBy("#SubmitLogin");

    public static final Target ERROR_MSG = Target.the("message that appear when login fail")
            .locatedBy("#center_column > div.alert.alert-danger");

}
