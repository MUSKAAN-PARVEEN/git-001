package com.hcltech;

public class App {

    public static void main(String[] args) {
        Greeting     greeting = new Greeting();
        final String message  = greeting.getMessage();
        System.out.println(message);
        final String anotherMessage = greeting.getAnotherMessage();
        System.out.println(anotherMessage);
        final String specialMessage = greeting.getSpecialMessage();
        System.out.println(specialMessage);
    }
}
