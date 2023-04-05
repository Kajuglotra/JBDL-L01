package gfg.com;

public class Animal {

    int x = 10;
    public Animal(){
        System.out.println("Inside Animal Constructor");

    }

    public Animal(int x) {
        System.out.println("Inside Animal parametrized Constructor");
        this.x = x;
    }

    //Defination of eat
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void walk(){
        System.out.println("Animal is walking");
    }

}
