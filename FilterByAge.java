package com.DPM;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class FilterByAge {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        LinkedHashMap<String, Integer> people=new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String[] input =scan.nextLine().split(", ");
            people.put(input[0], Integer.parseInt(input[1]));
        }

        String condition = scan.nextLine();

        int age = Integer.parseInt(scan.nextLine());

        String format = scan.nextLine();

        Predicate<Integer> tester = createTester(condition, age);

        Consumer<Map.Entry<String, Integer>> printer =
                createPrinter(format);
        printFilteredStudent(people, tester, printer);
    }
static Consumer<Map.Entry<String, Integer>> createPrinter(String format) {
        Consumer<Map.Entry<String, Integer>> printer = null;
        switch (format) {
            case "name age":
                printer = person -> System.out.printf("%s - %d%n",
                        person.getKey(), person.getValue());
                break;
            case "age":
                printer = person -> System.out.printf("%d%n", person.getValue());
            case "name":
                printer = person -> System.out.printf("%s%n", person.getKey());
        }
        return printer;
    }
static Predicate<Integer> createTester(String condition, Integer age) {
        Predicate<Integer> tester = null;
        switch (condition) {
            case "younger":
                tester = x -> x <= age;
                break;
            case "older":
                return  x-> x >=  age;
            default:
                return null;
        }
        return tester;
    }
static void printFilteredStudent(
            LinkedHashMap<String, Integer> people,
            Predicate<Integer> tester,
            Consumer<Map.Entry<String, Integer>> printer) {
        for (Map.Entry<String, Integer> person : people.entrySet()) {
            if (tester.test(people.get(person.getKey())))
                printer.accept(person);
        }
    }
}