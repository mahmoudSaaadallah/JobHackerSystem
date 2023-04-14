import java.util.Scanner;
public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double c = scan.nextDouble();
        double b = scan.nextDouble();
        double e = scan.nextDouble();

        double d = Math.sqrt(Math.pow((b - a), 2) + Math.pow((e - c), 2));
        System.out.printf("%.4f", d);
        System.out.println();
    }
}
