@nihal
Feature: As a user ,I should be able to search with Browse By Category link , at the bottom line

  Background:
    Given The User is on the homepage
    When The user scroll down the page
    Then The user clicks on Browse by Category link


  Scenario: Verify link and title

    And The user should land on the used cars page and the title should be Used Cars for Sale-CarMax



    Scenario: Verify the shop by brand
      And The user should see the following Shop by brand subcategories

      |Toyota       |
      |Chevrolet    |
      |Ford         |
      |Honda        |
      |Nissan       |
      |Jeep         |
      |Dodge        |
      |Lexus        |
      |Mercedes-Benz|
      |GMC          |
      |Hyundai      |

      And The user should be able to see these brands under the "Shop by brand" text



      Scenario: Verify the Search by popular location links
        And The user clikcs "Toyota"
        Then The user scrolls down the page
        And The user should see the Search by popular location text
        And The user should see the following popular location links

        | Atlanta, GA    |
        | Denver, CO     |
        | Houston, TX    |
        | Los Angeles, CA|
        | Miami, FL      |
        | Austin, TX     |
        | Charleston, SC |
        | Orlando, FL    |
        | Santa Rosa, CA |




















