automationAPI

REST API automation of the signup and login services of https://www.demoblaze.com/ using Karate (JUnit 5).

Services under test
- Signup: POST https://api.demoblaze.com/signup
- Login:  POST https://api.demoblaze.com/login

Request body (both services)
{ "username": "<user>", "password": "<password encoded in Base64>" }

Scenarios
1. Create a new user              -> ""
2. Create an existing user        -> {"errorMessage":"This user already exist."}
3. Login with valid credentials   -> "Auth_token: <token>"
4. Login with a wrong password    -> {"errorMessage":"Wrong password."}
5. Login with a user that does not exist -> {"errorMessage":"User does not exist."}

All responses return HTTP 200; errors are identified by the errorMessage field.
A unique username is generated on every execution (sofka_<timestamp>).

Requirements
- Java 17
- Maven 3.9+

Project structure
- src/test/java/auth/signupLogin.feature -> Karate scenarios (inputs and outputs)
- src/test/java/auth/SignupLoginRunner.java -> JUnit 5 runner

Running the tests using Maven (from the api folder)
cd api
mvn clean verify -Dtest=SignupLoginRunner

after execution, the Karate report (with the request and response of each scenario) will be available at:

api/target/karate-reports/karate-summary.html
