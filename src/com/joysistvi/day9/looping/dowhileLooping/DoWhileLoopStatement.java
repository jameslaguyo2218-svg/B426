package com.joysistvi.day9.looping.dowhileLooping;

import java.util.Scanner;

        public class DoWhileLoopStatement {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                boolean isRunning = true;

                while (isRunning) {
                    System.out.println("* Load Reg *");
                    System.out.println(" [1] Test Only!");
                    System.out.println(" [2] Call Only!");
                    System.out.println(" [3] Call N Text!");
                    System.out.println( "[0] Exit");
                    System.out.println("Enter your choice: ");
                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1 -> System.out.println("You are now subscrbed to Text Only\n");
                        case 2 -> System.out.println("You are now subscrbed to Call Only\n");
                        case 3 -> System.out.println("You are now subscrbed to Call N Text Only\n");
                        case 0 -> {
                            System.out.println("Exiting...");
                            isRunning = false;
                        }
                        default -> System.out.println("Invalid Input! Please choose from 1-3\n");
                    }
                }
            }
        }
