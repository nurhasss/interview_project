Feature: Login feature

  User Story:
  As a user, I should be able to login with correct credentials to employee account and dashboard should be displayed.



  @employee
  Scenario: Login as ..
    Given user is on the main page of the application
    When user clicks on..
    And user enters employee password
    Then user should see the dashboard
    #This is how we can comment in feature file