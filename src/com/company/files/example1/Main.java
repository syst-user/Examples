package com.company.files.example1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileName = "files/example1/output.txt";
        FileWriter file = new FileWriter(fileName);
        file.write("test\nvalue\n1-2-3\n");
        file.write("2343");
        file.close();

        FileReader fileReader = new FileReader(fileName);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        fileReader.close();

    }
}
