package korepetycje1;

/**
 * Created by Tomek on 2016-10-31.
 */
public class Sort
{
    public static void main(String[] args)
    {
        int[] array = {2,-2,5,-6,8,-9,10,12,8,0};
        ArrayOperations.listArray(bubbleSortHomeWork(array));
        System.out.println();
        ArrayOperations.listArray(selectionSortMin(array));
        System.out.println();
        ArrayOperations.listArray(selectionSortMax(array));
        System.out.println();
        ArrayOperations.listArray(insertionSort(array));

    }
    public static int[] bubbleSort (int[] array)
    {
        int counter = 0;
        for (int i=0;i<array.length;i++)
        {
            for (int j=1;j<array.length-i;j++)
            {
                if (array[j-1]>array[j])
                {
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
                counter++;
            }
        }
        System.out.println(counter);
        return array;
    }

    public static int[] selectionSort (int[] array)
    {
        for (int i=array.length-1;i>-1;i--)
        {
            int index = indexOfMax(array,i+1);
            int tmp = array[index];
            array[index] = array[i];
            array[i] = tmp;
        }
        return array;
    }

    public static int indexOfMax (int[] array, int size)
    {
        int tmp = 0;
        for (int i=1;i<size;i++)
        {
            if (array[tmp]<array[i])
            {
                tmp=i;
            }
        }
        return tmp;
    }

    public static void swap ()
    {
        int[] array = {1,-2,3,-6,5,-7};
        for (int i=0;i<array.length;i+=2)
        {
            int number = array[i];
            array[i] = array[i+1];
            array[i+1] = number;
        }
        ArrayOperations.listArray(array);
    }

    public static int[] bubbleSortHomeWork (int[] array)
    {
        for (int i=0;i<array.length;i++)
        {
            for (int j=1;j<array.length-i;j++)
            {
                if (array[j-1]>array[j])
                {
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
    public static int[] selectionSortMin (int[] array) //sortowanie od najmniejszej wartości
    {
        for (int i=0;i<array.length-1;i++)
        {
            int index = i;
            for (int j=i+1;j<array.length;j++)
            {
                if (array[j] < array[index])
                {
                    index = j;
                    int minValue = array[index];
                    array[index] = array[i];
                    array[i] = minValue;
                }
            }
        }
        return array;
    }
    public static int[] selectionSortMax (int[] array) //sortowanie od największej wartości
    {
        for (int i=0;i<array.length-1;i++)
        {
            int index = i;
            for (int j=i+1;j<array.length;j++)
            {
                if (array[j] > array[index])
                {
                    index = j;
                    int maxValue = array[index];
                    array[index] = array[i];
                    array[i] = maxValue;
                }
            }
        }
        return array;
    }
   public static int[] insertionSort (int[] array)
    {
        for (int i=1;i<array.length;i++)
        {
            int temp = array[i];
            int j = i-1;
            while (j>= 0 && temp < array[j])
            {
                int tmp = array[j];
                array[j] = array[j+1];
                array[j+1] = tmp;
                j--;
            }
        }
        return array;
    }
}

// napisać jeszcze raz funkcje sortowania bąbelkowego
// funckja selectionSort bez indexofMax
// sortowanie przez wstawianie InsertionSort - napisać
