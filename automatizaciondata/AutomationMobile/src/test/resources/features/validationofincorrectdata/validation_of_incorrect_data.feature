Feature: Error when login fields in incorrect


  Scenario: Try to login with incorrect credentials
    Given Samuel wants to access the app
    When he submits credentials incorrect data
    Then he should see the text El vendedor no existe