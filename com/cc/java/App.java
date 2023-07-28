package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Tomcat cat = new Tomcat("Grizabella", "white", 29, true);

        output(cat.getStringAttributes("#name"));
        output(cat.getStringAttributes("#color"));

        output(cat.getAge()); 
        output(cat.getAge());  
        output(cat.getAge());  
        output(cat.getAge());   
        
        output("-------------------------");

        Tomcat cat2 = new Tomcat("Alonzo", "grey", 35, false);

        output(cat2.getStringAttributes("#name"));
        output(cat2.getStringAttributes("#color"));

        output(cat2.getAge()); 

    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}

