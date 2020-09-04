package Myach;

import java.lang.*;
public class TestMyach {
    public static void main(String[] args) {
        Myach k1 = new Myach("red", 322);
        Myach k2 = new Myach("black", 444);
        System.out.println(k1);
        k1.print();
        k2.print();
    }
}