Feature: Register and delete user

  Scenario: Successfully register and delete a user
    Given user navigates to the signup page
    When creates a new account
    Then the user is successfully created
    And I delete the created user
    Then the user is successfully removed