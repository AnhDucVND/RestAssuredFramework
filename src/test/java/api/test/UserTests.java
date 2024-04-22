package api.test;

import api.Payloads.User;
import api.endpoints.*;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserTests {
    User userPayload;
    Faker faker;

    @BeforeClass
    public void setupData(){
        faker=new Faker();

        userPayload=new User();

        userPayload.setId(faker.idNumber().hashCode());
        userPayload.setUsername(faker.name().username());
        userPayload.setFirstName(faker.name().firstName());
        userPayload.setLastName(faker.name().lastName());
        userPayload.setEmail(faker.internet().emailAddress());
        userPayload.setPassword(faker.internet().password(5,10));
        userPayload.setPhone(faker.phoneNumber().cellPhone());
    }
    @Test(priority = 1)
    public  void testPostUser(){
        Response response=UserEndPoints.createUser(userPayload);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(),200);
        response.then().statusCode(200);
    }

    @Test(priority = 2)
    public void readUser(){
        Response response=UserEndPoints.readUser(this.userPayload.getUsername());
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(),200);
    }

    @Test(priority = 3)
    public void testUpdateUser(){
        userPayload.setFirstName(faker.name().firstName());
        userPayload.setLastName(faker.name().lastName());
        userPayload.setEmail(faker.internet().emailAddress());

        Response response= UserEndPoints.updateUser(userPayload, this.userPayload.getUsername());
        response.then().log().body();
        response.then().statusCode(200);

        Response afterUpdateRes= UserEndPoints.readUser(this.userPayload.getUsername());
        afterUpdateRes.then().log().body();
        afterUpdateRes.then().statusCode(200);

    }

    @Test(priority = 4)
    public void testDeleteUser(){

        Response response= UserEndPoints.deleteUser(this.userPayload.getUsername());
        response.then().statusCode(200);

    }


}
