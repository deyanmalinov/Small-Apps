import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SubtitleToLowerCase {
    public static void main(String[] args) throws IOException {
        Scanner scanner1 = new Scanner(System.in);
        //TODO 1. Ask question "type path of the file"
        System.out.println("Type the path of the file:");
        String path = scanner1.nextLine();
        //TODO 2. ask where to write the file
        System.out.println("Type the path of the NEW file:");
        String pathNew = scanner1.nextLine();

        Scanner scanner = new Scanner(new File(path));
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathNew));

        //TODO 3. file go true upper case to lower case

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            writer.write(line.toLowerCase());
            writer.newLine();
        }
        scanner.close();
        writer.close();


    }
}
