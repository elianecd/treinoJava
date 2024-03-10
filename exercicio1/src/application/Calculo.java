package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Calculo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle x;
        x = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        x.width = sc.nextDouble(); //largura
        x.height = sc.nextDouble(); //altura

        System.out.printf("AREA = %.2f", x.area());
        System.out.printf("%nPERIMETER = %.2f", x.perimeter());
        System.out.printf("%nDIAGONAL = %.2f", x.diagonal());

        sc.close();
    }
}
