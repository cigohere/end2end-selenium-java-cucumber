Feature: Customer Profile page

  This feature file to verify Custom Profile page

  Background: Login Needle page
    Given I have logged into Needle page

  Scenario: Custom Profile Page - Header Title
    When I open Custom Profile page
    Then The header title should be displayed as "Customer Profile"

  Scenario: Custom Profile Page - Search a Customer Profile
    When I open Custom Profile page
    And I select search by "id"