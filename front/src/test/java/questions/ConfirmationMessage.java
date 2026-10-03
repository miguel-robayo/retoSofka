package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import pages.CartPage;

public class ConfirmationMessage implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return CartPage.SUCCESS_MESSAGE.resolveFor(actor).getText()
                .toUpperCase().contains("THANK YOU FOR YOUR ORDER");
    }

    public static ConfirmationMessage isDisplayed(){
        return new ConfirmationMessage();
    }
}