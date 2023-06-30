Feature: Error when operator field is empty

  Scenario: try to submit a form with no data in the operator
    Given Samuel wants to send the recharge without operator data
    When he introduce data fields and press the next button
    Then he should then see the title Selecciona un operador.