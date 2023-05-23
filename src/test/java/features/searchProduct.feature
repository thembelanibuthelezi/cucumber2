Feature: Search and Place order for Products

Scenario: Search Experience for product search in both home and Offers page

Given User is on GreenCart Landing page
When User searched with Shortname "Tom" and extracted actual name of product
Then User searched for "Tom" shortname in offers page to check if product exist
And Validate product name in offers matches with Landing Page