Feature: Testing different request of user on the petstore application
  As a User I check different endpoints of user sections
  Scenario: check user added into petstores and verify status code
    When I create a user
    Then I must have valid status code 200

  Scenario: get  single pet data using by id
    When I send a get request to user using username endpoint
    Then I must have valid status code 200

  Scenario: update pet with name
    When I update a user with name
    Then I must have valid status code 200

  Scenario: Delete pet with using id and verify
    When I delete a user with endpoint of username

    Then I must have valid status code 200
