package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static void main() throws IOException {

        Scanner scn = new Scanner(System.in);
        System.out.println("Напишите ваше имя: ");
        String user = scn.nextLine();

        File file = new File("C:\\Users\\Elite X2\\Downloads\\users.txt");

        FileWriter writer = new FileWriter(file, true);
        writer.write(user + "\n");
        writer.close();
    }
}
