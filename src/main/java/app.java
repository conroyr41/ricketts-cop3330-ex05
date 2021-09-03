/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number!");

        Scanner scan = new Scanner(System.in);
        String input1 = scan.next();
        int a = Integer.parseInt(input1);

        System.out.println("Enter another number!");

        scan = new Scanner(System.in);
        String input2 = scan.next();
        int b = Integer.parseInt(input2);

        System.out.println(String.format("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d", a, b, a+b, a, b, a-b, a, b, a*b, a, b, a/b));
    }
}
