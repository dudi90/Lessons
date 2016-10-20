package korepetycje1;


import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {


        int result=factorial(-10);
        System.out.println(result);


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
        double wynik = a/b; // zanim podzielisz, sprawdź czy na pewno możesz podzielić
        return wynik;
    }

    public static int factorialFor ()
    {
        for (int i=1; i!=11 ; i++ )
        {
            System.out.println(i);
        }
        return 0;
    }

    public static int factorialWhile ()
    {
        int i=1;
        while (i<11)
        {
            i++;
            System.out.println(i);

        }
        return 0;

    }
    public static int factorialDoWhile ()
    {
        int i= 12;
        do
        {
            i++;
            System.out.println(i);

        } while (i<11);
        return 0;
    }

    public static int factorial (int number)
    {
        int result=1;
        if (number<0)
        {
            System.out.println("Wrong data");
            result = 0;
        }
        else
        {
            for (int i=1; i<number+1; i++)
            {
                result=result*i;
            }
        }
        return result;
    }
    public static void arrayItteration ()
    {
        String[] names = {"Jan", "Ania","Piotr", "Krzsztof"};

        for (int i=0; i<names.length; i++)
        {
            System.out.println(names[i]);
        }


    }




}



// Poprawienie dzielenia
// Dodać factorial do kalkulatora
// Napisać funkcje, w której zdefiniowana tablica typu int. Przeiterować wszystkie elementy, zsumował wartości i sout. zacommitować
// po zacommitowaniu zrobić jedną zmianę - zmienić funkcje - nie definiować argmumentów w środku tylko żeby tablica przyszla

