import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num_func, horas_trab;
        double sal_por_hora, sal_final;

        num_func = sc.nextInt();
        horas_trab = sc.nextInt();
        sal_por_hora = sc.nextDouble();
        sal_final = horas_trab * sal_por_hora;

        System.out.println("NUMBER = " + num_func);
        System.out.printf("SALARY = U$ %.2f", sal_final);

        sc.close();
    }
}
