package ua.paik.hw12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter text. To finish, enter 'end':");

            StringBuilder csvContent = new StringBuilder();
            String line;

            while (!(line = scanner.nextLine()).equalsIgnoreCase("end")) {
                if (line.equalsIgnoreCase("next")) {
                    csvContent.append("\n");
                } else {
                    csvContent.append(line).append(", ");
                }
            }

            if (csvContent.length() >= 2) {
                csvContent.setLength(csvContent.length() - 2);
            }


            try (FileWriter fileWriter = new FileWriter("output.csv")) {
                fileWriter.write(csvContent.toString());
                System.out.println("CSV file created: output.csv");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

