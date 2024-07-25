package org.example.entity;

public class User {
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public void process() {
        System.out.println("Incepem procesarea ...");
        System.out.println("Un pas de main ...");
        System.out.println("Un alt pas de main ...");

        int b=20*20;
        int c=90;
        System.out.println(b+c);
        int a=11;
        System.out.println(a);
        System.out.println("Finalizam procesarea ...");
    }
}
