import java.util.Locale;
import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double input = sc.nextDouble();
        double epsilon = 0.0001; // define a small epsilon value

        if (input >= 0.0 && input <= 25.00 + epsilon) {
            System.out.printf("Intervalo [0,25]");
        } else if (input > 25.00 + epsilon && input <= 50.00) {
            System.out.printf("Intervalo (25,50]");
        } else if (input > 50.00 && input <= 75.00) {
            System.out.printf("Intervalo (50,75]");
        } else if (input > 75.00 && input <= 100.00) {
            System.out.printf("Intervalo (75,100]");
        } else {
            System.out.printf("Fora de intervalo");
        }

        sc.close();
    }
}
