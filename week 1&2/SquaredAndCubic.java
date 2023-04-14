import java.util.Scanner;
public class SquaredAndCubic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[][] arr = new int[number][3];
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= 3; j++){
                arr[i-1][j-1] = (int) Math.pow(i, j) ;
            }
        }
        for(int i = 0; i < number; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr[i][j] );
                if(j < 2){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
