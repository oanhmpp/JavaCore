package Lap_11_OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Circle extends Figure {
    private Point centerPoint;
    private double radius;

    public Circle(ArrayList<Figure> list, Point centerPoint, double radius) {
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    public Circle(Point centerPoint, double radius) {
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    @Override
    public Figure enterFigure(Scanner sc) {
        Point p = new Point();
        System.out.print("Center point x(a,b): ");
        centerPoint = p.export(sc.nextLine());
        System.out.print("Radius: ");
        radius = sc.nextDouble();
        return new Circle(centerPoint, radius);
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
