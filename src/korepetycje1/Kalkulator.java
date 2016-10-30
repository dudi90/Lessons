package korepetycje1;

import java.util.Scanner;

public class Kalkulator
{
    public static void main(String[] args)
    {
        double numberOne = 0;
        double numberTwo = 0;
        int factorialNumber = 0;
        String operationNumber;
        String[] menu = {"1", "2", "3", "4", "5","6","7","8","9"};

        System.out.println("Calculator. Select an operation by pressing right number");
        System.out.println("Addition - " + "                   1");
        System.out.println("Subtraction - " + "                2");
        System.out.println("Multiplication - " + "             3");
        System.out.println("Division - " + "                   4");
        System.out.println("Factorial - " + "                  5");
        System.out.println("Sum of array - " + "               6");
        System.out.println("MIN element of array - " + "       7");
        System.out.println("MAX element of array - " + "       8");
        System.out.println("Average elements of array - " + "  9");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operation number:");
        operationNumber = scanner.next();
        System.out.println("Enter number 1:");
        numberOne = scanner.nextDouble();
        System.out.println("Enter number 2:");
        numberTwo = scanner.nextDouble();
        double result = 0.0;

        if (operationNumber.equals(menu[0]))
        {
            result = addition(numberOne, numberTwo);
        }
        else if (operationNumber.equals(menu[1]))
        {
            result = subtraction(numberOne, numberTwo);
        }
        else if (operationNumber.equals(menu[2]))
        {
            result = multiplication(numberOne, numberTwo);
        }
        else if (operationNumber.equals(menu[3]))
        {
            result = division(numberOne, numberTwo);
        }
        else if (operationNumber.equals(menu[4]))
        {
            System.out.println("Enter natural number");
            factorialNumber = scanner.nextInt();
            factorial(factorialNumber);
        }
        else if (operationNumber.equals(menu[5]))
        {
            System.out.println("Enter number of array elements:");
            int number = scanner.nextInt();
            arraySum(arrayFill(number));
        }
        else if (operationNumber.equals(menu[6]))
        {
            System.out.println("Enter number of array elements:");
            int number = scanner.nextInt();
            ArrayOperations.min(arrayFill(number));
        }
        else if (operationNumber.equals(menu[7]))
        {
            System.out.println("Enter number of array elements:");
            int number = scanner.nextInt();
            ArrayOperations.max(arrayFill(number));
        }
        else if (operationNumber.equals(menu[8]))
        {
            System.out.println("Enter number of array elements:");
            int number = scanner.nextInt();
            ArrayOperations.avg(arrayFill(number));
        }
        else
        {
            System.out.println("Wrong data");
            return;
        }
    }

    public static double addition(double numberOne, double numberTwo)
    {
        double result = numberOne + numberTwo;
        System.out.println("Result: " + result);
        return result;
    }

    public static double subtraction(double numberOne, double numberTwo)
    {
        double result = numberOne - numberTwo;
        System.out.println("Result: " + result);
        return result;
    }

    public static double multiplication(double numberOne, double numberTwo)
    {
        double result = numberOne * numberTwo;
        System.out.println("Result: " + result);
        return result;
    }

    public static double division(double numberOne, double numberTwo)
    {
        if (numberTwo == 0)
        {
            System.out.println("Do not divide by 0");
            return 0;
        }
        else
        {
            double result = numberOne / numberTwo;
            System.out.println("Result: " + result);
            return result;
        }
    }

    public static int factorial (int d)
    {
        int result = 1;
        if (d < 0)
        {
            System.out.println("Wrong data");
            result = 0;
        }
        else
        {
            for (int i = 1; i < d + 1; i++)
            {
                result = result * i;
            }
        }
        System.out.println("Result: " + result);
        return result;
    }

    public static int[] arrayFill (int number)
    {
        int[] array = new int[number];
        Scanner scanner = new Scanner(System.in);

    for (int i=0; i<array.length; i++)
    {
        System.out.println("Enter number " + (i+1));
        int userNumber = scanner.nextInt();
        array[i] = userNumber;
    }
        return array;
    }
    public static int arraySum (int[] array)
    {
        int sum =0;

        for (int i=0; i<array.length; i++)
        {
            sum += array[i];
        }
        System.out.println("Sum of array elements is: " + sum);
        return sum;
    }
}

// dodać min, max, avg - nieprzepisując tylko z arrayOperations
// algorytm sortowania bąbelowego