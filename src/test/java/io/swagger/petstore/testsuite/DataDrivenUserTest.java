package io.swagger.petstore.testsuite;

import io.swagger.petstore.petstoreinfo.UserStoreSteps;
import io.swagger.petstore.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@Concurrent(threads = "2x")
@UseTestDataFrom("src/test/java/resourses/testdata/PetstoreUser.csv")
@RunWith(SerenityParameterizedRunner.class)
public class DataDrivenUserTest extends TestBase {
    private int id;
    private String username;
    private String firstName ;
    private String lastName;
    private String email;
    private String password ;
    private String phone;
    private int userStatus;

    @Steps
    UserStoreSteps userStoreSteps;
    @Title("data driven test for multiple user create")
    @Test
    public void createMultipleUser(){
        userStoreSteps.createNewUser(id,username,firstName,lastName,email,password,phone,userStatus).statusCode(200);
    }
}
