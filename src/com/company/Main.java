package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = input.nextDouble();

        System.out.println("Enter the height: ");
        double height = input.nextDouble();
        Rectangle sc = new Rectangle(width, height);
//        Rectangle rectangle2 = new Rectangle(5, 10);
        System.out.println(sc.display());
    }
}
