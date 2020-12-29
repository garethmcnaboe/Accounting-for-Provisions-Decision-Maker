package com.garethco;

import java.util.Scanner;

public class Console {
    public static Scanner scanner = new Scanner(System.in);

    public static String readAnswer(String prompt) {
        String answer = "";
        while (!answer.equals("y") && !answer.equals("n")) {
            System.out.print(prompt);
            answer = scanner.next();
            if (answer.equals("y") || answer.equals("n"))
                break;
            System.out.println("Please enter y or n");
        }
        return answer;
    }
}

