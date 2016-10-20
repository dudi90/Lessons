package korepetycje1;


import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        double a = 0;
        double b = 0;
        String c;
        String[] menu = {"1","2","3","4"};

        Scanner kalkulator = new Scanner(System.in);
        System.out.println("Podaj liczbę nr 1");
        a = kalkulator.nextDouble();
        System.out.println("Podaj liczbę nr 2");
        b = kalkulator.nextDouble();


        System.out.println("Możliwe działania: " + "(Wybierz numer działania)");
        System.out.println("Dodawanie- " + "1");
        System.out.println("Odejmowanie- " + "2");
        System.out.println("Mnożenie- " + "3");
        System.out.println("Dzielenie- " + "4");

        c = kalkulator.next();

        double wynik=0.0;

        if(c.equals(menu[0]))
        {
            wynik = dodawanie(a,b);
        }
        else if(c.equals(menu[1]))

        {
            wynik = odejmowanie(a,b);
        }
        else if(c.equals(menu[2]))
        {
            wynik = mnożenie(a,b);
        }
        else if(c.equals(menu[3]))
        {
            wynik = dzielenie(a,b);
            if (a==0)
            {
                System.out.println("Nie dzielimy przez 0");
                return;
            }
            if (b==0)
            {
                System.out.println("Nie dzielimy przez 0");
                return;
            }
        }
        else
            System.out.println("Podano wartość nieobsługiwaną");

        System.out.println("Wynik działania to: " + wynik);



        /* if(c.equals(menu[0]))
        {
            wynik = a+b;
        }
        else if(c.equals(menu[1]))

        {
            wynik = a-b;
        }
        else if(c.equals(menu[2]))
        {
            wynik = a*b;
        }
        else if(c.equals(menu[3]))
        {
            wynik = a/b;
        }
        else
            System.out.println("Podano wartość nieobsługiwaną");

        System.out.println("Wynik działania to: " + wynik);

        */

    }

    public static double dodawanie (double a, double b)
    {
        double wynik = a+b;
        return wynik;
    }
    public static double odejmowanie (double a, double b)
    {
        double wynik = a-b;
        return wynik;
    }
    public static double mnożenie (double a, double b)
    {
        double wynik = a*b;
        return wynik;
    }
    public static double dzielenie (double a, double b)
    {
        double wynik = a/b;
        return wynik;
    }


}
