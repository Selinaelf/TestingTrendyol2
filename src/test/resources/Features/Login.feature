
Feature: Check Trendyol Login functionality
  Scenario: Validate Trendyol Login is working
    Given browser is open
    And user is on trendyol login page
    When user enters mail and password
    And hits Enter
    Then user is navigated to the site

