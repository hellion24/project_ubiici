package Sobaka;

import java.lang.*;
public class TestSobaka {
    public static void main(String[] args) {
        Sobaka s1 = new Sobaka("Dima", 3);
        Sobaka s2 = new Sobaka("Mitya", 4);
        Sobaka s3 = new Sobaka("Dmitriy");
        s3.setAge(2);
        System.out.println(s1);
        s1.intoHumanAge();
        s2.intoHumanAge();
        s3.intoHumanAge();
    }
}