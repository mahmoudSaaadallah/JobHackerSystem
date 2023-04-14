import java.util.Scanner;
public class EvenOddPositiveAndNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        
        int positive = 0;
        int negative = 0;
        int odd = 0;
        int even = 0;
        
        int [] arr = {a, b, c, d, e};
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > 0)
                positive++;
            if(arr[i] < 0)
                negative++;
            if(arr[i] % 2 == 0)
                even++;
            if(arr[i] % 2 != 0)
                odd++;
        }
        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");
    }   
}
