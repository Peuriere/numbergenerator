Feature: validate the meaning of life

  Scenario Outline: can handle any input
    Given The guess is <guess>
    When the guess is validated
    Then the answer is <answer>
    Examples:
     | guess | answer |
     | 23    | false  |
     | 42    | true   |
     | sdlf  | false  |