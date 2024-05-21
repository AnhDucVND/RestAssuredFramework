package api.test.VND_OMS.ClientToOms;

import api.Payloads.User;
import api.endpoints.UserEndPoints;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import api.TagFix.*;

public class PendingNewOrderStatus {

    TagFix tagFix;
    String logMsg="8=FIX.4.4^A9=383^A35=8";
    String valueOf35="8";

    @BeforeClass
    public void setupData(){
        tagFix= new TagFix(logMsg);
    }
    @Test(priority = 1)
    public  void testPendingNewAllTag(){
        tagFix.checkTag_8();
        tagFix.checkTag_9();
        tagFix.checkTag_35(valueOf35);
    }
    @Test(priority = 2)
    public void testTag8(){
        tagFix.checkTag_8();
    }



}
