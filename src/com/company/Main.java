package com.company;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> taloni = new ArrayList<>();
        ArrayList<Window> windows = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            windows.add(new Window());
        }
        int answer, visitorsAmount=0;
        String t = "lol you got an error";
        while (true) {
            visitorsAmount++;
            if (Integer.parseInt(new SimpleDateFormat("HH").format(new Timestamp(System.currentTimeMillis())))<=12) {
                System.out.println("Hello! What would you like to do? 1-... 2-... 3-... 4-...");
                answer = scanner.nextInt();
                switch (answer) {
                    case 1 -> t = "a "+visitorsAmount;
                    case 2 -> t = "b "+visitorsAmount;
                    case 3 -> t = "c "+visitorsAmount;
                    case 4 -> t = "d "+visitorsAmount;
                    default -> visitorsAmount--;
                }
                taloni.add(taloni.size(),t);
                for (Window w:windows) {
                    if (w.ready()&&!taloni.isEmpty()) {
                            w.setTaloonNow(taloni.remove(0));
                    }
                }
                System.out.print("{");
                for (Window w:windows) {
                    System.out.print(w.toString()+", ");
                }
                System.out.println("}");
            }
        }
    }
}
