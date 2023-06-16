package com.dedalus;
public class Parent {
    private String child1;
    private String child2;

    public Parent() {
        child1 = "sun";
        child2 = "moon";
    }

    public void relation1() {
        System.out.println("my name is India");
    }

    public void relation2() {
        System.out.println("my name is USA");
    }

    public static void main(String[] args) {
        Parent children1 = new Parent();
        Parent children2 = new Parent();

        System.out.println(children1.child1);  
        System.out.println(children1.child2);  
        children1.relation1(); 
        children1.relation2(); 

       
        System.out.println(children2.child1); 
        System.out.println(children2.child2);  
        children2.relation1();  
        children2.relation2();  
    }
}
