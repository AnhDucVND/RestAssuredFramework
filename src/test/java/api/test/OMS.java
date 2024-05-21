package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OMS {
    String logMsg="8=FIX.4.4^A9=140^A35=D^A50=B-0001554953^A1=0001215301^A11=TRADEAPI_KRX240517171250000000066^A38=200^A40=2^A44=31200^A54=1^A55=HPG^A59=0^A60=20240521-04:32:10.345^A377=N^A10=190^A";
    String valueOf35="D";
    String valueOf49=null;
    String valueOf56=null;
    String getValueOf128="STO";



    @Test
    public void checkTag_8() {
        //logMsg=;
        String tag_8 = "8=FIX.4.4";
        Assert.assertTrue(logMsg.contains(tag_8), "Tag 8 không tồn tại!");
    }
    @Test
    public void checkTag_9() {
        String tag_9="^A9";
        Assert.assertTrue(logMsg.contains(tag_9), "Tag 9 không tồn tại!");
    }
    @Test
    public void checkTag_35() {
        String tag_35="^A35="+ valueOf35;
        Assert.assertTrue(logMsg.contains(tag_35), "Tag 35 không tồn tại!");
    }
    @Test
    public void checkTag_34() {
        String tag_34="^A34=";
        Assert.assertTrue(logMsg.contains(tag_34), "Tag 34 không tồn tại!");
    }
    @Test
    public void checkTag_49() {
        String tag_49="^A49=";
        Assert.assertTrue(logMsg.contains(tag_49), "Tag 49 không tồn tại!");
    }
    @Test
    public void checkTag_50() {
        String tag_50="^A50";
        Assert.assertTrue(logMsg.contains(tag_50), "Tag 50 không tồn tại!");
    }
    @Test
    public void checkTag_52() {
        String tag_52="^A52=";
        Assert.assertTrue(logMsg.contains(tag_52), "Tag 52 không tồn tại!");
    }
    @Test
    public void checkTag_56() {
        String tag_56="^A56=";
        Assert.assertTrue(logMsg.contains(tag_56), "Tag 56 không tồn tại!");
    }
    @Test
    public void checkTag_1() {
        String tag_1="^A1=";
        Assert.assertTrue(logMsg.contains(tag_1), "Tag 1 không tồn tại!");
    }
    @Test
    public void checkTag_11() {
        String tag_11="^A11";
        Assert.assertTrue(logMsg.contains(tag_11), "Tag 11 không tồn tại!");
    }
    @Test
    public void checkTag_38() {
        String tag_38="^A38=";
        Assert.assertTrue(logMsg.contains(tag_38), "Tag 38 không tồn tại!");
    }
    @Test
    public void checkTag_40() {
        String tag_40="^A40";
        Assert.assertTrue(logMsg.contains(tag_40), "Tag 40 không tồn tại!");
    }
    @Test
    public void checkTag_54() {
        String tag_54="^A54=";
        Assert.assertTrue(logMsg.contains(tag_54), "Tag 54 không tồn tại!");
    }
    @Test
    public void checkTag_44() {
        String tag_44="^A44=";
        Assert.assertTrue(logMsg.contains(tag_44), "Tag 44 không tồn tại!");
    }
    @Test
    public void checkTag_55() {
        String tag_55="^A55=";
        Assert.assertTrue(logMsg.contains(tag_55), "Tag 55 không tồn tại!");
    }
    @Test
    public void checkTag_59() {
        String tag_59="^A59=";
        Assert.assertTrue(logMsg.contains(tag_59), "Tag 59 không tồn tại!");
    }
    @Test
    public void checkTag_60() {
        String tag_60="^A60=";
        Assert.assertTrue(logMsg.contains(tag_60), "Tag 60 không tồn tại!");
    }
    @Test
    public void checkTag_377() {
        String tag_377="^A377=";
        Assert.assertTrue(logMsg.contains(tag_377), "Tag 377 không tồn tại!");
    }
    @Test
    public void checkTag_10() {
        String tag_10="^A10=";
        Assert.assertTrue(logMsg.contains(tag_10), "Tag 10 không tồn tại!");
    }
}