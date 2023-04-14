import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        char ch = scan.next().charAt(0);
        double[][] arr = new double[12][12];
        for (int i = 0; i < 12; i++){
         for(int j = 0; j < 12; j++){
             arr[i][j] = scan.nextDouble();
         }
 
        }
        double s = 0;
        if (ch == 'S'){
             for(int j = 0; j < 12; j++){
                 s += arr[j][input];
             }
             System.out.printf("%.1f",s);
             System.out.println();
        }
        double a = 0;
        if (ch == 'M'){
         for(int j = 0; j < 12; j++){
             a += arr[j][input];
         }
         System.out.printf("%.1f",a/12);
         System.out.println();
    }
     }
}
