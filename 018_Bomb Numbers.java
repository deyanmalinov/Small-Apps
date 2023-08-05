package com.DPM;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String[] strMas = scan.nextLine().split(" ");
            List<Integer> listArr = Arrays.stream(strMas)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            String [] secCom = scan.nextLine().split("\\s+");
            int bomb = Integer.parseInt(secCom[0]);
            int power = Integer.parseInt(secCom[1]);

            while (listArr.contains(bomb)){
                int indexBomb = listArr.indexOf(bomb);
                int begin = indexBomb-power;
                begin = Math.max(0, begin);

                for (int i = begin; i < indexBomb; i++) {

                    listArr.remove(begin);


                }
                indexBomb = listArr.indexOf(bomb);
                int end = Math.min(indexBomb+power, listArr.size()-1);
                for (int i = indexBomb; i <= end; i++) {
                    listArr.remove(indexBomb);

                }
            }
            int sum =0;

            for (Integer integer : listArr) {
                sum += integer;
            }
            System.out.println(sum);



        }
}