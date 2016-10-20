package korepetycje1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Korepetycje {
    public static void main(String[] args){
        System.out.println("Hello world");

        int a;
        int b;
        String c;
        String[] tablica = {"+","-","/","*"};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj działanie");
        c = scanner.next();
        System.out.println("Podaj liczbę 1");
        a = scanner.nextInt();
        System.out.println("Podaj liczbę 2");
        b = scanner.nextInt();


        int wynik = 0;
        double wynikDzielenia;
        if(c.equals(tablica[0]))
        {
            wynik = a+b;
        }
        else if(c.equals(tablica[1]))
        {
            wynik = a-b;
        }
        else if(c.equals(tablica[2]))
        {
            if (b ==0)
            {
                System.out.println("Nie dzielimy przez 0");
                return;

            }

            //double licznik = a;

            wynikDzielenia = ((double) a)/b;
            System.out.println("Wynik działania" + wynikDzielenia);
            return;

        }
        else if(c.equals(tablica[3]))
        {
            wynik = mnożenie(a,b);
        }
        else
        {
            System.out.println("Podano wartość nieobsługiwaną");
            return;
        }
        System.out.println("Wynik działania =" + wynik);
    }

    public static int mnożenie (int a, int b)
    {
        int wynik = a*b;
        return wynik;

    }


    // Przepisać kalkulator aby używał double zamiast int
    // Poprawienie interfejsu - wyswietlanie dostępnych opcji, wybieranie przez 1-4
    // BMI
    // przepisać działania na funkcjach
}
// for, while,