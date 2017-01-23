Feature: Number gets generated

  Scenario: NumberGenerator only produces numbers within boundaries

    Given a 100 numbers are generated

    When the generation is done

    Then the collection must contain all values between 0-10 inclusive

