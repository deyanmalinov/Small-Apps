package DPM;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String string = scan.nextLine();
            String regex = "(^|(?<=\\s))-?\\d+(\\.\\d+)?($|(?=\\s))";
            Pattern pattern = Pattern.compile(regex);
            Matcher line = pattern.matcher(string);
            List <String> nums = new LinkedList<>();

            while (line.find()) {
                nums.add(line.group());
            }
            System.out.println(String.join(" ",nums));
        }
}