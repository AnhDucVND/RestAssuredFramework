import net.bytebuddy.asm.Advice.Return;

public class Utilities {
    public Boolean verifyTaginMsg(String msgFix, String tag ){
        if (tag == null || msgFix == null) {
            return false;
        }
        return msgFix.contains(tag);
    }

    public Boolean verifyTagsinMsgFix(String msgFix, String tag, String valueOfTag ){
        String tagAndValue=null;
        
        if (tag == null || msgFix == null) {
            return false;
        } else if(tag.equals("8")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("9")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("35")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("34")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("49")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("50")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("52")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("56")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("1")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("11")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("38")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("40")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("44")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("54")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("8")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("55")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("59")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("60")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("377")){
            tagAndValue=tag+"="+valueOfTag;
        } else if(tag.equals("10")){
            tagAndValue=tag+"="+valueOfTag;  
        }
        else if(tag.equals("128")){
            tagAndValue=tag+"="+valueOfTag;  
        }
        else if(tag.equals("129")){
            tagAndValue=tag+"="+valueOfTag;  
        }
            return  msgFix.contains(tagAndValue);
             
    } 

}