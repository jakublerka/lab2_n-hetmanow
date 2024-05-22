package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public int[][] szachownica = new int[8][8];
    static Scanner scanner = new Scanner(System.in);
    //private String filePathUserInput;

    public static String userInput;
    public static Path filePathUserInput;
    public static String output;

    public static void readPathToSave() {
        System.out.println("Podaj ściężke do pliku do którego mają zostać zapisane/odczytane dane:");
        filePathUserInput = Path.of(scanner.nextLine());
    }

    public static void inputToSaveToFile() {
        System.out.println("Podaj współrzędne hetmana które chcesz zapisać do wskazanego pliku:");
        userInput = scanner.nextLine();
    }

    //Funkcja ma zapisywać do pliku
    public static void saveToFile(Path filePathUserInput, String userInput) throws IOException {
        //System.out.println("Podaj ściężke do pliku do którego mają zostać zapisane dane:");
        //filePathUserInput = Path.of(scanner.nextLine());
        Files.write(filePathUserInput, userInput.getBytes());
    }

    //Funkcja ma odczytywać z pliku
    public static void readFromFile(Path filePathUserInput) throws IOException {
        System.out.println("Podaj ściężke do pliku z którego mają zostać odczytane dane:");
        //filePathUserInput = Path.of(scanner.nextLine());
        System.out.println("Współrzędne hetmana zapisane w podanym pliku:");
        output = Files.readAllLines(filePathUserInput).toString();
        System.out.println(output);
    }

    //Funkcja ma wstawiać hetmana
    public static void wstawHetmana() {}

    //Funkcja ma być tylko zadklerowana
    public static int count() {
        return 0;
    }

    public static void main(String[] args) throws IOException {
        readPathToSave();
        inputToSaveToFile();
        saveToFile(filePathUserInput, userInput);
        readPathToSave();
        readFromFile(filePathUserInput);
        count();
    }



}