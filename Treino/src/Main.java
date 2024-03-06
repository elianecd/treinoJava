import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //botando isso aqui faz com q o double possa ser aceita com ponto
        Scanner sc = new Scanner(System.in);

        //Para ler uma palavra para dentro de uma variavel
        /* String x;
        x = sc.next(); */

        //Para ler um int para dentro de uma variavel
        /* int x;
        x = sc.nextInt(); */

        /* double x;
        x = sc.nextDouble(); // tem q digitar o numero com virgula e nao com ponto, se nao da erro
        System.out.printf("Você digitou: %.2f%n", x); //vai printar com a virgula */

        char x;
        x = sc.next().charAt(0); //pega somente a primeira letra q eu digitei

        System.out.println("Você digitou: " + x); //Para verificar se armazenou mesmo na variavel
        sc.close();
    }
}