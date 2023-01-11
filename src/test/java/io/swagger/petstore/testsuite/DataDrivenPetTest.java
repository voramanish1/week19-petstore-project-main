package io.swagger.petstore.testsuite;

import io.swagger.petstore.model.PetPojo;
import io.swagger.petstore.petstoreinfo.PetStoreSteps;
import io.swagger.petstore.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

@Concurrent(threads = "2x")
@UseTestDataFrom("src/test/java/resourses/testdata/pet.csv")
@RunWith(SerenityParameterizedRunner.class)
public class DataDrivenPetTest extends TestBase {
    private int id;
    private String name;
    private String status;
    private String photoUrl;
    private int id1;
    private String name1;
    private int id2;
    private String name2;

    @Steps
    PetStoreSteps petStoreSteps;
    @Title("Data driven test for multiple pet to the pet")
    @Test
    public void createMultiplePet(){
        ArrayList<String> photoUrls = new ArrayList<>();
        photoUrls.add(photoUrl);
        ArrayList<PetPojo.TagData> tags  = new ArrayList<>();
        PetPojo.TagData tagData = new PetPojo.TagData(id2,name2);
        tags.add(tagData);
        PetPojo.CategoryData categoryData = new PetPojo.CategoryData(id1,name1);
        petStoreSteps.createNewPetData(id,categoryData,name,photoUrls,tags,status).statusCode(200);
    }
}
