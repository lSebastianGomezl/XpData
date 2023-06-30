Feature: Error pressing next without series

  Scenario: Try to press the next button without serial data
    Given Samuel wants to go to services without entering strings
    When he presses the next button without series
    Then he should see the text Debe ingresar las series de las colillas.
