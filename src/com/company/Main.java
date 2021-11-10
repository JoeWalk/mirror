package com.company;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> mirror = new ArrayList<>();
        boolean entering = true;
        while (entering == true) {
            System.out.println("Do you want to add another number y/n");
            String response = input.next();
            if (response.equals("y")) {
                int num = input.nextInt();
                mirror.add(num);
            } else {
                entering = false;
            }
        }
        System.out.println("Max mirror is " + maxMirror(mirror));
    }

    public static int maxMirror(ArrayList<Integer> mirror){
        ArrayList<Integer> streak = new ArrayList<>();
        streak.add(mirror.get(0));
        int maxMirror = 0;
        for(int i = 0; i<mirror.size(); i++){
            if (mirror.get(i) == mirror.get(i) + 1){
                streak.add(mirror.get(i + 1));
            }
            else{
                i = mirror.size();
            }
        }
        for (int i=streak.size(); i<mirror.size(); i++){
            int a = 0;
            int b = i;
            if(mirror.get(b) == streak.get(a)){
                maxMirror = maxMirror + 1;
                a = a + 1;
            }
            else{
                b = streak.size();
            }
        }
        return(maxMirror);

    }
}