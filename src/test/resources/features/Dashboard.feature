Feature: Login feature

  User Story:
  As a user, I should be able to go to Contact us page from dashboard Page.

  @contact
  Scenario: Dashboard Title Verification
    Given user is on the dashboard of the application
    When user clicks on contact us button
    Then user should see the title "Contact Us | Sales | Headquarters | Support Portal"
