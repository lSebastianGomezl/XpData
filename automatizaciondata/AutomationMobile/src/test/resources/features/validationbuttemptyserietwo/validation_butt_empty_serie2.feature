Feature: Error when pressing next with empty series2

  Scenario: Try to press the following button without data in the series2 field
    Given Samuel wants to go to the services with series2 without data
    When he presses the next button without serial2 data
    Then he should sees the title with text Debe ingresar las series de las colillas.