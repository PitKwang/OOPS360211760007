package lab8;

public class petApp {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("Safe");
        d1.setAge(5);

        System.out.println(d1.toString()+" "+d1.getClass().getSimpleName());

        Cat d2 = new Cat();
        d2.setName("Kwang");
        d2.setAge(2);

        System.out.println(d2.toString()+" "+d2.getClass().getSimpleName());


    }//main

}//class
