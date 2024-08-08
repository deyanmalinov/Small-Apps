package com.DPM;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class RoboticsTimeFormat {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String [] line = scan.nextLine().split(";");

        String [] robots = new String[line.length];

        int [] procTime = new int[line.length];

        int [] workTime = new int[line.length];

        for (int i = 0; i < line.length; i++) {
            String[] temp = line[i].split("-");
            robots[i] = temp[0];
            procTime[i] = Integer.parseInt(temp[1]);
        }
        String startTime = scan.nextLine();

        Deque<String> products = new ArrayDeque<>();

        String end = scan.nextLine();

        while (!end.equals("End")){
            products.offer(end);
            end = scan.nextLine();
        }

        String [] timeData = startTime.split(":");

        int hours = Integer.parseInt(timeData[0]);

        int min = Integer.parseInt(timeData[1]);

        int sec = Integer.parseInt(timeData[2]);

        LocalTime time = LocalTime.of(hours, min,sec);

        while (!products.isEmpty()) {
            time = time.plusSeconds(1);
            String prod = products.poll();
            boolean isAssigned = false;
            for (int i = 0; i < robots.length; i++) {
                if (workTime[i] == 0 && !isAssigned) {
                    workTime[i] = procTime[i];
                    isAssigned = true;
                    printRobotData(robots[i], prod, time);
                }
                if (workTime[i] > 0) {
                    workTime[i]--;
                }
            }
            if (!isAssigned){
                products.offer(prod);
            }
        }
    }
    private static void printRobotData(String robot, String prod, LocalTime time) {
        DateTimeFormatter form = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(robot + " - "+ prod + " [" + time.format(form) +"]");
    }
}