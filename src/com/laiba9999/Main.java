package com.laiba9999;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("\nHello and welcome to Laiba's FizzBuzz.\n " +
                "The rules are simple:" +
                " \n if you input a number divisible by 3 the output will be Buzz" +
                "\n if you input a number divisible by 5 the output will be Fizz" +
                "\n if you input a number divisible by 3 & 5 the outout will be FizzBuzz " +
                "\n choose a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
            if (number % 3 == 0 && number % 5 ==0)
        System.out.println("FizzBuzz");
        else if (number % 3 ==0)
        System.out.println("Buzz");
        else if (number % 5 ==0)
        System.out.println("Fizz");
        else
        System.out.println("try again");


    }
}
