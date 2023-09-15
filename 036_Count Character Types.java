import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Coding\\BG_Softuni\\Java Advanced - January 2019" +
                "\\04.1. Java-Advanced-Files-and-Directories-Exercises\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        int vouel = 0;
        int conso = 0;
        int punkt = 0;
        try {
            String line = reader.readLine();
            while (line != null){
                char[] masv =line.toCharArray();
                for (char cha : masv) {
                    if (cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u'){
                        vouel++;
                    }else if (cha == '!' || cha == ',' || cha == '.' || cha == '?'){
                        punkt++;
                    }else if (cha == ' ') {
                        
                    }else   {
                         conso++;
                    }
                }
                line=reader.readLine();
            }
            System.out.printf("Vowels: %d\nConsonants: %d\nPunctuation: %d", vouel,conso,punkt);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}