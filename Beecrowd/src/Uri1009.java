import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double salario, total_vendas, res;

        nome = sc.nextLine();
        salario = sc.nextDouble();
        total_vendas = sc.nextDouble();

        res = salario + total_vendas * 0.15;

        System.out.printf("TOTAL = R$ %.2f", res);

        sc.close();
    }
}
