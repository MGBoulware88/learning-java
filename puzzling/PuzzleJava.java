import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    Random randomNumGenerator = new Random();
    char[] alphaChars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
            't', 'u', 'v', 'w', 'x', 'y', 'z' };
    // method to generator 10 random nums and return them as an int arr
    public int[] getTenRolls() {
        int[] randomNumArray = new int[10];
        int count = 0;

        while (count < 10) {
            // generate a rand num and then put it in the arr
            // generate a num between 1-20, inclusive | 0-19 + 1 meets this condition
            int randomNumber = randomNumGenerator.nextInt(20) + 1;
            randomNumArray[count] = randomNumber;
            count++;
        }
        return randomNumArray;
    }
    // method to pick a random letter from alphaChars
    public char getRandomLetter(char[] charArr) {
        // input the length of charArr so this works for other use cases
        int randomIdx = randomNumGenerator.nextInt(charArr.length);
        char randomChar = charArr[randomIdx];
        return randomChar;
    }
    // method to generate an 8 char password from a charArr input
    public String generatePassword(char[] charArr) {
        String newPassword = "";
        int lengthOfPassword = 8; // could easily make this a param for more flexibility, but that wasn't the
                                  // requirement =\
        // same as before, gen random char by getting random idx from the arr
        // but using a for loop to do it n times
        for (int i = lengthOfPassword; i > 0; i--) {
            int randomIdx = randomNumGenerator.nextInt(charArr.length);
            char randomChar = charArr[randomIdx];
            newPassword += randomChar;
        }
        return newPassword;
    }
    // method to gen an array of passwords from charArr & int inputs
    public ArrayList<String> getNewPasswordSet(char[] charArr, int numberOfPasswords) {
        // numberOfPasswords is the length we need to make
        ArrayList<String> newPasswordSet = new ArrayList<String>();
        /*
         * call generatePassword() to get a new password
         * replace the current idx with the new password
         * do this numberOfPasswords times
         */
        for (int i = 0; i < numberOfPasswords; i++) {
            String thisPassword = generatePassword(charArr);
            newPasswordSet.add(thisPassword);
        }
        return newPasswordSet;
    }
}