import java.io.*;
public class Main {
    public static void main(String[] args) {
        String path = "D:\\Coding\\BG_Softuni\\Java Advanced - January 2019" +
                "\\04.1. Java-Advanced-Files-and-Directories-Exercises\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String output = "D:\\Coding\\BG_Softuni\\Java Advanced - January 2019" +
                "\\04.1. Java-Advanced-Files-and-Directories-Exercises\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        try {
           BufferedReader reader = new BufferedReader(new FileReader(path));
           PrintWriter writer = new PrintWriter(new FileWriter(output));
            String line = reader.readLine();
            while (line != null){
                int sum = 0;
                for (char chars : line.toCharArray()) {
                    sum+=chars;
                }
                System.out.println(sum);
                line=reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}