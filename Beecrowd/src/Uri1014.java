import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distancia;
        double combustivel, total;

        distancia = sc.nextInt();
        combustivel = sc.nextDouble();

        total = distancia / combustivel;

        System.out.printf("%.3f km/l", total);

        sc.close();
    }
}
