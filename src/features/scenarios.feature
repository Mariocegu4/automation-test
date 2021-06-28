Feature: This feature will include all scenarios needed to comply from the Readme file

  @S1 @test
  Scenario: Specific scenario detailed at Readme file
    Given A user enters the API
    When A user enters "Batman" in the "Search" textBox
    And User clicks "Search" button
    Then User click on the "2" card URL of movie search
    And Navigate back
    And Change css background color to "#4a148c" to card title "Batman Unlimited"
    Then User clicks "Back" button
    And Input for "Search" textbox is empty

