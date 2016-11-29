package korepetycje1.obiektowość;

import java.util.Scanner;


public class MatrixHelper
{
    public int getNumberFromUser (int height, int lenght)
    {
        System.out.println("Podaj element[" + height + "][" + lenght + "]: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }

    public Matrix fillMatrix (int height, int lenght)
    {
        Matrix matrix = new Matrix(height, lenght);
        for (int i=0;i<height;i++)
        {
            for (int j=0;j<lenght;j++)
            {
                matrix.setValue(i,j,getNumberFromUser(i,j));
            }
        }
        return matrix;
    }

    public int getHightFromUser ()
    {
        System.out.println("Podaj wysokość");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        return height;
    }
    public int getLenghtFromUser ()
    {
        System.out.println("Podaj długość");
        Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();
        return lenght;
    }

}
