Feature: Address Book Sign Up
  
  Scenario Outline: Create New Account
    Given User is on Sign Up page
    When User enters email "<email>"
    And User enters password "<password>"
    And User clicks Sign Up
    Then User verifies if "message" is displayed

    Examples: 
      | email               | password |
      | giancarlo@gmail.com |   123456 |
      | tatiana@gmail.com   |   123456 |
      | anthony@gmail.com   |   123456 |


  Scenario Outline: User Logs In and Registers
    Given User is on Sign In page
    When User enters credentials "<email>" "<password>"
    And User clicks Sign In
    And User navigates to New Address Page
    And User enters first name "<firstname>"
    And User enters last name "<lastname>"
    And User enters address "<address>"
    And User enters secundary address "<secundaryaddress>"
    And User enters city "<city>"
    And User selects state "<state>"
    And User enters zip code "<zipcode>"
    And User clicks US country radio
    And User enters age "<age>"
    And User enters phone "<phone>"
    Then User clicks Create Address

    Examples: 
      | email               | password | firstname | lastname | address       | secundaryaddress | city   | state | zipcode  | age | phone      |
      | giancarlo@gmail.com |   123456 | Giancarlo | Mena     | RR1 Box 11961 | N/A              | Manati | PR    | 00674    | 31  | 7873680546 |
      | tatiana@gmail.com   |   123456 |Tatiana    | Acevedo  | RR1 Box 11961 | N/A              | Manati | PR    | 00674    | 31  | 7873680546 |
      | anthony@gmail.com   |   123456 | Anthony   | Mena     | RR1 Box 11961 | N/A              | Manati | PR    | 00674    | 31  | 7873680546 |