package com.vodafone.assignments;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        double valueA, valueB, result;
        char operator;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        valueA = input.nextDouble();

        System.out.println("Enter the second number: ");
        valueB = input.nextDouble();

        System.out.println("Enter one of the operators: +, -, * , /: ");
        operator = input.next().charAt(0);

        switch (operator){

            // Addition
            case '+':
                result = valueA + valueB;
                System.out.println( valueA + " + " + valueB + " = "  + result);
                break;

            // Subtraction
            case '-':
                result = valueA - valueB;
                System.out.println( valueA + " - " + valueB + " = "  + result);
                break;

            // Multiplication
            case '*':
                result = valueA * valueB;
                System.out.println( valueA + " * " + valueB + " = "  + result);
                break;

            // Division
            case '/':
                result = valueA / valueB;
                System.out.println( valueA + " / " + valueB + " = "  + result);
                break;

            default:
                System.out.println("You need to choose of the four operators: +,-,*,/");
                break;
        }

    }

}

/*
DESCRIPTION

Project objective:
As a developer, write a program to create an arithmetic calculator.

Background of the problem statement:
As a developer, write a Java code to create a calculator to perform the four basic arithmetic operations
(addition, subtraction, multiplication, and division).

You must use the following:
Eclipse/IntelliJ: An IDE to code for the application
Java: A programming language
Git: To connect and push files from the local system to GitHub
GitHub: To store the application code and track its versions
Core Java concepts: Variables, data types, operators, type casting, control statements, class, objects, access specifiers, and core keywords like final, this, and static

Following requirements should be met:
The versions of the code should be tracked on GitHub repositories.
The calculator should work properly.

 */
