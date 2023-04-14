import java.util.Scanner;

public class HighestAndPosition {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max, postion;
        max = 0;
        postion = 0;
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                postion = i + 1;
            }

        }
        System.out.println(max + "\n" + postion);
    }
}
