import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo, velocidade, distancia;
        double litros;

        tempo = sc.nextInt();
        velocidade = sc.nextInt();

        distancia = tempo * velocidade;
        litros = (double)distancia / 12;

        System.out.printf("%.3f", litros);

        sc.close();
    }
}
