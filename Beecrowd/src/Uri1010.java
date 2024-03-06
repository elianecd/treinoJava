import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1, qtd1, codigo2, qtd2;
        double valor_unit1, valor_unit2, total;

        codigo1 = sc.nextInt();
        qtd1 = sc.nextInt();
        valor_unit1 = sc.nextDouble();

        codigo2 = sc.nextInt();
        qtd2 = sc.nextInt();
        valor_unit2 = sc.nextDouble();

        total = qtd1 * valor_unit1 + qtd2 * valor_unit2;

        System.out.printf("VALOR A PAGAR: R$ %.2f ", total);

        sc.close();
    }
}
