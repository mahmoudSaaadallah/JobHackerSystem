import java.util.Scanner;

public class BelowTheMainDiagonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        double[][] arr = new double[12][12];
        for (int i = 0; i < 12; i++){
         for(int j = 0; j < 12; j++){
             arr[i][j] = scan.nextDouble();
         }
 
        }
        double s = 0;
        if (ch == 'S'){
            for(int i = 0; i < 12; i++)
         for(int j = 0; j < 12; j++){
            if(j > i)
             s += arr[j][i];
         }
             System.out.printf("%.1f",s);
             System.out.println();
        }
        double a = 0;
        if (ch == 'M'){
        for(int i = 0; i < 12; i++)
         for(int j = 0; j < 12; j++){
            if(j > i)
             a += arr[j][i];
         }
         System.out.printf("%.1f",a/66);
         System.out.println();
    }
     }
    }

