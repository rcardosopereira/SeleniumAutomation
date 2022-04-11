Feature: The awesome Q/A tool
Scenario: Creation Question
  Given access in the localhost
  When I write the question and answer
    |Question|Answer|
    |How are you?|I'm fine. Thank you|
    |What´s your name?|My name is John.|
    |34.453|Numbers|
    |@#$%!|special character|
    |0,02|Numbers|
  Then I see the question created

  Scenario: Sort Questions
    Given access in the localhost to click in a sort button
    When I write the question and answer
      |Question|Answer|
      |How are you?|I'm fine. Thank you|
      |What´s your name?|My name is John.|
      |34.453|Numbers|
      |@#$%!|special character|
      |0,02|Numbers|
    And I click in the Sort Questions button
    Then I see the question created by sort

  Scenario: Remove Questions
    Given access in the localhost to delete
    When I write the question and answer
      |Question|Answer|
      |How are you?|I'm fine. Thank you|
      |What´s your name?|My name is John.|
      |34.453|Numbers|
      |@#$%!|special character|
      |0,02|Numbers|
    And I click in the Remove Questions button
    Then I see the message No questions yet


