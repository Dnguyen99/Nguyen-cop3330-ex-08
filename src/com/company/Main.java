/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dylan Nguyen
 */

package com.company;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

        System.out.println("How many people? ");
        int people = input.nextInt();
        System.out.println("How many pizzas do you have? ");
        int pizza = input.nextInt();
        System.out.println("How many slices per pizza? ");
        int slices = input.nextInt();
        int total = slices * pizza;
        System.out.println(people+ " people with " +pizza+ " pizzas ("+total+" slices)");

        if (total / people == 1) {
            System.out.println("Each person gets " +total / people+ " pieces of pizza.");
            System.out.println("There are " +(total % people)+ "leftover pieces.");
        }
        else {
            System.out.println("Each person gets " +total / people+ " pieces of pizza.");
            System.out.println("There are " +(total % people)+ " leftover pieces.");
        }
    }
}
