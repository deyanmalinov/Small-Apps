package com.DPM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class BacktrakingFindAllPathsInALabyrinth {

    static List<Character> path = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());
        char[][] maze = new char[rows][cols];


        for (int row = 0; row < rows; row++) {
            maze[row] = scan.nextLine().toCharArray();
        }

        findPath(maze, 0, 0, ' ');

        for (char [] ch : maze) {
            System.out.println(Arrays.toString(ch));
        }
    }
    private static void findPath(char[][] maze, int row, int col, char direction){

        if (!isInBounds(maze, row, col)){
            return;
        }
        if (maze[row][col] == 'x'){
            return;
        }
        if (maze[row][col] == '*'){
            return;
        }

        path.add(direction);

        if (maze[row][col] == 'e'){
            printPath();
            return;
        }

        maze[row][col] = 'x';

        findPath(maze, row, col - 1,'L');
        findPath(maze, row + 1, col,'D');
        findPath(maze, row, col + 1,'R');
        findPath(maze, row - 1 , col, 'U');

        maze[row][col] = '-';

        path.remove(path.size() - 1);

    }
    private static void printPath(){
        path.remove(0);
        for (Character character : path) {
            System.out.print(character);
        }
        System.out.println();
    }
    private static boolean isInBounds(char[][] maze, int rows, int cols){
        return rows < maze.length && rows >= 0 && cols < maze[rows].length && cols >= 0;
    }
}