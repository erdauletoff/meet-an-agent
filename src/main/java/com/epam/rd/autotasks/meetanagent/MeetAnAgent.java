package com.epam.rd.autotasks.meetanagent;
import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println((in.nextInt() == PASSWORD) ? "Hello, Agent" : "Access denied");
    }
}
