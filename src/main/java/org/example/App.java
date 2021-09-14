package org.example;

import java.util.Objects;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Tyler Coleman
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Is the car silent when you turn the key? ");
        String answer = in.nextLine();
        if (Objects.equals(answer, "y")){
            System.out.println("Are the battery terminals corroded? ");
            answer = in.nextLine();
            if (Objects.equals(answer, "y")){
                System.out.println("Clean terminals and try starting again.");
                System.exit(0);
            }
            else {
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        }
        else {
            System.out.println("Does the car make a slicking noise? ");
            answer = in.nextLine();
            if (Objects.equals(answer, "y")){
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else {
                System.out.println("Does the car crank up but fail to start? ");
                answer = in.nextLine();
                if (Objects.equals(answer, "y")){
                    System.out.println("Check spark plug connection.");
                    System.exit(0);
                }
                else {
                    System.out.println("Does the engine start and then die? ");
                    answer = in.nextLine();
                    if (Objects.equals(answer, "y")){
                        System.out.println("Does your car have fuel injection? ");
                        answer = in.nextLine();
                        if (Objects.equals(answer, "y")){
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else {
                        System.out.println("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
