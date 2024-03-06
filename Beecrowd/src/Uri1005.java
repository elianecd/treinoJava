import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y, med;

        x = sc.nextDouble();
        y = sc.nextDouble();
        med = (x * 3.5 + y * 7.5) / 11;

        System.out.printf("MEDIA = %.5f", med);

        sc.close();
    }
}
