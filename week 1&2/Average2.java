import java.util.Scanner;
public class Average2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble() * .2;
        double b = scan.nextDouble() * .3;
        double c = scan.nextDouble() * .5;

        double media = (a + b + c);
        System.out.printf("MEDIA = %.1f", media);
        System.out.println();
    }
}
