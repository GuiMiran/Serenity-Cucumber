package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://automationpractice.com")
public class HomePage extends PageObject {

    public static final Target SIGN_IN_BTN = Target.the("button to access to login page")
            .locatedBy(".login");

    public static final Target SEARCH_BOX = Target.the("field to search products in thje home page")
            .locatedBy("#search_query_top");
}
