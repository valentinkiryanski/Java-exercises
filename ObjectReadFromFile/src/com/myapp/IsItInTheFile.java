package com.myapp;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {

            System.out.println(readRecordsFromFile("data.txt"));

    }

    public static ArrayList<Person> readRecordsFromFile(String file){
        ArrayList<Person> people = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                people.add(new Person(name, age));
            }
            System.out.println("Total amount of people read: " + people.size());
        }catch(Exception e){
            System.out.println("Error!");
        }
        return people;
    }
}
