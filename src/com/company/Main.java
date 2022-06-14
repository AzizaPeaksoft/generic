package com.company;

public class Main {

    public static void main(String[] args) {

       Box<Integer> box = new Box<>(45,23);
       Box<Integer> box2 = new Box<>(1,52);
       Box.genericMethod(box, box2);
    }
}
