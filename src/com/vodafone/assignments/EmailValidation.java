package com.vodafone.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class EmailValidation {

    public static void main(String[] args) {

        //Scanner to get user input
        Scanner emailInput = new Scanner(System.in);

        //Ask user for email input
        System.out.println("Please enter the email address you want to validate: ");
        String email = emailInput.next();

        // Array with emails to validate from
        String[] EmailsToCheck  = {
                    "catia.test@simplelearn.com",
                    "Catia123@simplelearn.com",
                    "Catia@simplelearn.com",
                    "catia_test_123@simplelearn.com"
        };

        if(!Arrays.asList(EmailsToCheck).contains(email)){
            System.out.println("The email: " + email + " is not part of the list.");
        }
        else{
            System.out.println("The email: " + email + " is part of the email list!");
        }

    }
}


//        Validation of an Email ID - Project objective:
//        As a developer, write a program to search a string entered by a user from the array of strings.
//
//        Background of the problem statement:
//        You have an array of email IDs of employees. As a programmer, write a program to search the email ID
//        entered by a user.
//
//        You must use the following:
//        Eclipse/IntelliJ: An IDE to code the application
//        Java: A programming language
//        Git: To connect and push files from the local system to GitHub
//        GitHub: To store the application code and track its versions
//        Core Java concepts: Methods, collections, and strings
//
//        Following requirements should be met:
//        The versions of the code should be tracked on GitHub repositories
//        The code should be able to search the required string from the array of strings
//