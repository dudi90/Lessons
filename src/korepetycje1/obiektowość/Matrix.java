package korepetycje1.obiektowość;


public class Matrix
{
    private int[][] matrix;
    private int height;
    private int lenght;

    public Matrix (int height, int lenght, int[][] matrix)
    {
        int matrixHeight=matrix.length;
        int matrixLenght=matrix[0].length;

        if (matrixHeight==height && matrixLenght==lenght)
        {
            this.height = height;
            this.lenght = lenght;
            this.matrix = matrix;
        }

        //dodać sprawdzanie height i lenght czy są większe od 0
        //sprawdzić czy height i lengh są takie same jak w matrix
    }
    public Matrix (int[][] matrix)
    {
        this.matrix = matrix;
        this.height=matrix.length;
        this.lenght=matrix[0].length;
    }
    public Matrix (int height, int lenght)
    {
        if (height>0 && lenght>0)
        {
            this.height=height;
            this.lenght=lenght;
            this.matrix = new int[height][lenght];
        }

//        dodać sprawdzanie height i lenght czy są większe od 0
    }

    public int[][] getMatrix()
    {
        return matrix;
    }

    public void setMatrix(int[][] matrix)
    {
        this.matrix = matrix;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
            this.height = height;
    }

    public int getLenght()
    {
        return lenght;
    }

    public void setLenght(int lenght)
    {
            this.lenght = lenght;
    }

    public void addition (Matrix matrix) //sprawdzić czy wymiary się zgadzają
    {
        if (dimensionsEqual(matrix))
        {
            for (int i=0;i<this.height;i++)
            {
                for (int j=0;j<this.lenght;j++)
                {
                    this.matrix[i][j]+=matrix.matrix[i][j];
                }
            }
        }
    }
    public void substraction (Matrix matrix) // sprawdzić czy wymiary się zgadzają
    {
        if (dimensionsEqual(matrix))
        {
            for (int i=0;i<this.height;i++)
            {
                for (int j=0;j<this.lenght;j++)
                {
                    this.matrix[i][j]-=matrix.matrix[i][j];
                }
            }
        }
    }

    public boolean dimensionsEqual(Matrix matrix)
    {
//        boolean result = (this.lenght==matrix.getLenght() && this.height==matrix.getHeight());
        return (this.lenght==matrix.getLenght() && this.height==matrix.getHeight());
    }

    public int sum ()
    {
        int sum=0;
        for (int i=0;i<this.height;i++)
        {
            for (int j=0;j<this.lenght;j++)
            {
                sum += this.matrix[i][j];
            }
        }
        return sum;
    }

    public void print ()
    {
        for (int i=0;i<this.height;i++)
        {
            for (int j=0;j<this.lenght;j++)
            {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void setValue (int height, int lenght, int value)
    {
        if (height>=0 && lenght>=0 && height < this.height && lenght < this.lenght)
        {
            this.matrix[height][lenght] = value;
        }
        else
        {
            System.out.println("Wrong dimensions");
        }

        // sprawdzić czy wartości nie są mniejsza od 0 i czy nie są poza wymiarami matrixa (this
    }
}
