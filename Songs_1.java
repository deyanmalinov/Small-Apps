package com.DPM;
import java.util.*;
public class Songs_1 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int lines = Integer.parseInt(scan.nextLine());

            List<Songs_2> songs = new ArrayList<>();

            for (int i = 0; i < lines; i++) {
                String [] line = scan.nextLine().split("_");
                String type, name, time;
                type = line[0];
                name = line[1];
                time = line[2];
                Songs_2 song = new Songs_2();
                song.setTypeList(type);
                song.setName(name);
                song.setTime(time);
                songs.add(song);
            }
            String typeList = scan.nextLine();
            if (typeList.equals("all")){
                for (Songs_2 song : songs) {
                    System.out.println(song.getName());
                }
            }else {
                for (Songs_2 song : songs) {
                    if (song.getTypeList().equals(typeList)){
                        System.out.println(song.getName());
                    }
                }
            }
        }
}