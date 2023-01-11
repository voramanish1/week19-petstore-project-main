Feature: Pet Store Application
  As a user I want to test Pet Store Application

  Scenario Outline: Pet CRUD Test
    Given Pet store Application running
    When I create a new pet by providing the information id "<id>" idFirst "<idFirst>" name "<name>" nameFirst "<nameFirst>" photoUrl"<photoUrl>"idsecond "<idsecond>" namesecond "<namesecond>" status"<status>"
    Then I verify A pet with "<id>" is created
    And I update the pet information id "<id>" idFirst "<idFirst>" name "<name>" nameFirst "<nameFirst>" photoUrl"<photoUrl>"idsecond "<idsecond>" namesecond "<namesecond>" status"<status>"
    And The pet with "<id>" is updated successfully
    And I delete the pet that created with "<id>"
    Then The pet deleted successfully from the application

    Examples:
      | id | idFirst | name   | nameFirst | photoUrl      | idsecond | namesecond | status        |
      | 10 | 12      | Sandy  | doggies   | www.image.com | 32       | Husky      | available     |
      | 15 | 20      | Candy  | Cat       | www.photo.com | 72       | Johny      | not available |


#This is User CRUD test
  Scenario Outline: User CRUD Test
    Given Pet store Application running
    When I create new user by providing the information id "<id>" username "<username>" firstName"<firstName>" lastName "<lastName>"  email "<email>" password"<password>" phone "<phone>"userStatus "<userStatus>"
    Then I get that created user with "<username>" is created
    And I update the user with information id "<id>" username "<username>" firstName"<firstName>" lastName "<lastName>" email "<email>" password"<password>" phone "<phone>"userStatus "<userStatus>"
    And I verify user updated with "<username>" successfully
    And I delete created user with username "<username>"
    Then the user with username "<username>" is deleted successfully from the application


    Examples:
      | id | username | firstName | lastName | email          | password  | phone      | userStatus |
      | 5  | Zoe      | Jola      | Can      | Zoe@gmail.com  | zoe123    | 7825693856 | 0          |
      | 10 | Joza     | Copper    | San      | Joza@gmail.gov | joza123   | 7856985654 | 1          |
