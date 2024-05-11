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

    //Funkcja ma zapisywać do pliku
    public static void saveToFile() throws IOException {
        System.out.println("Podaj ściężke do pliku do którego mają zostać zapisane dane:");
        Path filePathUserInput = Path.of(scanner.nextLine());
        System.out.println("Podaj współrzędne hetmana które chcesz zapisać do wskazanego pliku:");
        userInput = scanner.nextLine();
        Files.write(filePathUserInput, userInput.getBytes());
    }

    //Funkcja ma odczytywać z pliku
    public static void readFromFile() throws IOException {
        System.out.println("Podaj ściężke do pliku z którego mają zostać odczytane dane:");
        Path filePathUserInput = Path.of(scanner.nextLine());
        System.out.println("Współrzędne hetmana zapisane w podanym pliku:");
        Files.readAllLines(filePathUserInput);
    }

    //Funkcja ma wstawiać hetmana
    public void wstawHetmana() {}

    //Funkcja ma być tylko zadklerowana
    public void count() {}

    public static void main(String[] args) throws IOException {
        saveToFile();
        readFromFile();
    }



}