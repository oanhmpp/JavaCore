package Lap_11_OOP;

import java.util.Scanner;

public class Triangle extends Figure {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    @Override
    public Figure enterFigure(Scanner sc) {
        Point p = new Point();
        System.out.print("Point A (x,y): ");
        a = p.export(sc.nextLine());
        System.out.print("Point B (x,y): ");
        b = p.export(sc.nextLine());
        System.out.print("Point C (x,y): ");
        c = p.export(sc.nextLine());
        return new Triangle(a,b,c);
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }
}
