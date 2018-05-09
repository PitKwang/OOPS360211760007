package lab5;
//1.Method for input data
//2.Method for show data
//3.Method for find average value from array
//4.Method for find maximum value
//5.Method for find minimum value

import java.util.Scanner;

public class arrayOperator {
    public static final int MAX = 10;
    public static void main(String[] args) {
        int Myarray[] = new int[MAX];
        Myarray = inputData(Myarray);
        showData (Myarray);

        //find average
        findAverage(Myarray);
        //find max
        findMax(Myarray);
        //find min
        findMin (Myarray);


    }//main

    private static void findMin(int[] Myarray) {
        int min = Myarray[0];
        for (int i=0; i < Myarray.length; i++){
            if (min>=Myarray[i])
                min = Myarray[i];
        }
        System.out.println("The minimum value is "+min);
    }

    private static void findMax(int[] Myarray) {
        int max = Myarray[0];
        for (int i=0; i < Myarray.length; i++){
            if (max<=Myarray[i])
                max = Myarray[i];
        }
        System.out.println("The maximum value is "+max);
    }

    private static void findAverage(int[] Myarray) {
        int total = 0;
        for (int val:Myarray)
            total += val;
        System.out.println("\nThe average value is "+(total/MAX));
    }


    public static void showData(int[] Myarray) {
        System.out.println("Data in array");
        for (int val:Myarray)
            System.out.print(val+"\t");
    }

    private static int[] inputData(int[] Myarray) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter integers : ");
        for (int i = 0; i < Myarray.length; i++){
            System.out.print("integer "+i+": ");
            Myarray[i] = sc.nextInt();
        }
        return  Myarray;
    }
}//class
