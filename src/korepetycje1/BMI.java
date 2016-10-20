package korepetycje1;
import java.util.Scanner;


public class BMI {
    public static void main(String[] args) {
        System.out.println("Witaj! Dzięki temu programowi dowiesz się, czy Twoja waga jest prawidłowa");

        double wzrost =0 ;
        double waga =0 ;
        String imię;
        double bmi1 = 0;

        Scanner BMI = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        imię = BMI.next();
        System.out.println("Witaj " + imię);
        System.out.println("Podaj swój wzrost (w centymetrach)");
        wzrost = BMI.nextDouble();
        System.out.println("Podaj swoją wagę (tylko nie oszukuj!) Wpisz dokładną wagę w kilogramach");
        waga = BMI.nextDouble();

        wzrost = wzrost/100; // zmiana jednostek cm na m
        bmi1 = waga/ (wzrost*wzrost); // wzór na obliczanie BMI  masa ciała/wzrost do kwadratu

        System.out.println(imię + "," + " twoje BMI to " + bmi1);
       if (bmi1 < 18.5)
       {
           System.out.println("Masz niedowagę. Musisz jeść więcej");
       }
       else if (bmi1 <=24.99)
       {
           System.out.println("Twoja waga jest prawidłowa. Brawo!");
       }
        else
       {
           System.out.println("Masz nadwagę. Zacznij ćwiczyć lub mniej jeść");
       }




    }



}
