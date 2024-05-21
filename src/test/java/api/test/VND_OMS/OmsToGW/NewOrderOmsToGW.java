package api.test.VND_OMS.OmsToGW;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewOrderOmsToGW {
    String logMsg="8=FIX.4.4^A9=0313^A35=D^A34=0000000000^A49=IOMS_1_STO^A56=HSX_GATEWAY^A43=N^A52=000000000000000000000^A122=000000000000000000000^A50=02101^A128=STO^A129=G1^A544=1^A660=110^A453=3^A448=021^A447=C^A452=1^A448=B-0001554953^A447=D^A452=12^A448=021FCB3277^A447=D^A452=3^A581=1^A60=20240521-14:58:34.445^A11=101109^A40=2^A59=0^A54=1^A55=VN000000HPG4^A38=200^A44=25000^A10=061^A";
    String valueOf35="D";
    String valueOf49=null;
    String valueOf56=null;
    String getValueOf128="STO";



    @Test(priority = 1)
    public void checkTag_8() {
        //logMsg=;
        String tag_8 = "8=FIX.4.4";
        Assert.assertTrue(logMsg.contains(tag_8), "Tag 8 không tồn tại!");
    }
    @Test(priority = 2)
    public void checkTag_9() {
        String tag_9="^A9";
        Assert.assertTrue(logMsg.contains(tag_9), "Tag 9 không tồn tại!");
    }
    @Test(priority = 3)
    public void checkTag_35() {
        String tag_35="^A35="+ valueOf35;
        Assert.assertTrue(logMsg.contains(tag_35), "Tag 35 không tồn tại!");
    }
    @Test(priority = 4)
    public void checkTag_34() {
        String tag_34="^A34=";
        Assert.assertTrue(logMsg.contains(tag_34), "Tag 34 không tồn tại!");
    }
    @Test(priority = 5)
    public void checkTag_49() {
        String tag_49="^A49=";
        Assert.assertTrue(logMsg.contains(tag_49), "Tag 49 không tồn tại!");
    }
    @Test(priority = 6)
    public void checkTag_50() {
        String tag_50="^A50";
        Assert.assertTrue(logMsg.contains(tag_50), "Tag 50 không tồn tại!");
    }
    @Test(priority = 7)
    public void checkTag_52() {
        String tag_52="^A52=";
        Assert.assertTrue(logMsg.contains(tag_52), "Tag 52 không tồn tại!");
    }
    @Test(priority = 8)
    public void checkTag_56() {
        String tag_56="^A56=";
        Assert.assertTrue(logMsg.contains(tag_56), "Tag 56 không tồn tại!");

    }
    @Test(priority = 9)
    public void checkTag_128() {
        String tag_128="^A128=";
        Assert.assertTrue(logMsg.contains(tag_128), "Tag 128 không tồn tại!");
    }
    @Test(priority = 10)
    public void checkTag_129() {
        String tag_129="^A129=";
        Assert.assertTrue(logMsg.contains(tag_129), "Tag 129 không tồn tại!");
    }
    @Test(priority = 11)
    public void checkTag_145() {
        String tag_145="^A145=";
        Assert.assertTrue(logMsg.contains(tag_145), "Tag 145 không tồn tại!");
    }
    @Test(priority = 11)
    public void checkTag_1() {
        String tag_1="^A1=";
        Assert.assertTrue(logMsg.contains(tag_1), "Tag 1 không tồn tại!");
    }
    @Test(priority = 12)
    public void checkTag_11() {
        String tag_11="^A11";
        Assert.assertTrue(logMsg.contains(tag_11), "Tag 11 không tồn tại!");
    }
    @Test(priority = 13)
    public void checkTag_21() {
        String tag_21="^A21";
        Assert.assertTrue(logMsg.contains(tag_21), "Tag 21 không tồn tại!");
    }

    @Test(priority = 14)
    public void checkTag_38() {
        String tag_38="^A38=";
        Assert.assertTrue(logMsg.contains(tag_38), "Tag 38 không tồn tại!");
    }
    @Test(priority = 15)
    public void checkTag_40() {
        String tag_40="^A40";
        Assert.assertTrue(logMsg.contains(tag_40), "Tag 40 không tồn tại!");
    }
    @Test(priority = 16)
    public void checkTag_44() {
        String tag_44="^A44=";
        Assert.assertTrue(logMsg.contains(tag_44), "Tag 44 không tồn tại!");
    }
    @Test(priority = 17)
    public void checkTag_54() {
        String tag_54="^A54=";
        Assert.assertTrue(logMsg.contains(tag_54), "Tag 54 không tồn tại!");
    }

    @Test(priority = 18)
    public void checkTag_55() {
        String tag_55="^A55=";
        Assert.assertTrue(logMsg.contains(tag_55), "Tag 55 không tồn tại!");
    }
    @Test(priority = 19)
    public void checkTag_59() {
        String tag_59="^A59=";
        Assert.assertTrue(logMsg.contains(tag_59), "Tag 59 không tồn tại!");
    }
    @Test(priority = 20)
    public void checkTag_60() {
        String tag_60="^A60=";
        Assert.assertTrue(logMsg.contains(tag_60), "Tag 60 không tồn tại!");
    }
    @Test(priority = 21)
    public void checkTag_75() {
        String tag_75="^A75=";
        Assert.assertTrue(logMsg.contains(tag_75), "Tag 75 không tồn tại!");
    }
    @Test(priority = 22)
    public void checkTag_99() {
        String tag_99="^A99=";
        Assert.assertTrue(logMsg.contains(tag_99), "Tag 99 không tồn tại!");
    }
    @Test(priority = 23)
    public void checkTag_421() {
        String tag_421="^A421=";
        Assert.assertTrue(logMsg.contains(tag_421), "Tag 421 không tồn tại!");
    }
    @Test(priority = 24)
    public void checkTag_544() {
        String tag_544="^A544=";
        Assert.assertTrue(logMsg.contains(tag_544), "Tag 544 không tồn tại!");
    }
    @Test(priority = 25)
    public void checkTag_581() {
        String tag_581="^A581=";
        Assert.assertTrue(logMsg.contains(tag_581), "Tag 581 không tồn tại!");
    }

    @Test(priority = 26)
    public void checkTag_20000() {
        String tag_20000 = "^A20000=";
        Assert.assertTrue(logMsg.contains(tag_20000), "Tag 20000 không tồn tại!");
    }

    @Test(priority = 27)
    public void checkTag_20054() {
        String tag_20054 = "^A20054=";
        Assert.assertTrue(logMsg.contains(tag_20054), "Tag 20054 không tồn tại!");
    }

    @Test(priority = 28)
    public void checkTag_20064() {
        String tag_20064 = "^A220064=";
        Assert.assertTrue(logMsg.contains(tag_20064), "Tag 20064 không tồn tại!");
    }


//    @Test
//    public void checkTag_377() {
//        String tag_377="^A377=";
//        Assert.assertTrue(logMsg.contains(tag_377), "Tag 377 không tồn tại!");
//    }
    @Test(priority = 29)
    public void checkTag_10() {
        String tag_10="^A10=";
        Assert.assertTrue(logMsg.contains(tag_10), "Tag 10 không tồn tại!");
    }
}