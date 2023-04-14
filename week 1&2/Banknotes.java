import java.util.Scanner;


public class Banknotes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int temp = number;
        int a, b, c, d, e, f, g;
        a=b=c=d=e=f=g=0;
        if(temp >= 100 ){
        a = temp / 100;
        temp = temp % 100;
        }
        if (temp>= 50){
            b = temp / 50;
            temp = temp % 50;
        }
        if (temp>= 20){
            c = temp / 20;
            temp = temp % 20;
        }
        if (temp>= 10){
            d = temp / 10;
            temp = temp % 10;
        }
        if (temp>= 5){
            e = temp / 5;
            temp = temp % 5;
        }
        if (temp>= 2){
            f = temp / 2;
            temp = temp % 2;
        }
        if (temp>= 1){
            g = temp / 1;
            temp = temp % 1;
        }

        System.out.println(number);
        System.out.println(a +" nota(s) de R$ 100,00");
        System.out.println(b +" nota(s) de R$ 50,00");
        System.out.println(c +" nota(s) de R$ 20,00");
        System.out.println(d +" nota(s) de R$ 10,00");
        System.out.println(e +" nota(s) de R$ 5,00");
        System.out.println(f +" nota(s) de R$ 2,00");
        System.out.println(g +" nota(s) de R$ 1,00");
        
    }
}
