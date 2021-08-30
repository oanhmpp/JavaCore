package Lab_9;

public class Triangle_2 {
    private Coordinates pA;
    private Coordinates pB;
    private Coordinates pC;

    public Triangle_2(Coordinates pointA, Coordinates pointB, Coordinates pointC) {
        this.pA = pointA;
        this.pB = pointB;
        this.pC = pointC;
    }

    public String print() {
        final StringBuffer sb = new StringBuffer("Triangle {\n");
        sb
                .append("  Point A = ").append("(").append(pA.getX()).append(", ").append(pA.getY()).append(")").append("\n")
                .append("  Point B = ").append("(").append(pB.getX()).append(", ").append(pB.getY()).append(")").append("\n")
                .append("  Point C = ").append("(").append(pC.getX()).append(", ").append(pC.getY()).append(")").append("\n")
                .append('}');
        return sb.toString();
    }

    public double perimeterOfTriangle() {
        return pA.distance(pB) + pB.distance(pC) + pC.distance(pA);
    }

    public double areaOfTriangle() {
        double haft = (pA.distance(pB) + pB.distance(pC) + pC.distance(pA))/2;
        return Math.sqrt(haft*(haft-pA.distance(pB))*(haft-pB.distance(pC))*(haft-pC.distance(pA)));
    }

    public static void main(String[] args) {
        Coordinates pA = new Coordinates(1,2);
        Coordinates pB = new Coordinates(4,2);
        Coordinates pC = new Coordinates(5,2);

        Triangle_2 t2 = new Triangle_2(pA,pB,pC);
        System.out.println(t2.print());
    }
}
