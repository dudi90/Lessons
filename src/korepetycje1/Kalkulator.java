package korepetycje1;

import java.util.Scanner;

public class Kalkulator
{
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        int d=0;
        String c;
        String[] menu = {"1", "2", "3", "4", "5"};

        System.out.println("Calculator. Select an operation by pressing right number");
        System.out.println("Addition - " + "      1");
        System.out.println("Subtraction - " + "   2");
        System.out.println("Multiplication - " + "3");
        System.out.println("Division - " + "      4");
        System.out.println("Factorial - " + "     5");
        Scanner calculator = new Scanner(System.in);
        System.out.println("Enter operation number:");
        c = calculator.next();
        double result = 0.0;
        if (c.equals(menu[0]))
        {
            System.out.println("Enter number 1:");
            a = calculator.nextDouble();
            System.out.println("Enter number 2:");
            b = calculator.nextDouble();
            result = addition(a, b);
        }
        else if (c.equals(menu[1]))
        {
            System.out.println("Enter number 1");
            a = calculator.nextDouble();
            System.out.println("Enter number 2");
            b = calculator.nextDouble();
            result = subtraction(a, b);
        }
        else if (c.equals(menu[2]))
        {
            System.out.println("Enter number 1");
            a = calculator.nextDouble();
            System.out.println("Enter number 2");
            b = calculator.nextDouble();
            result = multiplication(a, b);
        }
        else if (c.equals(menu[3]))
        {
            System.out.println("Enter number 1");
            a = calculator.nextDouble();
            System.out.println("Enter number 2");
            b = calculator.nextDouble();
            result = division(a, b);
        }
        else if (c.equals(menu[4]))
        {
            System.out.println("Enter natural number");
            d = calculator.nextInt();
            result = factorial(d);
        }
        else
        {
            System.out.println("Wrong data");
        }
        System.out.println("Result: " + result);
    }
    public static double addition (double a, double b)
    {
        double wynik = a+b;
        return wynik;
    }
    public static double subtraction (double a, double b)
    {
        double wynik = a-b;
        return wynik;
    }
    public static double multiplication (double a, double b)
    {
        double wynik = a*b;
        return wynik;
    }
    public static double division(double a, double b)
    {
        if (b == 0)
        {
            System.out.println("Do not divide by 0");
            return 0;
        }
        else
        {
            double wynik = a / b;
            return wynik;
        }
    }
//    public static int factorialFor ()
//    {
//        for (int i=1; i!=11 ; i++ )
//        {
//            System.out.println(i);
//        }
//        return 0;
//    }
//
//    public static int factorialWhile ()
//    {
//        int i=1;
//        while (i<11)
//        {
//            i++;
//            System.out.println(i);
//
//        }
//        return 0;
//
//    }
//    public static int factorialDoWhile ()
//    {
//        int i= 12;
//        do
//        {
//            i++;
//            System.out.println(i);
//
//        } while (i<11);
//        return 0;
//    }
//
    public static int factorial (int d)
    {
        int result = 1;
        if (d < 0) {
            System.out.println("Wrong data");
            result = 0;
        } else
        {
            for (int i = 1; i < d + 1; i++)
            {
                result = result * i;
            }
        }
        return result;
    }
//    }
//    public static void arrayItteration ()
//    {
//        String[] names = {"Jan", "Ania","Piotr", "Krzsztof"};
//
//        for (int i=0; i<names.length; i++)
//        {
//            System.out.println(names[i]);
//        }
    }

// Poprawienie dzielenia
// Dodać factorial do kalkulatora
// Napisać funkcje, w której zdefiniowana tablica typu int. Przeiterować wszystkie elementy, zsumował wartości i sout. zacommitować
// po zacommitowaniu zrobić jedną zmianę - zmienić funkcje - nie definiować argmumentów w środku tylko żeby tablica przyszla

