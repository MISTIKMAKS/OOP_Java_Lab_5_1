package Lab5_1;

import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("A_x: ");
        double x_a = scan.nextDouble();
        System.out.print("A_y: ");
        double y_a = scan.nextDouble();
        Point a = new Point(x_a, y_a);
        String result_a = a.ToString();
        System.out.println("A: ");
        System.out.println(result_a);

        System.out.print("B_x: ");
        double x_b = scan.nextDouble();
        System.out.print("B_y: ");
        double y_b = scan.nextDouble();
        Point b = new Point(x_b, y_b);
        String result_b = b.ToString();
        System.out.println("B: ");
        System.out.println(result_b);

        System.out.print("n: ");
        double n = scan.nextDouble();
        System.out.println(" n: " + n);
        System.out.println("---------------");

        a = Point.xPlusPoint(a, n);
        result_a = a.ToString();
        System.out.println("A +> n: ");
        System.out.println(result_a);
        System.out.println("---------------");

        a = Point.yPlusPoint(a, n);
        result_a = a.ToString();
        System.out.println("A +^ n: ");
        System.out.println(result_a);
        System.out.println("---------------");

        double result = Point.distancePoint(a, b);
        System.out.println("A -> B: ");
        System.out.println(result);
        System.out.println("---------------");

        boolean boolean_is = Point.equalityPoint(a, b);
        System.out.println("A == B: ");
        System.out.println(boolean_is);
        System.out.println("---------------");

        boolean boolean_not = Point.equalityNotPoint(a, b);
        System.out.println("A != B: ");
        System.out.println(boolean_not);
        System.out.println("---------------");

        Point.plusOnePoint(a);
        result_a = a.ToString();
        System.out.println("A++: ");
        System.out.println(result_a);
        System.out.println("---------------");
        Point.minusOnePoint(a);
        result_a = a.ToString();
        System.out.println("A--: ");
        System.out.println(result_a);
        System.out.println("---------------");
        Point.onePlusPoint(b);
        result_b = b.ToString();
        System.out.println("++B: ");
        System.out.println(result_b);
        System.out.println("---------------");
        Point.oneMinusPoint(b);
        result_b = b.ToString();
        System.out.println("--B: ");
        System.out.println(result_b);

	}

}
