package korepetycje1;

import java.util.Scanner;

public class ArrayOperations
{
    public static void main(String[] args)
    {

//        arrayFill(2);
//        listArray(arrayFill(3));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of arrays");
        int number = scanner.nextInt();
        arraySum(arrayFill(number));
//
////        System.out.println(max(userNumbers));
//        int[] table = arrayFill(10);
//        listArray(table);

//        System.out.println(avg(table));

//        int[] number ={10,10,20,60};
//        listArray(number);
//        min(number);
//        max(number);
//        avg(number);

//        System.out.println(avg(number));
//        System.out.println(min(number));
//        System.out.println(max(number));
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
    public static void listArray(int[] array)
    {
        for (int i=0; i<array.length;i++)
        {
            System.out.println("Number " + (i+1) + " is " + array[i]);
        }
    }
    public static int min(int[] array)
    {
        int min=array[0];
        for (int i=1; i<array.length;i++)
        {
            if (min>array[i])
            {
                min=array[i];
            }
        }
        return min;
    }
    public static int max(int[] array)
    {
        int max=array[0];
        for (int i=1; i<array.length;i++)
        {
            if (max<array[i])
            {
                max=array[i];
            }
        }
        return max;
    }
    public static int avg(int[] array)
    {
        int sum =0;
        int avg=0;

        for (int i=0; i<array.length; i++)
        {
            sum = array[i] + sum;
            avg = sum/array.length;

        }
        return avg;
    }

    public static int arraySum (int[] array)
    {
        int sum =0;

        for (int x=0; x<array.length; x++)
        {
            sum += array[x];
        }
        System.out.println("Sum of array elements is: " + sum);
        return sum;
    }
}
