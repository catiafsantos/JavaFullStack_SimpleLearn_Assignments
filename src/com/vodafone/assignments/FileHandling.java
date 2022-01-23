package com.vodafone.assignments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;

public class FileHandling {

    static void createFile() throws IOException{
        // Create new file
        File file = new File("/Users/catiasantos/Documents/Tests/fileHandlingAssignmentFile.txt");

        try{
            file.createNewFile();
            System.out.println("The File was created using FileClass and the createFile method.");
        } catch (FileAlreadyExistsException e) {
            System.out.println("The mentioned already exists in this directory.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write info on the created file
        FileWriter writer = new FileWriter(file);
        writer.write("Hello, this is me writing on the file using the createFile Method!");
        writer.close();
    }

     static void appendFile() throws IOException{
        String content = "\nThis line was added using appendFile method.";
        // Append information to the existing file
        try {
            Files.write(Paths.get("/Users/catiasantos/Documents/Tests/fileHandlingAssignmentFile.txt"), content.getBytes(), StandardOpenOption.APPEND);
        } catch (NoSuchFileException e) {
            System.out.println("The mentioned file was not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void deleteFile() throws IOException {
        try {
            Files.delete(Paths.get("/Users/catiasantos/Documents/Tests/fileHandlingAssignmentFile.txt"));
        }  catch (NoSuchFileException e) {
            System.out.println("The mentioned file was not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readFile() throws IOException {
        try {
            System.out.println(Files.readAllLines(Paths.get("/Users/catiasantos/Documents/Tests/fileHandlingAssignmentFile.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The file was deleted successfully using the deleteFile method.");
    }



    public static void main(String[] args) throws IOException {

        createFile();
        appendFile();
        readFile();
        deleteFile();
    }
}

//      File Handling  - Project Objective:
//      As a developer, write a program to read, write, and append to a file.

//      Background of the problem statement:
//      As a developer, write a Java code to read, write, and append to a file.

//      You must use the following:
//      Eclipse/IntelliJ: An IDE to code for the application.
//      Java: A programming language.
//      Git: To connect and push files from the local system to GitHub
//      GitHub: To store the application code and track its versions.
//
//      Following requirements should be met:
//      The versions of the code should be tracked on GitHub repositories.
//      The code should work properly.