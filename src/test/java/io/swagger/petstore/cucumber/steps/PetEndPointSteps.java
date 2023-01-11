package io.swagger.petstore.cucumber.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import io.swagger.petstore.model.PetPojo;
import io.swagger.petstore.petstoreinfo.PetStoreSteps;
import net.thucydides.core.annotations.Steps;

import java.util.ArrayList;

public class PetEndPointSteps {
    static ValidatableResponse response;
    static PetPojo.CategoryData categoryData;
    ArrayList<PetPojo.TagData> tags;
    static String photoUrl = "netplanet@co.uk";
    static int idFirst = 5;
    static int idsecond = 10;
    static String nameFirst = "Lola";
    static String namesecond = "Charlie";
    static int id = 23;
    static String name = "Lolakate";
    static String status = "available";
    static int pet;

    @Steps
    PetStoreSteps petStoreSteps;

    @When("^User sends a POST request by providing the information to id endpoint$")
    public void iCreateAPetWithEndpoint() {
        ArrayList<String> photoUrls = new ArrayList<>();
        photoUrls.add(photoUrl);
        tags = new ArrayList<>();
        PetPojo.TagData tagData = new PetPojo.TagData(idFirst, nameFirst);
        tags.add(tagData);
        categoryData = new PetPojo.CategoryData(idsecond, namesecond);

        response = petStoreSteps.createNewPetData(id, categoryData, name, photoUrls, tags, status);
    }

    @Then("^I must get back a valid status code 200$")
    public void iMustGetBackAValidStatusCode() {
        response.statusCode(200);
    }

    @When("^I send a get request to pet using petId endpoint$")
    public void iSendAGetRequestToPetUsingPetIdEndpoint() {
        response = petStoreSteps.getPetDetailById(id);
    }


    @When("^I update a pet with name$")
    public void iUpdateAPetWithName() {
        name = "Doggie";
        ArrayList<String> photoUrls = new ArrayList<>();
        photoUrls.add(photoUrl);
        tags = new ArrayList<>();
        PetPojo.TagData tagData = new PetPojo.TagData(idFirst, nameFirst);
        tags.add(tagData);
        categoryData = new PetPojo.CategoryData(idsecond, namesecond);
        response = petStoreSteps.updatePetById(id, categoryData, name, photoUrls, tags, status);
    }

    @When("^I delete a pet with endpoint of id$")
    public void iDeleteAPetWithEndpointOfId() {
        response = petStoreSteps.deletePetById(id);
    }
}
