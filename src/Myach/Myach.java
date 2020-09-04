package Myach;

public class Myach {

    private String color;
    private int size;

    public Myach(String n, int a){
        color = n;
        size = a;
    }
    public Myach(String n){
        color = n;
        size = 0;

    }
    public Myach() {
        color = "Voina i mir";
        size= 0;
    }
    public void setSize(int age) {
        this.size = age;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public int getSize() {
        return size;
    }
    public String toString(){
        return this.color+", size "+this.size;
    }

    public void print(){
        System.out.println(color+"'s size is "+size+" sm3");
    }
}
