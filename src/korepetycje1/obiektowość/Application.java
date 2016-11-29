package korepetycje1.obiektowość;


import java.util.Scanner;

public class Application {

    public static void main(String[] args)
    {
        MatrixHelper matrixHelper = new MatrixHelper();
        Matrix matrix = matrixHelper.fillMatrix(matrixHelper.getHightFromUser(),matrixHelper.getLenghtFromUser());
        System.out.println("Suma elementów macierzy to " + matrix.sum());
        matrix.print();


    }


}

