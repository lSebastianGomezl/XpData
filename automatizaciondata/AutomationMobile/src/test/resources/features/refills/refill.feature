Feature: Make a recharge service

  Scenario: try to make a recharge service
    Given Samuel wants to do a recharge
    When he selects the recharge and package service
    Then He should see form of information