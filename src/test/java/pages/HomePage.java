package pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target ADD_TO_CART =
            Target.the("add to cart btn of {0}")
                    .locatedBy("//div[normalize-space()='{0}']/ancestor::div[@class='inventory_item_description']//button");

    public static final Target CART =
            Target.the("cart link")
                    .located(By.className("shopping_cart_link"));

}
