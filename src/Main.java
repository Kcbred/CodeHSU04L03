public class Main {

    /*
    Use methods . length
    . substring(start, finish)
    . indexOf(someString)
    . someString.equals(otherString)
    */
  public static void main(String[] args) {
        //System.out.println(VowelCount("This is a string."));
        //System.out.println("Correct output: 4");
        //System.out.println(VowelRemover("Remove all vowels"));
        //System.out.println("Correct output: Rmv ll vwls");
        System.out.println(ContainsSubstring("Sentence","Sentence"));
        System.out.println("Correct output: 5");
        System.out.println(ReverseString("ABCDEF"));
        System.out.println("Correct output: FEDCBA");
        System.out.println(PalindromeChecker("level"));
        System.out.println("Correct output: true");
    }

    /**
     * Count the vowels in the input string regardless of case
     * @param input String
     * @return vowel count int
     */
    /*public static int VowelCount(String input) {

        int length = input.length();
        String lowerCaseInput = input.toLowerCase();
        int count = 0;
        for (int i = 0; i < length; i++) {
            String letter = lowerCaseInput.substring(i, i + 1);
            if (letter.equals("a") || letter.equals("e") || letter.equals("u") || letter.equals("o") || letter.equals("i")) {
                count++;
            }
        }


        return count;
    }*/

    /**
     * Returns a string with all vowels removed regardless of case
     * @param input String
     * @return String with no vowels
     */
    /*public static String VowelRemover(String input){
        String newString = " ";
        String char1 = char1.replaceAll(regex; "[aeioudAEIOU]", replacement " ")char "a", replacement "");



        return "";
    }
*/
    /**
     * Determine if a substring target is contained in a given string
     * @param input - Given string
     * @param target - String being looked for
     * @return true if target found, false otherwise
     */
    public static boolean ContainsSubstring(String input, String target){
        if(input.contains(target)){
            return true;
        }else{
            return false;
        }



        //Solution1
        /*if(target.compareTo(input) == 33){
        return true;
    }else{
        return false;
        }*/




    }

    /**
     * Reverses a given string
     * @param input String
     * @return reversed input String
     */
    public static String ReverseString(String input){

    }

    /**
     * Determines if a given string is palindrome
     * @param input String
     * @return true if given string is a palindrome, false otherwise
     */
    public static boolean PalindromeChecker(String input){
        return input.equals(ReverseString(input));




        }

    }
}
