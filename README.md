retoSofka

Technical automation challenge. Each folder is an independent Maven project.

- front -> E2E automation of the purchase flow on https://www.saucedemo.com/
           (Serenity BDD, Screenplay, Cucumber, Selenium). See front/README.md
- api   -> REST API automation of the signup and login services of https://www.demoblaze.com/
           (Karate, JUnit 5). See api/README.md

Requirements
- Java 17
- Maven 3.9+
- Google Chrome (front only)

Running the tests using Maven
There is no pom.xml in the root folder, run Maven from each project folder:

  front
  cd front
  mvn clean verify -Dtest=PurchaseRunner
  report: front/target/site/serenity/index.html

  api
  cd api
  mvn clean verify -Dtest=SignupLoginRunner
  report: api/target/karate-reports/karate-summary.html

Or from the root folder using -f:
  mvn -f front/pom.xml clean verify -Dtest=PurchaseRunner
  mvn -f api/pom.xml clean verify -Dtest=SignupLoginRunner

Note: the api .feature file is executed by Karate, run it through SignupLoginRunner (not as a Cucumber feature).
