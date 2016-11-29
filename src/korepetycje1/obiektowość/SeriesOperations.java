package korepetycje1.obiektowość;


import korepetycje1.ArrayOperations;

import java.util.Scanner;

public class SeriesOperations {

    private static final int LEFT_SIZE=-5;
    private static final int RIGHT_SIZE=5;

    public static void main(String[] args)
    {


//        ArrayOperations.listArray(fibonacci(30));
        SeriesOperations series = new SeriesOperations();
        ArrayOperations.listArray(series.in(-2,2));
    }



    public int[] in (int left, int right)
    {
        int size=rage(left,right);
        int[] array = new int[size];

        for (int i=0;i<size;i++)
        {
            array[i] = left+i;
        }
        return array;
    }


    public int[] out (int left, int right)
    {

        return ArrayOperations.mergeArrays(in(LEFT_SIZE,left-1),in(right+1,RIGHT_SIZE));

//        int leftRage = rage(LEFT_SIZE,left-1);
//        int rightRage = rage(right+1,RIGHT_SIZE);
//
//        int[] array = new int[leftRage + rightRage];
//
//        for (int i=0;i<leftRage;i++)
//        {
//            array[i] = LEFT_SIZE+i;
//        }
//        for (int i=0;i<rightRage;i++)
//        {
//            array[leftRage+i] = right+1+i;
//        }
//        return array;
    }

    public int rage (int left, int right)
    {
        return (right-left)*(left>right ? -1:1) + 1;
//        left =5;
//        right = 2
//        int result = left>right ? left-right+1: right-left+1;
//        if (left>right)
//        {
//            result = left-right+1;
//        }
//        else
//        {
//            result = right-left+1;
//        }
//        if (left==right)
//        {
//            result = 1;
//        }
////        else if ((left>=0 && right>=0) || (left <= 0 && right>0) || (left<0 && right<0) )
////        {
////            result = right-left+1;
////        }
//        return result;

    }
    public static int[] fibonacci (int size)  //funkcja, która zwraca konkretny element
    {
        int[] array;
        if (size==0)
        {
            array = new int[size];
        }
        else if (size==1)
        {
            array = new int[size];
            array[0]=1;
        }
        else
        {
            array = new int[size];
            array[0] = 1;
            array[1]=1;
            for (int i = 2; i < size; i++)
            {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        return array;
    }

}
