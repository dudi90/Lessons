package korepetycje1;

import java.util.Scanner;

public class ArrayOperations
{
    public static void main(String[] args)
    {
//        int[] table = {2,4,5,6,};
//        listArray(table);
//        max(table);

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
        System.out.println("Minimum element of array is " + min);
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
        System.out.println("Maximum element of array is " + max);
        return max;
    }

    public static int avg(int[] array)
    {
        int sum =0;
        int avg=0;

        for (int i=0; i<array.length; i++)
        {
            sum = array[i] + sum;
        }
        avg = sum/array.length;
        System.out.println("Average elements of array is " + avg);
        return avg;
    }

    public static int arraySum (int[] array)
    {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of array elements is: " + sum);
        return sum;
    }
    public static int[] mergeArrays (int[] leftArray, int[] rightArray)
    {
        int[] array = new int[leftArray.length + rightArray.length];
        for (int i=0;i<leftArray.length;i++)
        {
            array[i] = leftArray[i];
        }
        for (int i=0;i<rightArray.length;i++)
        {
            array[leftArray.length+i] = rightArray[i];
        }
        return array;
    }

}
