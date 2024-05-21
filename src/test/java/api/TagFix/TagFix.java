package api.TagFix;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TagFix {

    String logMsg;
    String valueOf35="D";
    String valueOf49=null;
    String valueOf56=null;
    String getValueOf128="STO";

    public TagFix(String logMsg) {
        this.logMsg = logMsg;
    }


    public void checkTag_8() {
        //logMsg=;
        String tag_8 ="8=FIX.4.4";
        Assert.assertTrue(logMsg.contains(tag_8), "Tag 8 không tồn tại!");
    }

    public void checkTag_9() {
        String tag_9="^A9=83";
        Assert.assertTrue(logMsg.contains(tag_9), "Tag 9 không tồn tại!");
    }

    public void checkTag_35(String valueOf35 ) {
        String tag_35="^A35="+ valueOf35;
        Assert.assertTrue(logMsg.contains(tag_35), "Tag 35 không tồn tại!");
    }

    public void checkTag_34() {
        String tag_34="^A34=";
        Assert.assertTrue(logMsg.contains(tag_34), "Tag 34 không tồn tại!");
    }

    public void checkTag_49() {
        String tag_49="^A49=";
        Assert.assertTrue(logMsg.contains(tag_49), "Tag 49 không tồn tại!");
    }

    public void checkTag_50() {
        String tag_50="^A50";
        Assert.assertTrue(logMsg.contains(tag_50), "Tag 50 không tồn tại!");
    }

    public void checkTag_52() {
        String tag_52="^A52=";
        Assert.assertTrue(logMsg.contains(tag_52), "Tag 52 không tồn tại!");
    }

    public void checkTag_56() {
        String tag_56="^A56=";
        Assert.assertTrue(logMsg.contains(tag_56), "Tag 56 không tồn tại!");
    }

    public void checkTag_1() {
        String tag_1="^A1=";
        Assert.assertTrue(logMsg.contains(tag_1), "Tag 1 không tồn tại!");
    }

    public void checkTag_6() {
        String tag_6="^A6";
        Assert.assertTrue(logMsg.contains(tag_6), "Tag 6 không tồn tại!");
    }

    public void checkTag_11() {
        String tag_11="^A11";
        Assert.assertTrue(logMsg.contains(tag_11), "Tag 11 không tồn tại!");
    }

    public void checkTag_14() {
        String tag_14="^A14";
        Assert.assertTrue(logMsg.contains(tag_14), "Tag 14 không tồn tại!");
    }

    public void checkTag_17() {
        String tag_17="^A17";
        Assert.assertTrue(logMsg.contains(tag_17), "Tag 17 không tồn tại!");
    }

    public void checkTag_19() {
        String tag_19="^A19";
        Assert.assertTrue(logMsg.contains(tag_19), "Tag 19 không tồn tại!");
    }

    public void checkTag_31() {
        String tag_31="^A31";
        Assert.assertTrue(logMsg.contains(tag_31), "Tag 31 không tồn tại!");
    }

    public void checkTag_32() {
        String tag_32="^A32";
        Assert.assertTrue(logMsg.contains(tag_32), "Tag 32 không tồn tại!");
    }

    public void checkTag_37() {
        String tag_37="^A37";
        Assert.assertTrue(logMsg.contains(tag_37), "Tag 37 không tồn tại!");
    }

    public void checkTag_38() {
        String tag_38="^A38=";
        Assert.assertTrue(logMsg.contains(tag_38), "Tag 38 không tồn tại!");
    }

    public void checkTag_39() {
        String tag_38="^A38=";
        Assert.assertTrue(logMsg.contains(tag_38), "Tag 38 không tồn tại!");
    }


    public void checkTag_40() {
        String tag_40="^A40";
        Assert.assertTrue(logMsg.contains(tag_40), "Tag 40 không tồn tại!");
    }

    public void checkTag_44() {
        String tag_44="^A44=";
        Assert.assertTrue(logMsg.contains(tag_44), "Tag 44 không tồn tại!");
    }

    public void checkTag_54() {
        String tag_54="^A54=";
        Assert.assertTrue(logMsg.contains(tag_54), "Tag 54 không tồn tại!");
    }


    public void checkTag_55() {
        String tag_55="^A55=";
        Assert.assertTrue(logMsg.contains(tag_55), "Tag 55 không tồn tại!");
    }

    public void checkTag_59() {
        String tag_59="^A59=";
        Assert.assertTrue(logMsg.contains(tag_59), "Tag 59 không tồn tại!");
    }

    public void checkTag_60() {
        String tag_60="^A60=";
        Assert.assertTrue(logMsg.contains(tag_60), "Tag 60 không tồn tại!");
    }

    public void checkTag_75() {
        String tag_75="^A75=";
        Assert.assertTrue(logMsg.contains(tag_75), "Tag 75 không tồn tại!");
    }

    public void checkTag_99() {
        String tag_99="^A99=";
        Assert.assertTrue(logMsg.contains(tag_99), "Tag 99 không tồn tại!");
    }

    public void checkTag_421() {
        String tag_421="^A421=";
        Assert.assertTrue(logMsg.contains(tag_421), "Tag 421 không tồn tại!");
    }

    public void checkTag_544() {
        String tag_544="^A544=";
        Assert.assertTrue(logMsg.contains(tag_544), "Tag 544 không tồn tại!");
    }

    public void checkTag_581() {
        String tag_581="^A581=";
        Assert.assertTrue(logMsg.contains(tag_581), "Tag 581 không tồn tại!");
    }

    public void checkTag_20000() {
        String tag_20000="^A20000=";
        Assert.assertTrue(logMsg.contains(tag_20000), "Tag 20000 không tồn tại!");
    }

    public void checkTag_20054() {
        String tag_20054="^A20054=";
        Assert.assertTrue(logMsg.contains(tag_20054), "Tag 20054 không tồn tại!");
    }


    public void checkTag_20064() {
        String tag_20064="^A220064=";
        Assert.assertTrue(logMsg.contains(tag_20064), "Tag 20064 không tồn tại!");
    }


    public void checkTag_377() {
        String tag_377="^A377=";
        Assert.assertTrue(logMsg.contains(tag_377), "Tag 377 không tồn tại!");
    }

    public void checkTag_378() {
        String tag_378="^378=";
        Assert.assertTrue(logMsg.contains(tag_378), "Tag 378 không tồn tại!");
    }
    public void checkTag_10() {
        String tag_10="^A10=";
        Assert.assertTrue(logMsg.contains(tag_10), "Tag 10 không tồn tại!");
    }
    public void checkTag_111() {
        String tag_111="^A111=";
        Assert.assertTrue(logMsg.contains(tag_111), "Tag 111 không tồn tại!");
    }
    public void checkTag_80() {
        String tag_80="^A80=";
        Assert.assertTrue(logMsg.contains(tag_80), "Tag 80 không tồn tại!");
    }
    public void checkTag_467() {
        String tag_467="^A467=";
        Assert.assertTrue(logMsg.contains(tag_467), "Tag 467 không tồn tại!");
    }
    public void checkTag_79() {
        String tag_79="^A79=";
        Assert.assertTrue(logMsg.contains(tag_79), "Tag 79 không tồn tại!");
    }
    public void checkTag_78() {
        String tag_79=null;
        Assert.assertTrue(logMsg.contains("^A78="), "Tag 78 không tồn tại!");
    }
    public void checkTag_136() {
        String tag_79=null;
        Assert.assertTrue(logMsg.contains("^A136="), "Tag 136 không tồn tại!");
    }
    public void checkTag_137() {
        String tag_79=null;
        Assert.assertTrue(logMsg.contains("^A137="), "Tag 137 không tồn tại!");
    }
    public void checkTag_434() {
        String tag_79=null;
        Assert.assertTrue(logMsg.contains("^A434="), "Tag 434 không tồn tại!");
    }
    public void checkTag_102() {
        String tag_79=null;
        Assert.assertTrue(logMsg.contains("^A102="), "Tag 434 không tồn tại!");
    }
    public void checkTag_103() {
        String tag_79=null;
        Assert.assertTrue(logMsg.contains("^A103="), "Tag 103 không tồn tại!");
    }
    public void checkTag_58() {
        String tag_79=null;
        Assert.assertTrue(logMsg.contains("^A58="), "Tag 58 không tồn tại!");
    }

    public void checkTag_652() {
        String tag_79=null;
        Assert.assertTrue(logMsg.contains("^A652="), "Tag 652 không tồn tại!");
    }
    public void checkTag_41() {
        String tag_79=null;
        Assert.assertTrue(logMsg.contains("^A41="), "Tag 41 không tồn tại!");
    }
    public void checkTag_48() {
        String tag_79=null;
        Assert.assertTrue(logMsg.contains("^A48="), "Tag 48 không tồn tại!");
    }
    public void checkTag_22() {
        String tag_79=null;
        Assert.assertTrue(logMsg.contains("^A22="), "Tag 22 không tồn tại!");
    }
    public void checkTag_21() {
        String tag_79=null;
        Assert.assertTrue(logMsg.contains("^A21="), "Tag 21 không tồn tại!");
    }
    public void checkTag_15() {
        String tag_79=null;
        Assert.assertTrue(logMsg.contains("^A15="), "Tag 15 không tồn tại!");
    }
    public void checkTag_788() {
        String tag_79=null;
        Assert.assertTrue(logMsg.contains("^A788="), "Tag 788 không tồn tại!");
    }
    public void checkTag_367() {
        String tag_79=null;
        Assert.assertTrue(logMsg.contains("^A367="), "Tag 367 không tồn tại!");
    }
    public void checkTag_151() {
        String tag_79=null;
        Assert.assertTrue(logMsg.contains("^A151="), "Tag 151 không tồn tại!");
    }
    public void checkTag_150() {
        String tag_79=null;
        Assert.assertTrue(logMsg.contains("^A150="), "Tag 150 không tồn tại!");
    }







}
