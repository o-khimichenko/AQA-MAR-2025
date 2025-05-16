Feature: combine interactions with web, api and sql

  @wip
  @severity=critical
  Scenario: get, store and google random person
    Given I request random people from API
    Given I store previously generated people id DB
    Given I pick random person from DB
    Given I load google page
    When I google random persons name
    Then Google does something

  @wip
  @severity=critical
  Scenario: get, store and google random person ADV
    Given I request random people from API as "TEAM A"
    Given I store "TEAM A" id DB
    Given I pick random person from DB as "OUR_WINNER"
    Given I load google page
    When I google name of "OUR_WINNER"
    Then Google does something

  @wip
  @severity=trivial
  Scenario: Google for specific name
    Given I have "John Doe" as "OUR_WINNER"
    Given I load google page
    When I google name of "OUR_WINNER"
    Then Google does something