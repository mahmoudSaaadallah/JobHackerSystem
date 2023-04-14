import java.util.Scanner;
public class ArrayChangeI {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] arr = new int [20];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        int[] arr2 = new int [20];
        int j = arr.length - 1;
        for(int i = 0; i < arr.length; i++){
            
                arr2[j] = arr[i];
                j--;
            }
            for(int i = 0; i < arr.length; i++){
                System.out.println("N["+i+"] = "+arr2[i]);
            }
        }
    }

