import java.util.Scanner;

public class Uri1049 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        if (s1.equals("vertebrado"))
        {
            if (s2.equals("ave"))
            {
                if (s3.equals("carnivoro"))
                    System.out.println("aguia");
                else if(s3.equals("onivoro"))
                    System.out.println("pomba");
            }
            else if(s2.equals("mamifero"))
            {
                if (s3.equals("herbivoro"))
                    System.out.println("vaca");
                else if(s3.equals("onivoro"))
                    System.out.println("homem");
            }
        }
        else if(s1.equals("invertebrado"))
        {
            if (s2.equals("inseto"))
            {
                if (s3.equals("hematofago"))
                    System.out.println("pulga");
                else if(s3.equals("herbivoro"))
                    System.out.println("lagarta");
            }
            else if(s2.equals("anelideo"))
            {
                if (s3.equals("hematofago"))
                    System.out.println("sanguessuga");
                else if(s3.equals("onivoro"))
                    System.out.println("minhoca");
            }
        }
        sc.close();
    }
}
