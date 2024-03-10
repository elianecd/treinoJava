package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Grade;

public class Notas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Grade grade = new Grade();

        grade.nome = sc.nextLine();
        grade.nota1 = sc.nextDouble();
        grade.nota2 = sc.nextDouble();
        grade.nota3 = sc.nextDouble();

        if (grade.finalGrade() >= 60.0)
        {
            System.out.printf("FINAL GRADE = %.2f %n", grade.finalGrade());
            System.out.println("PASS");
        }
        else
        {
            System.out.printf("FINAL GRADE = %.2f %n", grade.finalGrade());
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60 - grade.finalGrade());
        }

        sc.close();
    }
}
