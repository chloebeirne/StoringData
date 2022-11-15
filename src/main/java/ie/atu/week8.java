package ie.atu;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class week8 {
    public static void main(String[] args) throws Exception{

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the filename: ");
        String filename = keyboard.nextLine();


        try
        {
            Scanner inputFile = new Scanner(new File(filename));
            while (inputFile.hasNext()) {
                String str = inputFile.nextLine();
                System.out.println(str);
            }
            inputFile.close();

        } catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
