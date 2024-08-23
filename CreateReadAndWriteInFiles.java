package com.DPM;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class CreateReadAndWriteInFiles {
        public static void main(String[] args) throws IOException {

                File file = new File(FILE_PATH);

                BufferedReader reader = new BufferedReader(new FileReader(file));

                String line;

                while ((line = reader.readLine()) != null){
                        System.out.println(line);
                }
//                while (true){
//                        String line = reader.readLine();
//                        if (line == null){
//                                break;
//                        }
//
//                        System.out.println(line);
//              }

        }
        private static final String FILE_PATH =
                "D://Coding/Java/Softuni/Java Fundamentals  " +
                "2016/3. Java-Streams/users.txt";
}