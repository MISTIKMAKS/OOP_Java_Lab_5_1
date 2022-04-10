package Lab5_1;

import java.util.Scanner;
import java.lang.Math;

public class Point {
    private double x;
    private double y;

    public Point()
    {
        x = 0;
        y = 0;
    }

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Point(Point p)
    {
        this.x = p.x;
        this.y = p.y;
    }

    public void SetX(double x)
    {
        this.x = x;
    }

    public void SetY(double y)
    {
        this.y = y;
    }

    public double GetX()
    {
        return this.x;
    }

    public double GetY()
    {
        return this.y;
    }

    //Переміщення точки по осі +>
    public static Point xPlusPoint(Point p, double n)
    {
        p.x += n;
        return p;

    }

    //Переміщення по осі +^
    public static Point yPlusPoint(Point p, double n)
    {
        p.y += n;
        return p;
    }

    //Визначення відстані між точками ->
    public static double distancePoint(Point a, Point b)
    {
        double result = Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
        return result;
    }

    //Операції порівняння точок ==
    public static boolean equalityPoint(Point a, Point b)
    {
        if (a.x == b.x && a.y == b.y)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Операції порівняння точок !=
    public static boolean equalityNotPoint(Point a, Point b)
    {
        if (a.x == b.x && a.y == b.y)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static Point minusOnePoint(Point p)
    {
        p.x--;
        p.y--;
        return p;
    }

    public static Point plusOnePoint(Point p)
    {
        p.x++;
        p.y++;
        return p;
    }

    public static Point oneMinusPoint(Point p)
    {
        --p.x;
        --p.y;
        return p;
    }

    public static Point onePlusPoint(Point p)
    {
        ++p.x;
        ++p.y;
        return p;
    }

    public String ToString()
    {
        return " x: " + this.x + "\n y: " + this.y;
    }

}