package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("number 1:");
        int x1=input.nextInt();
        System.out.println("number 2:");
        int x2=input.nextInt();
        if (x1 % x2==0) System.out.println(x1+"/"+x2);
        else System.out.println(x1+"не"+x2);
    }
}