Feature: Avoid a recharge service

  Scenario: try to avoid a recharge service
    Given Samuel wants to avoid a recharge
    When he enters the information in the form and avoid
    Then He should see text recarga exitosa