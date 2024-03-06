import java.util.Locale;
import java.util.Scanner;

public class Uri1041 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;

        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.printf("Q1");
        } else if (x < 0 && y > 0) {
            System.out.printf("Q2");
        } else if (x < 0 && y < 0) {
            System.out.printf("Q3");
        } else if (x > 0 && y < 0) {
            System.out.printf("Q4");
        } else {
            System.out.printf("Origem");
        }

        sc.close();
    }
}
