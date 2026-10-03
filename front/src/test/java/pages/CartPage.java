package pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    public static final Target CHECKOUT_BTN =
            Target.the("Checkout button")
                    .located(By.id("checkout"));

    public static final Target CONTINUE_BTN =
            Target.the("Continue button")
                    .located(By.id("continue"));

    public static final Target FINISH_BTN =
            Target.the("Finish button")
                    .located(By.id("finish"));

    public static final Target SUCCESS_MESSAGE =
            Target.the("Success confirmation message")
                    .located(By.cssSelector("h2.complete-header"));
}
