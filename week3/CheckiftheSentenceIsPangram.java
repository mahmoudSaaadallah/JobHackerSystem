import java.util.Scanner;

public class CheckiftheSentenceIsPangram {
    public static boolean checkIfPangram(String sentence) {
            boolean[] letters = new boolean[26];
            int numDistinctLetters = 0;
            for (char c : sentence.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    int index = c - 'a';
                    if (!letters[index]) {
                        letters[index] = true;
                        numDistinctLetters++;
                    }
                }
                if (numDistinctLetters == 26) {
                    return true;
                }
            }
            return false;
        }
    
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String sentence = scan.next();
            boolean isPangram = checkIfPangram(sentence);
            System.out.println(isPangram);
        }
    }
    
