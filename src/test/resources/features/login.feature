Feature: Login

  @Login
  Scenario Outline: Successful login
    Given the administrator opens the website
    When  the administrator enters his username and password
      | userName   | password   |
      | <USERNAME> | <PASSWORD> |
    Then  the user will be able to see the orangehrmlive dashboard


    Examples:
      | ID | USERNAME | PASSWORD |
      ##@externaldata@./src/test/resources/datadriven/DataOrangeHrmLive.xlsx@Login@1
   |1   |Admin   |admin123|


