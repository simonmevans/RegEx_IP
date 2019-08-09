package com.company;

import java.util.*;

public class Main {
    public static void printBar() {
        for (int i = 0; i < 90; i++) {
            System.out.print('-');
        }
        System.out.print('\n');
    }

    public static void main(String[] args) {
        String go = "y";
        Scanner input = new Scanner(System.in);
        String programDes = "IP address is a string in the form A.B.C.D, where the value of A, B, C, and D may range" +
                "\nfrom 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater" +
                "\nthan 3.";
        printBar();
        System.out.println(programDes);
        printBar();
        System.out.println("Enter an IP address and the program will check if it's valid");
        go = input.next();
        IP computer = new IP (go);
    }
}
