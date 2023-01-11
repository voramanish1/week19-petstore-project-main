Feature: Testing different request of pets on the petstore application
  As I user I want to send GET, POST, PUT, and Delete requests
  #This Scenario is for pet api endpoint
    Scenario: Check if the pet store application pet api can be accessed by POST request
    When User sends a POST request by providing the information to id endpoint
    Then I must get back a valid status code 200

    Scenario: Check if the pet store application pet api can be accessed by GET request
      When I send a get request to pet using petId endpoint
      Then I must get back a valid status code 200

     Scenario: update pet with name
       When I update a pet with name
       Then I must get back a valid status code 200

      Scenario: Delete pet with using id and verify
        When I delete a pet with endpoint of id
        Then I must get back a valid status code 200


