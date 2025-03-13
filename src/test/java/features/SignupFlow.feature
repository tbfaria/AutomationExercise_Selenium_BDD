Feature: User Signup Flow

  Scenario: Verify that the Home Page is visible
    Given I am on the Home Page
    Then the Home Page should be visible

  Scenario: Validate new users can Signup
    Given User navigates to the SignupLogin page
    When User enters signup details
   # And Enters new account information
   # Then Account Created message is visible