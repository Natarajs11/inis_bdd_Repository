Feature: To check the successful visit to inis visa status page

  @us001
  Scenario Outline: successful visit to inis webpage
    Given browser is open
    Then user enters <text>
    And hits the enter
    Then user will be navigated to search results

    Examples: 
      | text                    |
      | "inis check irish visa" |

  @us002
  Scenario: Users selects indian nationality
    Given user is on the inis visa required page
    Then user selects nationality
    And hits on select button
    Then user is navigated to visa-required page
    And when user select more than three months.
    Then user is navigated to study page.
    And when user clicks on the study link
    Then user is navigated to visa long study page

  @us003
  Scenario: Users selects France nationality
    Given user is on the website
    When user selects nationality from drop down list
    And user hits select button
    Then user is navigated to visa not required page.

  @us004
  Scenario: User selects canadian nationality
    Given User has visited inis website
    When user selects his nationality from drop down list
    And hits on the select button
    Then Users are navigated to visa requiremnt page
    And when user select more than 3 months option.
    Then users are navigated to study page.
    And when users clicks on the study link
    Then Users are navigated to visa not required page
