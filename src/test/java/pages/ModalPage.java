package pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ModalPage {

    public static final Target FIRST_NAME=
            Target.the("First name field")
                    .located(By.id("first-name"));

    public static final Target LAST_NAME=
            Target.the("Last name field")
                    .located(By.id("last-name"));

    public static final Target POSTAL_CODE=
            Target.the("Postal code field")
                    .located(By.id("postal-code"));

}
