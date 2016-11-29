package korepetycje1.obiektowość;


import korepetycje1.ArrayOperations;

import java.util.Scanner;

public class Codes {

    public static final int LEFT_SIZE=-5;
    public static final int RIGHT_SIZE=5;


    public static void main(String[] args) {

    {
        Codes code = new Codes();
        String message = "Ala ma kota";
        int offset = 2;
//        String codedMessage = code.cezarCode(message, offset);
//        System.out.println(code.cezarDecode(codedMessage, offset));
//        String result = code.cezarCodeBruteForce(codedMessage);
        String result = code.ownCode(message,offset);
        System.out.println(result);
        String codedMessage = result;
        result=code.ownCodeDecode(result,offset);
        System.out.println(result);
//        System.out.println(code.cezarCode("ALA MA KOTA", 3));
//        System.out.println();
//        System.out.println(code.code("TNWDO.AAIOSJ_AMC", 6));
//        ArrayOperations.listArray(in(-2,2));
    }

    }
    public String cezarCodeBruteForce (String codedMessage)
    {
        System.out.println("Cezar Code Decoder");
        boolean flag = true;
        int index =0;

        Codes codes = new Codes();
        Scanner scanner = new Scanner(System.in);
        String messageCandidate = null;
        while (flag)
        {
            messageCandidate = codes.cezarDecode(codedMessage,index++);
            System.out.println("Is message valid: " + messageCandidate);
            System.out.println("1 = true");
            System.out.println("0 = false");
            boolean answer = scanner.nextInt() == 1;
            if (answer || index>10)
            {
                flag=false;
            }
        }
        return messageCandidate;
    }
    // własny algorytm szyfrujący i algorytm deszyfrujący
    // poczytać o obiektowości - dziedziczenie
    // schemat blokowy szyfru cezara

    public String cezarCode (String message, int offset)
    {
        char[] messageInArray = message.toCharArray();
        char[] codeMessageArray = new char[messageInArray.length];

        for (int i=0;i<messageInArray.length;i++)
        {
            codeMessageArray[i] = (char)(messageInArray[i]+offset);
        }
        return String.valueOf(codeMessageArray);
    }
    public String cezarDecode (String message, int offset)
    {
        return cezarCode(message,offset*(-1));
    }


    public String code (String message , int offset)
    {
        if (offset==0)
        {
            return message;
        }
        char[] messageInArray = message.toCharArray(); //metoda robi tablicę znaków ze string

        char[] codeMessageArray = new char[messageInArray.length];
        int tmp=0;
        for (int i=0;i<offset;i++)
        {
            int j=0;
            while (i+offset*j<messageInArray.length)
            {
                codeMessageArray[tmp++] = messageInArray[i+offset*j];
                j++;
            }
        }
        return String.valueOf(codeMessageArray);
    }


    public static int rage (int left, int right)
    {
        return (right-left+1);
    }

    public static int[] in (int left, int right)
    {
        int size=rage(left,right);
        int[] array = new int[size];

        for (int i=0;i<size;i++)
        {
            array[i] = left+i;
        }
        return array;
    }

    public static int[] out (int left, int right)
    {
        int leftrage = rage(LEFT_SIZE, left-1);
        int rightrage = rage(right+1, RIGHT_SIZE);

        int[] array = new int[leftrage+rightrage];
        for (int i=0;i<leftrage;i++)
        {
            array[i]= LEFT_SIZE+i;
        }
        for (int i=0;i<rightrage;i++)
        {
            array[leftrage+i] = right+i;
        }
        return array;
    }
    public static int[] outTwo (int left, int right)
    {
        return ArrayOperations.mergeArrays(in(LEFT_SIZE,left-1),in(right+1,RIGHT_SIZE));
    }

    public String cezarCodeO (String message, int offset)
    {
        char[] messageInArray = message.toCharArray();
        char[] codeMessageArray = new char[messageInArray.length];

        for (int i=0;i<messageInArray.length;i++)
        {
            codeMessageArray[i] = (char)(messageInArray[i]+offset);
        }
        return String.valueOf(codeMessageArray);
    }

    public String ownCode (String message, int offset){
        char[] messageInArray = message.toCharArray();
        char[] codeMessageArray = new char[messageInArray.length];

        for (int i=0;i<messageInArray.length;i++){
            codeMessageArray[i] = (char)(messageInArray[i] - offset+1);
        }
        return String.valueOf(codeMessageArray);
    }

    public String ownCodeDecode (String message, int offset){
        char[] messageInArray = message.toCharArray();
        char[] codeMessageArray = new char[messageInArray.length];

        for (int i=0;i<messageInArray.length;i++){
            codeMessageArray[i] = (char)(messageInArray[i] + offset-1);
        }
        return String.valueOf(codeMessageArray);
    }

}
// własny algorytm szyfrujący i algorytm deszyfrujący
// poczytać o obiektowości - dziedziczenie
// schemat blokowy szyfru cezara