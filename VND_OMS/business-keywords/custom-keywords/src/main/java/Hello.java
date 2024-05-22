
public class Hello {
    public String test() {
        return "Hello World!!";
    }

    public boolean verifyContainText(String text, String searchString ){
        if (text == null || searchString == null) {
            return false;
        }
        return text.contains(searchString);
    }
}