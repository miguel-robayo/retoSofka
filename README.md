automationE2E

End-to-end automation of the purchase flow on https://www.saucedemo.com/ using Serenity BDD (Screenplay),
Cucumber and Selenium WebDriver.

Automated flow
1. Log in with standard_user / secret_sauce
2. Validate the products page (Products)
3. Add two products to the cart (Sauce Labs Backpack, Sauce Labs Bike Light)
4. View the cart and go to checkout
5. Fill in the checkout form (First Name, Last Name, Postal Code)
6. Finish the purchase and validate the message THANK YOU FOR YOUR ORDER

Requirements
- Java 17
- Maven 3.9+
- Google Chrome

Project structure
- src/test/resources/features   -> Cucumber feature (test data and credentials)
- src/test/java/stepdefinitions -> Step definitions and actor setup
- src/test/java/tasks           -> Screenplay tasks (Login, AddProducts, FillOrderForm)
- src/test/java/questions       -> Screenplay questions (ProductsPageTitle, ConfirmationMessage)
- src/test/java/pages           -> Page targets (LoginPage, ProductPage, HomePage, CartPage, ModalPage)
- src/test/java/runners         -> PurchaseRunner
- src/test/resources/serenity.conf -> Browser configuration (Chrome password manager disabled to avoid the
  leaked-password popup that blocks clicks after login)

Running the tests using Maven
mvn clean verify -Dtest=PurchaseRunner

after execution, the Serenity report will be available at:

target/site/serenity/index.html
