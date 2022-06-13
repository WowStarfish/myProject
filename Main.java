package com.company;


 class StaticSuper {

    static
    {
        System.out.println("super static block");
    }
    StaticSuper()
    {
        System.out.println("super constructor");
    }

}

 public class Main extends StaticSuper{
    static int rand;
    static
    {
        rand = (int)(Math.random() * 6);
        System.out.println("static block " +  rand);
    }

    Main()
    {
        System.out.println("constructor");
    }
    public static void main(String [] args) {
        System.out.println("in main");
        Main st = new Main();

    }
}

