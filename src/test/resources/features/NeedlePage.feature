Feature: Needle Page

  This feature to verify UI Needle page

  Background: Login Needle page
    Given I have logged into Needle page

  Scenario: Needle Page- Header Title and Email
    Then The header title should be displayed as "Needle"
    And The top left email should be displayed as "thomas.truong@shopback.com"
    And The group title of Users page should be displayed as "Shopbackers"