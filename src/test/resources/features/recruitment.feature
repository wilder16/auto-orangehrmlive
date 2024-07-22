Feature: Recruitment

  @Recruitment
  Scenario Outline: Successful recruitment
    Given the administrator is logged in successfully
    When  the administrator adds a candidate with the data
      | firstName    | middleName    | lastName    | vacancy   | email   | contactNumber    | keywords   | dataOfApplication     | note   | consentToKeepData      |
      | <FIRST_NAME> | <MIDDLE_NAME> | <LAST_NAME> | <VACANCY> | <EMAIL> | <CONTACT_NUMBER> | <KEYWORDS> | <DATA_OF_APPLICATION> | <NOTE> | <CONSENT_TO_KEEP_DATA> |
    And   shortlist the candidate
      | shortlistNote    |
      | <SHORTLIST_NOTE> |
    Examples:
      | ID | FIRST_NAME | MIDDLE_NAME | LAST_NAME | VACANCY | EMAIL | CONTACT_NUMBER | KEYWORDS | DATA_OF_APPLICATION | NOTE | CONSENT_TO_KEEP_DATA | SHORTLIST_NOTE |
      ##@externaldata@./src/test/resources/datadriven/DataOrangeHrmLive.xlsx@Recruitment@1