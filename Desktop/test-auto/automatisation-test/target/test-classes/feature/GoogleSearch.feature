Feature: Google search
  As user i want test google search function

  Scenario: basic search
    Given I open google search page
    When I lookup the word "Selenium"
    Then search result display the word "Selenium"