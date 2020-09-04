package Kniga;

public class Kniga {

    private String name;
    private int pages;

    public Kniga(String n, int a){
        name = n;
        pages = a;
    }
    public Kniga(String n){
        name = n;
        pages = 0;

    }
    public Kniga() {
        name = "Voina i mir";
        pages= 0;
    }
    public void setPages(int age) {
        this.pages = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getPages() {
        return pages;
    }
    public String toString(){
        return this.name+", pages "+this.pages;
    }

    public void print(){
        System.out.println(name+"'s size is "+pages+" pages");
    }
}
