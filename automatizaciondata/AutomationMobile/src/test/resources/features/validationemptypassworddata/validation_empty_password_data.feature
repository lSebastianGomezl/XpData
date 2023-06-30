Feature: Failed to login without password


  Scenario: Try to login without password
    Given Samuel to log in to the application
    When he submits submit credentials without a password
    Then he should see the text Debe ingresar una contrase