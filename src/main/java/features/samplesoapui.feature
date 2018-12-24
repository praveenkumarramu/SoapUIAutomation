Feature: Launch a Page

  Scenario: Launch a google home

    Given Setup the XMl Request
    When make post request
   Then Validate the Response Code



    Given Setup the XML
    When make get request
    Then validate the response Code
    And Validate the Response Message