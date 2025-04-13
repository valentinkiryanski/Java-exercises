package com.myapp;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> fileText = new ArrayList<>();
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        try(Scanner fileReader = new Scanner(Paths.get(fileName))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                fileText.add(line);
            }
        System.out.println("Search for:");
        String search = scanner.nextLine();



            if(fileText.contains(search)){
                System.out.println("Found!");
            }else{
                System.out.println("Not found.");
            }
        }catch(Exception e){
            System.out.println("Reading the file " + fileName + " failed.");
        }


    }
}
