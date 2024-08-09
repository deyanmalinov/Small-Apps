package com.DPM;

import java.io.File;
import java.io.IOException;

public class ListFiles {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Coding\\Java\\Softuni\\Java Advanced - January 2019\\" +
                "04. Java-Advanced-Fiels-and-Directories-Lab\\04. " +
                "Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";
        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    if (!f.isDirectory()) {
                        System.out.printf("%s: [%s]%n",
                                f.getName(), f.length());
                    }
                }
            }
        }
    }
}