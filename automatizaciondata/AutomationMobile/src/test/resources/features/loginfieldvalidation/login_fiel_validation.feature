Feature: Error when login fields in empty


  Scenario: Try to login with no credentials
    Given Samuel wants to access the application
    When he submits credentials without data
    Then he should see the text Debe ingresar un asesor