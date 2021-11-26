package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String userName;
    public static String pcName = "Ryan";
    public static String[] board = new String[6];

    public static void main(String[] args) {
        user();
        guesses();
    }

    public static void user(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        userName = input.next();
        }

    public static void guesses(){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < board.length - 1; i++) {
            System.out.println("Pick a number 0-5");
            int userNum = input.nextInt();
            int pcNum = random.nextInt(5);
            System.out.println(userNum + " " + pcNum);
            if(board[userNum].contains(userName) || board[userNum].contains(pcName)){
                System.out.println("User, that space is already taken!");
            }else{
                board[userNum] = userName;
            }
            if(board[pcNum].contains(userName) || board[pcNum].contains(pcName)){
                System.out.println("Computer, that space is already taken!");
            }else{
                board[pcNum] = pcName;
            }
            //System.out.println(Arrays.toString(board));
        }
    }
}
