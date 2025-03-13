Feature: General View

  Scenario: Validate general user is able to view products without loggin in
    Given User navigates to Online product page
    When User clicks on Formal Shoes drop down
    Then User should be able to view the Products