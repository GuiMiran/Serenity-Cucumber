Feature: Check the correct behavior of the login features in the ecommerce

  Scenario: Login with invalid or non registered credentials
    Given the Guido wants to access to the ecommerce
    When the Guido fill the login mandatory field: nexoqa1@gmail.com and password123
    Then the ecommerce should be show an error feedback
    """
    Authentication failed
    """
