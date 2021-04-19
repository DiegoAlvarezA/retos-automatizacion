@bancolombia
Feature: Simulador de canon financiero

  Background:
    Given I am in the Simulador de canon financiero

  Scenario Outline: successful simulation
    When I fill the simulation form
      | assetValue | termContract | percentagePurchageOption | rateType |
      |<assetValue>|<termContract>|<percentagePurchageOption>|<rateType>|
    Then I see the simulation result

    Examples:
      | assetValue | termContract | percentagePurchageOption | rateType |
      | 150000000 | 20 | 8 | IPC |
