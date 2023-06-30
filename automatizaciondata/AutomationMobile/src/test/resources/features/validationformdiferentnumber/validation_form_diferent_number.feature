Feature: Error when numbers are different

  Scenario:try to submit a form with different top-up numbers
    Given Samuel to send a form with different recharge numbers
    When he enters the fields and presses the next button
    Then he should then see the text Los numeros a recargar no coinciden