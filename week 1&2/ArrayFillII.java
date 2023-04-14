import java.util.Scanner;

public class ArrayFillII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[1000];
        int input = scan.nextInt();
        int i = 0;
        for (int j = 0; j < input; j++) {
            arr[i] = j;
            if (j == input-1) {
                j = -1;
            }
            if (i == 999)
                break;
            i++;
            

        }
        for(int h = 0; h < arr.length; h++){
            System.out.println("N["+h+"] = "+arr[h]);
        }
    }
}
