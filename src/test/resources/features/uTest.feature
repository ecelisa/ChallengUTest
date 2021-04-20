#Autor: Elian
@stories
Feature: UTest Platform
  As a person, I want check in the UTest platform
  @scenario1
  Scenario: Register successfully
    Given than Alejandro wants check in the UTest platform
    When he fills the form
      | txtName | txtLastName | txtEmail  | txtMonth  | txtDay  | txtYear | txtLanguage | txtPassword | txtConfirm  |
      | Alejandro | Perez     | alejandrop@gmail.com  | September | 15  | 1994  | Spanish | AlejandroP2021* | AlejandroP2021* |
    Then he is register successfully
      | txtQuestion |
      | The last step |