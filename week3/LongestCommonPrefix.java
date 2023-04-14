    import java.util.ArrayList;
import java.util.Scanner;
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int prefixLen = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            prefixLen = Math.min(prefixLen, strs[i].length());
            for (int j = 0; j < prefixLen; j++) {
                if (strs[i].charAt(j) != strs[0].charAt(j)) {
                    prefixLen = j;
                    break;
                }
            }
        }
        return strs[0].substring(0, prefixLen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        String input;
       
        do {
            input = sc.nextLine();
            inputs.add(input);
        } while (!input.isEmpty());
        String[] strs = inputs.toArray(new String[0]);
        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);
    }
}
