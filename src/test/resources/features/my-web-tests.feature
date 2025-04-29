Feature: tests for my web stuff

#  TODO: move your tests to cucumber

  @regression
  Scenario: Google something
    Given I load google page
    When I google for "Ben Affleck"
    Then Google does something