Feature: Error when form fields are empty

  Scenario: Try to submit a form with no data
    Given Samuel wants to send the recharge
    When he presses the next button
    Then he should then see the text Selecciona un operador.