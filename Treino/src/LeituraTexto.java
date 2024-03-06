import java.util.Scanner;

public class LeituraTexto { // PARA LER UM TEXTO ATÉ A QUEBRA DE LINHA, OU SEJA, ATÉ O ENTER

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine(); // Para consumir a quebra de linha que ficou pendente
        s1 = sc.nextLine(); // O nextline serve para ler a linha inteira
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
