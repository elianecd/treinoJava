import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y, z, med;

        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        med = (x * 2 + y * 3 + z * 5) / 10;

        System.out.printf("MEDIA = %.1f", med);

        sc.close();
    }
}
