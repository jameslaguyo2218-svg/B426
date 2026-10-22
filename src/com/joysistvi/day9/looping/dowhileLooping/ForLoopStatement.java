package com.joysistvi.day9.looping.dowhileLooping;

public class ForLoopStatement {
    public static void main(String[] args) {

        String name = "James Laguyo";

        for (int i = 1; i <= 20; i ++) {
           // System.out.println(i + "." + name);

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
