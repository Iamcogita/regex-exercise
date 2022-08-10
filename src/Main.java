public class Main {

    //1 - Write a function that matches a string that has a p followed by zero or more q's
    //2 - Write a function to find sequences of lowercase letters joined with an underscore
    //3 - Write a function to find the sequences of one upper case letter followed by lower case letters
    //4 - Write a function that matches a string that has a 'p' followed by anything, ending in 'q'
    //5 - Write a function to match a string that contains only upper and lowercase letters, numbers, and underscores
    //6 - Write a function to remove all the vowels of a given string. Return the new string
    //7 - Write a function to validate a given portuguese mobile phone number
    //8 - Write a function to remove all non-alphanumeric characters from a given string

    public static void main(String[] args) {

        String toAnalyze = "BLA_Bla p0q p pqQq tp bla_bla, ho_ho PQqu P***q"; // Global String to analyze
        Functions function = new Functions();

        function.matchPWithQs(toAnalyze); // 1
        function.findLowerCaseWithUnderScore(toAnalyze); // 2
        function.findUpperToLower(toAnalyze); // 3
        function.matchPStuffQs(toAnalyze); // 4 - wip

    }

}
