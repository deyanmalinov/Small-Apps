package DPM;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> goods = new LinkedHashMap<>();
        String line = "";

        while (!"stop".equals(line = scan.nextLine())){
            String metal = line;
            int amaunt = Integer.parseInt(scan.nextLine());

            if (goods.containsKey(line)){
                goods.put(metal, goods.get(metal)+amaunt);
            }else {
                goods.put(metal, amaunt);
            }
        }
//        for (Map.Entry<String, Integer> entry : goods.entrySet()) {
//            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
//        }
        /////////////////////////////////////////
//        goods.entrySet().forEach(el -> {
//            System.out.printf("%s -> %d\n", el.getKey(), el.getValue());
//        });
        /////////////////////////////////////////
        goods.forEach((key, value ) -> System.out.printf("%s -> %d\n", key, value));
    }
}