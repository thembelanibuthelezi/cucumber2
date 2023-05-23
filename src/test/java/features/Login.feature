Feature: Application Login

  Background:
  Given validate the browser
  When Browser is triggered
  Then  Check if browser is displayed


  @RegTest
  Scenario: Home page default login

  Given User is on NetBanking landing page
  When User login into application with "jin" and password "1234"
  Then  Home page is populated
  And Cards are display are "true"

  @MobileTest
  Scenario: Home page default login

  Given User is on NetBanking landing page
  When User login into application with "john" and password "4321"
  Then Home page is populated
  And Cards are display are "false"



  Scenario: Home page default login

  Given User is on NetBanking landing page
  When User sign up with following details
    | jenny | abcd | john@abcdcom | Autralia | 3242353 |
  Then Home page is populated
  And Cards are display are "false"


  Scenario Outline: Home page default login

  Given User is on NetBanking landing page
  When User login into application with <Username> and passwordd <password>
  Then Home page is populated
  And Cards are display are "true"
    Examples:
      | Username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |
      | user4    | pass4    |



