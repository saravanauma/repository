@tag
Feature: Login into application
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Login with positive scenarios 
    Given Launch the application
    When Go to the signin page usser email <name> and user password <Password>
    Then Close the application

    Examples: 
      | name  | Password |
      | saravanakumar@mallow-tech.com | Mallow@2345% |
      | saravanakumar@mallow-tech.com | Mallow@12345% |
