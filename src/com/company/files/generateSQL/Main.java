package com.company.files.generateSQL;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private static final String START_ID = "9163623133413688647";

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("files/generateSQL/output.txt");
        BigInteger newId = new BigInteger(START_ID);

        for (int i = 1; i <= 82; i++) {
            System.out.println("step: " + i);
            FileReader fileReader = new FileReader("files/generateSQL/input.txt");
            Scanner scanner = new Scanner(fileReader);
            newId = newId.add(new BigInteger("1"));
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                fileWriter.write(str.replace(START_ID, newId.toString()) + "\n");
            }
            fileReader.close();
            fileWriter.write("--------------------\n");
        }
        fileWriter.close();
    }
}
