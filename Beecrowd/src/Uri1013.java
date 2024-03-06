import java.util.Locale;
import java.util.Scanner;

public class Uri1013 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, c, res, maior;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        maior = (a+b+Math.abs(a-b)) / 2;
        res = (maior+c+Math.abs(maior-c)) / 2;

        System.out.printf("%d eh o maior", res);

        sc.close();
    }
}
