package com.company;

import java.util.ArrayList;

public class Compute {
    ArrayList<Talon> talonsNow = new ArrayList();
//    ArrayList<Talon> talonsGoneMissing = new ArrayList();
//    ArrayList<Talon> talonsStolen = new ArrayList();
    ArrayList<Talon> talonsGone = new ArrayList();
    ArrayList<Talon> queue = new ArrayList();
    ArrayList<Window> windows = new ArrayList();
    static ArrayList<Integer> speeds = new ArrayList();
    public static void printTable(){}
    public static void updateStates(){}
    public static int calc() {
        int s = 0;
        for (int i = 0; i < speeds.size(); i++) {
            s+=speeds.get(i);
        }
        return s;
    }
    public static int averageSp(){return calc()/speeds.size();}
}
