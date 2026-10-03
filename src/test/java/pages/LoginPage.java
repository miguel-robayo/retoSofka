package pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USERNAME =
            Target.the("Username field")
                    .located(By.id("user-name"));

    public static final Target PASSWORD =
            Target.the("Password field")
                    .located(By.id("password"));

    public static final Target LOGIN_BTN =
            Target.the("Login button")
                    .located(By.id("login-button"));
}
