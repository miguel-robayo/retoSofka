package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import pages.ProductPage;

public class ProductsPageTitle implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return ProductPage.TITLE.resolveFor(actor).getText();
    }

    public static ProductsPageTitle displayed(){
        return new ProductsPageTitle();
    }
}
