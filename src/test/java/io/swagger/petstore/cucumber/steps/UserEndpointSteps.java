package io.swagger.petstore.cucumber.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import io.swagger.petstore.petstoreinfo.UserStoreSteps;
import io.swagger.petstore.testbase.TestBase;
import io.swagger.petstore.utils.TestUtils;
import net.thucydides.core.annotations.Steps;

public class UserEndpointSteps extends TestBase {
    static int id = 8;
    static String username = "jennysm";
    static String firstName = "jenny";
    static String lastName = "smith";
    static String email = "jennysm@gmail" + TestUtils.getRandomValue();
    static String password = "jpo123";
    static String phone = "12598745";
    static int userStatus = 125;
    static ValidatableResponse response;

    @Steps
    UserStoreSteps userStoreSteps;

    @When("^I create a user$")
    public void iCreateAUser() {
        response = userStoreSteps.createNewUser(id, username, firstName, lastName, email, password, phone, userStatus);
    }

    @Then("^I must have valid status code 200$")
    public void iMustHaveValidStatusCode() {
        response.statusCode(200);
    }

    @When("^I send a get request to user using username endpoint$")
    public void iSendAGetRequestToUserUsingUsernameEndpoint() {
        response = userStoreSteps.getUserByUserName(username);
    }

    @When("^I update a user with name$")
    public void iUpdateAUserWithName() {
        firstName = "Katie";
        response = userStoreSteps.updateUser(id, username, firstName, lastName, email, password, phone, userStatus);
    }

    @Then("^I verify with endpoint by username and validate status$")
    public void iVerifyWithEndpointByUsernameAndValidateStatus() {
        response = userStoreSteps.getUserByUserName(username);
        response.statusCode(200);
    }

    @When("^I delete a user with endpoint of username$")
    public void iDeleteAUserWithEndpointOfUsername() {
        response = userStoreSteps.deleteUser(username);
    }
}

