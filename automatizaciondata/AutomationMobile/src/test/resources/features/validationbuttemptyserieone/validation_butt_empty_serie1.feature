Feature: Error when pressing next with empty series1

  Scenario: Try to press the following button without data in the series1 field
    Given Samuel wants to go to the services with series1 without data
    When he presses the next button without serial1 data
    Then he should sees the title Debe ingresar las series de las colillas.