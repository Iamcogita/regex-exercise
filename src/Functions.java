import java.util.ArrayList;
import java.util.Arrays;
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

    }    public void findUpperToLower(String str){
        final Pattern pattern = Pattern.compile("[A-Z][a-z]+", Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(str);
        System.out.print("Matched: ");
        while (matcher.find()) {
            System.out.printf("\"" + matcher.group() + "\"".concat(" | " ) );
        }
        System.out.println("");
    }

    public void matchPStuffQs(String str){ // have to split to String[]
        final Pattern pattern = Pattern.compile( "p.+q$",Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(str);

        System.out.print("Matched: ");
        while (matcher.find()) {
            System.out.printf("\"" + matcher.group() + "\"".concat(" | " ) );
        }
        System.out.println("");
    }







}
