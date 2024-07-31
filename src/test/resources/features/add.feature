Feature: Add

  Scenario: Successfully Getting Added Value
    Given User Navigates to the calculator app
    And User Gives Value on the First Input Box
    And User Gives Value on the Second Input Box
    When User Clicks on the Add Button
    Then The Result Should Match the Addition of Two Values
