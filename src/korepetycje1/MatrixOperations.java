package korepetycje1;

import java.util.Scanner;

public class MatrixOperations
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wierszy");
        int row = scanner.nextInt();
        System.out.println("Podaj liczbe kolumn");
        int column = scanner.nextInt();
        int[][] matrix = fillMatrixDiagonal(row,column);
        list(matrix,row,column);
        System.out.println();
        int[][] matrixHorizontal = fillMatrix(row,column);
        list(matrixHorizontal,row,column);
        System.out.println();
        int[][] matrixVertical = fillMatrixVertical(row,column);
        list(matrixVertical,row,column);
    }

    public static int[][] fillMatrix (int row, int column)
    {
        int[][] matrix = new int[row][column];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                matrix [i][j] = j+i*column+1;
            }
        }
        return matrix;
    }
    public static void list (int[][] matrix, int row, int column)
    {
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.print(matrix[i][j] + " " );
            }
            System.out.println();
        }
    }
    public static int[][] fillMatrixVertical (int row, int column)
    {
        int[][] matrix = new int[row][column];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                matrix[i][j] = i+j*row+1;
            }
        }
        return matrix;
    }
    public static int[][] fillMatrixDiagonal (int row, int column)
    {
        int[][] matrix = new int[row][column];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                if (i==j)
                {
                    matrix[i][j] = 1;
                }
                else
                    {
                        matrix[i][j] = 0;
                    }
            }
        }
        return matrix;
    }
}

//napisać podobną do fillmatrix metodę, ale żeby wypiswała elemtenty w pionie - z góry do dołu
//metoda która zwróci macierz, która przyjmuje 2 rugmenty ilość wierszy, ilość kolumn. Na głównej lini(przekątna) wypisze 1 a poza nią 0
//jak to wyświetlać jeśli wartości są 2 lub 3 cyfrowe 0Podpowiedź, poszukać wartości maksymalnej)