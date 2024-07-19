// Q5. Write a Java program to calculate the area of a circle and the simple interest. Take necessary inputs
// from the user.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int p, rt, t;
        double r, aoc, si;

        System.out.print("Enter the radius of the circle: ");
        Scanner d = new Scanner(System.in);
        r = d.nextDouble();
        aoc = 3.1415 * r * r;
        System.out.println("Area of Circle: " + aoc);
        System.out.print("Enter principal amount: ");
        p = d.nextInt();

        System.out.print("Enter rate of interest: ");
        rt = d.nextInt();

        System.out.print("Enter time (in years): ");
        t = d.nextInt();

        si = (p * rt * t) / 100;
        System.out.print("Simple Interest: " + si);
    }
}

// Enter the radius of the circle: 3.5
// Area of Circle: 38.484512
// Enter principal amount: 1000
// Enter rate of interest: 5
// Enter time (in years): 2
// Simple Interest: 100.0
