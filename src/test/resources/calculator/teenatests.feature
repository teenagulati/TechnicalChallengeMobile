Feature: Tests for calc

  Scenario: tests operations on calc

    Given user is opened the app
    When and select ok on intro screen
    And tap 6 button
    And tap plus button
    And tap 1 button
    And tap = button
    Then user should get correct answer
    Then close app
