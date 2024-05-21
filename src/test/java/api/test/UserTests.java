package api.test;

import api.Payloads.User;
import api.endpoints.*;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserTests {
    User userPayload;
    Faker faker;
    public Logger logger;

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

        //log
        logger= LogManager.getLogger(this.getClass());
    }
    @Test(priority = 1)
    public  void testPostUser(){

        logger.info("CreteUser  "+"payload: "+"id= "+ userPayload.getId()+", Username= "+userPayload.getUsername()+", First name= "+userPayload.getFirstName()+", Phone=");
        Response response=UserEndPoints.createUser(userPayload);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(),200);
        response.then().statusCode(200);
    }

    @Test(priority = 2)
    public  void testGetUser(){
        Response response=UserEndPoints.readUser(userPayload.getUsername());
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
    public  void testDeleteUser(){
        Response response=UserEndPoints.deleteUser(userPayload.getUsername());
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(),200);
    }





}
