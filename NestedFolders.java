package com.DPM;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
public class NestedFolders {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Coding\\Java\\Softuni\\Java Advanced - January 2019\\" +
                "04. Java-Advanced-Fiels-and-Directories-Lab\\04. " +
                "Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File root = new File(path);

        Deque<File> dirs = new ArrayDeque<>();

        dirs.offer(root);

        int count = 0;

        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            for (File nestedFile : nestedFiles)
                if (nestedFile.isDirectory())
                    dirs.offer(nestedFile);
            count++;
            System.out.println(current.getName());
        }
        System.out.println(count + " folders");
    }
}