package pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {

    public static final Target TITLE =
            Target.the("products page title")
                    .located(By.cssSelector("span.title"));
}
