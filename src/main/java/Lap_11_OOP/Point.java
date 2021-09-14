package Lap_11_OOP;

public class Point extends Figure{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(){}
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point export (String point){
        try {
            String[] s = point.split(",");
            x = Integer.parseInt(s[0]);
            y = Integer.parseInt(s[1]);
        }catch (Exception ex){
            System.out.println("You must enter true format !!");
        }
        return new Point(x,y);
    }
}
