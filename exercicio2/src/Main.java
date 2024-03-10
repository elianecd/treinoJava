import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double nota1, nota2, nota3, grade;

        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();

        grade = nota1 + nota2 + nota3;

        if (grade >= 60.0)
        {
            System.out.printf("FINAL GRADE = %.2f %n", grade);
            System.out.println("PASS");
        }
        else
        {
            System.out.printf("FINAL GRADE = %.2f %n", grade);
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60 - grade);
        }
    }
}