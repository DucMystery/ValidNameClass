import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

    private  static String NAME_CLASS="^[CAP]{1}[0-9]{4}[GHIKLM]{1}";
    public RegexPractice(){}

    public boolean valid(String regex){
        Pattern pattern = Pattern.compile(NAME_CLASS);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
