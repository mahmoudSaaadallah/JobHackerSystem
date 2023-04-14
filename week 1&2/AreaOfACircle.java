import java.util.Scanner;
public class AreaOfACircle {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double a = 3.14159 * r * r;
        System.out.printf("A=%.4f", a);
        System.out.println();
    }
}
