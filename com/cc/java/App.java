package com.cc.java;

public class App {
    
    public static void main(String[] args) {
       Grandparent grandparent=new Grandparent();
        output(grandparent.sayhello());
       
        Parent parent= new Parent();
        output(parent.sayHello());
       
        Child child= new Child();
        output(child.sayHello());
     
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

 

}

