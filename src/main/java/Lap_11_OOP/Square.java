package Lap_11_OOP;

import java.util.Scanner;

public class Square extends Figure {
    private Point pointLeftTop;
    private double width;

    public Square(Point pointLeftTop, double width) {
        this.pointLeftTop = pointLeftTop;
        this.width = width;
    }

    public Square() {
    }

    @Override
    public Figure enterFigure(Scanner sc) {
        Point p = new Point();
        System.out.print("Left point x(a,b): ");
        pointLeftTop = p.export(sc.nextLine());
        System.out.print("Width: ");
        width = sc.nextDouble();
        return new Square(pointLeftTop, width);
    }

    public Point getPointLeftTop() {
        return pointLeftTop;
    }

    public void setPointLeftTop(Point pointLeftTop) {
        this.pointLeftTop = pointLeftTop;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
