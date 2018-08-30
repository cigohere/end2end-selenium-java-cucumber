Feature: Users Page

  This feature file to verify Users page

  Background: Login Needle page
    Given I have logged into Needle page

  Scenario: Users Page - Header Title
    When I open Users page
    Then The header title should be displayed as "Users"

  Scenario: User Page - Search an existed user
    When I open Users page
    And I click on All Users tab
    When I enter value as "thomas.truong@shopback.com" into search field