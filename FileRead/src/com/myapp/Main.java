
package com.myapp;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            ArrayList<String> myArray = new ArrayList<>();

           System.out.println("Which file should have its contents printed?");
           String fileName = scanner.nextLine();
           try(Scanner scanner1 = new Scanner(Paths.get(fileName))){
               while(scanner1.hasNextLine()){
                   String line = scanner1.nextLine();
                   myArray.add(line);               }
           }catch(Exception e){
               System.out.println("Error:" + e.getMessage());
           }

           printArray(myArray);




    }
    public static void printArray(ArrayList<String> my){
        for(String el : my){
            System.out.println(el);
        }
    }
}
