Feature: Error pressing next without data in series

  Scenario:Try to press the next button with incorrect data
    Given Samuel wants to go to the services by entering incorrect data
    When he presses the next button incorrect date series
    Then he should see the text No se pudo guardar la colilla, por favor vuelva a intentarlo.