package Kniga;

import java.lang.*;
public class TestKniga {
    public static void main(String[] args) {
        Kniga k1 = new Kniga("Chelovek nevidimka", 322);
        Kniga k2 = new Kniga("Ostrov doktora Moro", 444);
        Kniga k3 = new Kniga("Mashina vremeny");
        k3.setPages(2);
        System.out.println(k1);
        k1.print();
        k2.print();
        k3.print();
    }
}