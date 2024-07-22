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
      | firstName    | middleName    | lastName    | vacancy   | email   | contactNumber    | keywords   | dataOfApplication     | note   | consentToKeepData      |
      | <FIRST_NAME> | <MIDDLE_NAME> | <LAST_NAME> | <VACANCY> | <EMAIL> | <CONTACT_NUMBER> | <KEYWORDS> | <DATA_OF_APPLICATION> | <NOTE> | <CONSENT_TO_KEEP_DATA> |
    And   shortlist the candidate
      | shortlistNote    |
      | <SHORTLIST_NOTE> |
    Examples:
      | ID | FIRST_NAME | MIDDLE_NAME | LAST_NAME    | VACANCY | EMAIL   | CONTACT_NUMBER | KEYWORDS | DATA_OF_APPLICATION | NOTE  | CONSENT_TO_KEEP_DATA | SHORTLIST_NOTE |
      ##@externaldata@./src/test/resources/datadriven/DataOrangeHrmLive.xlsx@Recruitment@1
   |1   |Wilder    |de Jesus    |Bernal Lopez   |QA LEAD   |w@w.com   |3126148527   |El mejor   |2024-22-07   |Nota1   |yes   |Nota2|
