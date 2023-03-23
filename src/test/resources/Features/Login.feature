
Feature: Check Trendyol Login functionality
  Scenario: Validate Trendyol Login is working
    Given browser is open
    And user is on trendyol login page
    And close popups
    When user clicks signin
    And set email and password
    And hits Enter
    Then user is navigated to the site

