package org.hometask.corejava;

import java.util.Scanner;

public class Variables_01 {

public static void main(String[] args) {
        
        float daniel, amber, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Daniel has: ");
        daniel = sc.nextFloat();
        
        System.out.println("Amber has: ");
        amber = sc.nextFloat();
        
        sc.close();
        sum = daniel + amber;
        System.out.println("Daniel & Amber has "+sum+" apples together" );
    }
}
