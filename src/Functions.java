import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Functions {

    public void matchPWithQs(String str){
        final Pattern pattern = Pattern.compile("pq*", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(str);
        System.out.print("Matched: ");
        while (matcher.find()) {
            System.out.printf("\"" + matcher.group() + "\"".concat(" | " ) );
        }
        System.out.println("");
    }

    public void findLowerCaseWithUnderScore(String str){
        final Pattern pattern = Pattern.compile("[a-z]+_[a-z]+", Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(str);
        System.out.print("Matched: ");
        while (matcher.find()) {
            System.out.printf("\"" + matcher.group() + "\"".concat(" | " ) );
        }
        System.out.println("");
    }








}
