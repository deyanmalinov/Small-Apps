package com.DPM;
import java.io.*;
public class SumBytesWriteToFile {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Coding\\BG_Softuni\\Java Advanced - January 2019" +
                "\\04.1. Java-Advanced-Files-and-Directories-Exercises\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String output = "D:\\Coding\\BG_Softuni\\Java Advanced - January 2019" +
                "\\04.1. Java-Advanced-Files-and-Directories-Exercises\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        PrintWriter writer = new PrintWriter(new FileWriter(output));
        try {
            String line = reader.readLine();
            int sum = 0;
            while (line != null){
                for (char chars : line.toCharArray()) {
                    sum+=chars;
                }
                line=reader.readLine();
            }
            writer.write(sum+"");
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.close();
    }
}