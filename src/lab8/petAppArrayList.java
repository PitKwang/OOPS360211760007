package lab8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class petAppArrayList {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many pets do you have? : ");
        int val = Integer.parseInt(reader.readLine());
        ArrayList<Pet> myPet = new ArrayList<Pet>();

        myPet = inputData(myPet,val);
        showdata(myPet);
    }

    private static void showdata(ArrayList<Pet> myPet) {
        System.out.println("My Pets data shown below: ");
        for (int i = 0; i < myPet.size(); i++) {
            System.out.println(myPet.get(i).getClass().getSimpleName()+" "+myPet.get(i).toString());
        }
    }

    private static ArrayList<Pet> inputData(ArrayList<Pet> myPet, int val) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter you pets info.\n");
        for (int i = 1; i <= val; i++) {
            System.out.print("Pet: "+i+". if it is a \"Dog\" type 1 or \"Cat\" type other.    : ");
            int t = Integer.parseInt(reader.readLine());
            if (t == 1) {
                Dog d = new Dog();
                System.out.print("Dog name: ");
                d.setName(reader.readLine());
                System.out.print("Dog age: ");
                d.setAge(Integer.parseInt(reader.readLine()));
                myPet.add(d);
            } else {
                Cat c = new Cat();
                System.out.print("Cat name: ");
                c.setName(reader.readLine());
                System.out.print("Cat age: ");
                c.setAge(Integer.parseInt(reader.readLine()));
                myPet.add(c);
            }
        }
        return myPet;

    }
}