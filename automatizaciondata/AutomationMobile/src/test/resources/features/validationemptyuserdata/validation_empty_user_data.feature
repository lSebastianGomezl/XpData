Feature: Fail to login without user


  Scenario: Try to login without user
    Given Samuel to log in to the app
    When he submits submit credentials without a user
    Then he should sees the text Debe ingresar un asesor