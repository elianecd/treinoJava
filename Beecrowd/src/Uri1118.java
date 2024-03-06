import java.util.Locale;
import java.util.Scanner;

public class Uri1118 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double media, nota1, nota2;
        int opc = 1;

        do
        {
            nota1 = sc.nextDouble();
            nota2 = sc.nextDouble();

            if (nota1 >= 0.00 && nota1 <= 10.0 && nota2 >= 0.00 && nota2 <= 10.0)
            {
                media = (nota1 + nota2) / 2;
                System.out.printf("media = %.2f%n", media);
                System.out.println("novo calculo (1-sim 2-nao)");
                opc = sc.nextInt();
            }
            else
                System.out.println("nota invalida");

        } while (opc == 1);

        if (opc == 2)
            sc.close();
    }
}
