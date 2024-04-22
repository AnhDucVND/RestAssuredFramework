package api.test;

import api.Payloads.User;
import api.endpoints.UserEndPoints;
import api.utilities.DataProviders;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DDTest {
    @Test(priority = 1, dataProvider = "Data", dataProviderClass = DataProviders.class)
    public void testPostUser(String userId, String userName, String fname,String lname, String email,String pwd,String phone){
        User userPayload=new User();
        userPayload.setId(Integer.parseInt(userId));
        userPayload.setUsername(userName);
        userPayload.setFirstName(fname);
        userPayload.setLastName(lname);
        userPayload.setEmail(email);
        userPayload.setPassword(pwd);
        userPayload.setPhone(phone);

        Response response= UserEndPoints.createUser(userPayload);
        response.then().log().all();
        response.then().statusCode(200);
        Assert.assertEquals(response.getStatusCode(),200);
    }

    @Test(priority = 2,dataProvider = "UserNames", dataProviderClass = DataProviders.class)
    public void deleteUser(String userName){
        Response response=UserEndPoints.deleteUser(userName);
        response.then().log().all();
        response.then().statusCode(200);
    }
}
