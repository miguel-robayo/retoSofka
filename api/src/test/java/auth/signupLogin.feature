  Feature: Demoblaze signup and login API

  Background:
    * url 'https://api.demoblaze.com'
    * def generateUsername = function(){ return 'sofka_' + java.lang.System.currentTimeMillis() }
    * def username = callonce generateUsername
    * def password = java.util.Base64.getEncoder().encodeToString(new java.lang.String('Test1234').getBytes())
    * def wrongPassword = java.util.Base64.getEncoder().encodeToString(new java.lang.String('Wrong1234').getBytes())

  Scenario: 1 - Create a new user
    Given path '/signup'
    And request { username: '#(username)', password: '#(password)' }
    When method POST
    Then status 200
    * print response
    And match response.trim() == '""'

  Scenario: 2 - Create an existing user
    Given path '/signup'
    And request { username: '#(username)', password: '#(password)' }
    When method POST
    Then status 200
    * print response
    And match response.errorMessage == 'This user already exist.'

  Scenario: 3 - Login with valid username and password
    Given path '/login'
    And request { username: '#(username)', password: '#(password)' }
    When method POST
    Then status 200
    * print response
    And match response contains 'Auth_token:'

  Scenario: 4 - Login with invalid username and password
    Given path '/login'
    And request { username: '#(username)', password: '#(wrongPassword)' }
    When method POST
    Then status 200
    * print response
    And match response.errorMessage == 'Wrong password.'

  Scenario: 5 - Login with a user that does not exist
    Given path '/login'
    And request { username: '#(username + "_notexist")', password: '#(password)' }
    When method POST
    Then status 200
    * print response
    And match response.errorMessage == 'User does not exist.'
