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

        int maxCap = Integer.parseInt(scan.nextLine());
        String line = scan.nextLine();

        while (!line.equals("end")){

            String[] comand = line.split(" ");

            if (comand.length == 2){
                int secCom = Integer.parseInt(comand[1]);
                listArr.add(secCom);
            }else {
                int onlyNum = Integer.parseInt(comand[0]);

                for (int i = 0; i < listArr.size(); i++) {
                    int vagNum = listArr.get(i);
                    if (vagNum + onlyNum<= maxCap){
                        listArr.set(i, vagNum+onlyNum);
                        break;
                    }

                }
            }
            line= scan.nextLine();
        }
        System.out.println(listArr.toString().replaceAll("[\\[\\],]", ""));
    }
}