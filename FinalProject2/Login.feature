Feature: Login
@Smoke
Scenario Outline: Successful login
Given user Launch Chrome browser
When user opens URL 'https://www.saucedemo.com/' for test
And enters <LoginUsernameBDD> and <LoginPasswordBDD>
And user click on LoginButton
Then all products are displayed
  Examples:
      | LoginUsernameBDD        | LoginPasswordBDD |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |


