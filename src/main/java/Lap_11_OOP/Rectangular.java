package Lap_11_OOP;

import java.util.Scanner;

public class Rectangular extends Figure {
    private Point pointLeftOn;
    private double length;
    private double width;

    public Rectangular(Point pointLeftOn, double length, double width) {
        this.pointLeftOn = pointLeftOn;
        this.length = length;
        this.width = width;
    }

    public Rectangular() {
    }

    @Override
    public Figure enterFigure(Scanner sc) {
        Point p = new Point();
        System.out.print("Left point x(a,b): ");
        pointLeftOn = p.export(sc.nextLine());
        System.out.print("Length: ");
        length = sc.nextDouble();
        System.out.print("Width: ");
        width = sc.nextDouble();
        return new Rectangular(pointLeftOn, length, width);
    }

    public Point getPointLeftOn() {
        return pointLeftOn;
    }

    public void setPointLeftOn(Point pointLeftOn) {
        this.pointLeftOn = pointLeftOn;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
