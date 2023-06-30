Feature: Error when other value input field is empty

  Scenario: Try to submit a form without input of another value
    Given Samuel wants to send the recharge without input data of another value
    When he enter data fields and press the next button
    Then he should then see the title Digita el valor a recargar