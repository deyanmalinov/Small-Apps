package com.DPM;
import java.util.*;
public class Songs1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int lines = Integer.parseInt(scan.nextLine());
            List<Songs2> songs = new ArrayList<>();
            for (int i = 0; i < lines; i++) {
                String [] line = scan.nextLine().split("_");

                String type, name, time;
                type = line[0];
                name = line[1];
                time = line[2];

                Songs2 song = new Songs2();

                song.setTypeList(type);
                song.setName(name);
                song.setTime(time);

                songs.add(song);
            }
            String typeList = scan.nextLine();
            if (typeList.equals("all")){
                for (Songs2 song : songs) {
                    System.out.println(song.getName());
                }
            }else {
                for (Songs2 song : songs) {
                    if (song.getTypeList().equals(typeList)){
                        System.out.println(song.getName());
                    }

                }
            }
        }
}