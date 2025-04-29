Feature: Testing some feature

#  Password rules:
#  - 8 chars
#  - 1 digit
#  - 1 capital lettter
#  - 1 spec symbol

  Background:
    Given something always happens

  @regression @exclude
  Scenario: my first test scenario
    Given I enter "asdasdas" as login
    Given I enter "A1!aaaaa" as password
    Given I enter 14 as age
    When I press register
    Then Operation is successful

    @exclude
  Scenario: my first test scenario
    Given I enter "asdasdasasdasdas" as login
    When I press register
    Then Operation is successful

  Scenario: my first test scenario
    Given I enter "asdasda" as login
    When I press register
    Then Operation has failed

  Scenario: my first test scenario
    Given I enter "asdasdasasdasdasa" as login
    When I press register
    Then Operation has failed

  @regression
  Scenario Outline: my first test scenario
    Given I enter "asdasdas" as login
    Given I enter "<password>" as password
    When I press register
    Then Operation has failed
    Examples:
      | password |
      | Aa!aaaaa |
      | A1aaaaaa |
      | a1!aaaaa |
      | Aa!aaaa  |
