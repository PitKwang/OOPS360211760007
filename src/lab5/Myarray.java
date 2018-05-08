package lab5;

import java.util.Scanner;

public class Myarray {
    public static void main(String[] args) {
        //array

        int x = 10;
        x = 20;
        int a[] = new int [5];
        System.out.println(a[0]);
        a[0] = 10;
        System.out.println(a[0]);

        //input data to array
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]:");
            a[i] = sc.nextInt();
        }
        //show data in array
        System.out.println("Data in array");
        for (int i=0; i< a.length; i++) {
            System.out.println(a[i] + "\t");
        }
        System.out.println("\nEnhanced for loop");
        //enchanced for loop
        for (int val:a){
            System.out.println(val+"\t");
        }
    }//main
}//class
