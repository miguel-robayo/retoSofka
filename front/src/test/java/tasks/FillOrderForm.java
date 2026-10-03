package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pages.CartPage;
import pages.ModalPage;

public class FillOrderForm implements Task {

    private final String firstName;
    private final String lastName;
    private final String postalCode;

    public FillOrderForm(String firstName, String lastName, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public static FillOrderForm withData(String firstName, String lastName, String postalCode){
        return Tasks.instrumented(FillOrderForm.class, firstName, lastName, postalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(ModalPage.FIRST_NAME),
                Enter.theValue(lastName).into(ModalPage.LAST_NAME),
                Enter.theValue(postalCode).into(ModalPage.POSTAL_CODE),
                Click.on(CartPage.CONTINUE_BTN),
                Click.on(CartPage.FINISH_BTN)
        );

    }
}