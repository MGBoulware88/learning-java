import java.util.ArrayList;

public class TestJava {
    public static void main(String[] args) {
        /* ============ Instantiate a PuzzleJava ============= */
        PuzzleJava generator = new PuzzleJava();
        //create the charArr for test cases
        char[] alphaChars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
            't', 'u', 'v', 'w', 'x', 'y', 'z' };
        /* ============ Ten Rolls Test Cases ============= */
        int[] randomRolls = generator.getTenRolls();
        String stringRandRolls = "";
        for (int i = 0; i < randomRolls.length; i++) {
            stringRandRolls += randomRolls[i];
            stringRandRolls += ", ";
        }
        System.out.println("Ten rolls coming up! " + stringRandRolls);
        /* ============ Random Letter Test Cases ============= */
        char randomLetters = generator.getRandomLetter(alphaChars);
        System.out.println("Here is a random char: " + randomLetters);
        /* ============ Password Gen Test Cases ============= */
        String randomPassword = generator.generatePassword(alphaChars);
        System.out.println("Don't show anyone! " + randomPassword);
        /* ============ Password Gen Test Cases ============= */
        ArrayList<String> randomPasswordsArray = generator.getNewPasswordSet(alphaChars, 37);
        System.out.println("Definitely don't share these!!! " + randomPasswordsArray);
    }
}
