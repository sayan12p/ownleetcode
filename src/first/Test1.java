package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


    class Animal{
        void eat(){System.out.println("eating...");}
    }
    class Dog extends Animal{
        void bark(){System.out.println("barking...");}
    }
    class Test1{
        public static void main(String args[]){
            Dog d=new Dog();
            d.bark();
            d.eat();
        }
}
