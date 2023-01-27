package DPM;

import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String [] line = scan.nextLine().split(" ");
            Map <String, Integer> someMap = new LinkedHashMap<>();
            for (String s : line) {
                String word = s.toLowerCase();
                if (someMap.containsKey(word)){
                    someMap.put(word, someMap.get(word)+1);
                }else {
                    someMap.put(word, 1);
                }
            }
            List<String> res = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : someMap.entrySet()) {
                if (entry.getValue() % 2 == 1){
                    res.add(entry.getKey());
                }
            }
//            System.out.println(String.join(", ",res));
            System.out.println(res.toString().replaceAll("\\[|\\]", ""));
        }
}