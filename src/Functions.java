import java.lang.reflect.Array;
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

        final Pattern pattern = Pattern.compile( "p.+?q",Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(str);

        System.out.print("Matched: ");
        while (matcher.find()) {
            System.out.printf("\"" + matcher.group() + "\"".concat(" | " ) );
        }
        System.out.println("");
    }

    public void dontLikeSpacesOrSpecials(String str){

        final Pattern pattern = Pattern.compile( "[\\w]*[^\\W ]+", Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(str);

        System.out.print("Matched: ");
        while (matcher.find()) {
            System.out.printf("\"" + matcher.group() + "\"".concat(" | " ) );
        }
        System.out.println("");
    }

    public void replaceVowels(String str){
        System.out.print("Changed to: ");
        System.out.println("\"" + str.replaceAll("[aeiou|AEIOU]", "") + "\"" );
    }

    public boolean findPhoneNumber(String str){
        System.out.printf("%s is : " , str);
        if(str.matches("(\\+?351)?[ ]*?9\\d\\d{7}")){
            System.out.println("Validated");
            return true;}
        System.out.println("Error");
        return false;
    }

    public void removeAlphaNum(String str){
        System.out.print("Changed to: ");
        System.out.println("\"" + str.replaceAll("[^a-z^A-Z^0-9]", "") + "\"" );
    }

}
