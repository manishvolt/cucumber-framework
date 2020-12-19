Feature: Amazon health check
Scenario: user is able to launch browser, launch the site and search for a product

Given user opened browser
And user launched site
When user searched a product
Then results as per search conducted got dislayed



Scenario: user clicks on a product and see description


When user clicks on a product
Then product description is shown