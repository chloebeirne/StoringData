package ie.atu;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class week8 {
    public static void main(String[] args){

        try
        {
            PrintWriter myWriter = new PrintWriter(new FileWriter("names.txt", true));

            myWriter.println("Add another");
            myWriter.close();
        } catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
