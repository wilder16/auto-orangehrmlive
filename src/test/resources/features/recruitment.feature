Feature: Recruitment

  Background:
    Given the administrator opens the website
    When  the administrator enters his username and password
      | userName | password |
      | Admin    | admin123 |
    Then  the user will be able to see the orangehrmlive dashboard

  @Recruitment
  Scenario Outline: Successful recruitment
    When  the administrator adds a candidate with the data
      | firstName    | middleName    | lastName    | vacancy   | email   | contactNumber    | keywords   | dateOfApplication     | note   | consentToKeepData      |
      | <FIRST_NAME> | <MIDDLE_NAME> | <LAST_NAME> | <VACANCY> | <EMAIL> | <CONTACT_NUMBER> | <KEYWORDS> | <DATE_OF_APPLICATION> | <NOTE> | <CONSENT_TO_KEEP_DATA> |
    And   shortlist the candidate
      | shortlistNote    |
      | <SHORTLIST_NOTE> |
    Examples:
      | ID | FIRST_NAME | MIDDLE_NAME | LAST_NAME    | VACANCY | EMAIL   | CONTACT_NUMBER | KEYWORDS | DATE_OF_APPLICATION | NOTE  | CONSENT_TO_KEEP_DATA | SHORTLIST_NOTE |
      ##@externaldata@./src/test/resources/datadriven/DataOrangeHrmLive.xlsx@Recruitment@1
   |1   |Wilder    |   |Bernal Lopez   |Junior Account Assistant   |w@w.com   |3126148527   |El mejor   |17-07-2024   |Nota1   |yes   |Nota2|
