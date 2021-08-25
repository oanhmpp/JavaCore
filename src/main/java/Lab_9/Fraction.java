package Lab_9;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
    }

    /**
     * Nhập/Xuất phân số
     */
    public void print() {
        if (denominator == 0) {
            System.out.println("Invalid !!! (Denominator must be greater than 0)");
        }
        if (denominator == 1)
            System.out.println("Fraction by format a/b: " + numerator);
        else
            System.out.println("Fraction by format a/b: " + numerator + "/" + denominator);
    }

    /**
     * Tìm ước chung lớn nhất
     */
    public int findUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    /**
     * Rút gọn phân số
     */
    public void reduceFraction() {
        int i = findUSCLN(numerator, denominator);
        numerator = numerator / i;
        denominator = denominator / i;
    }

    /**
     * Tính tổng, hiệu, tích, thương hai phân số
     */
    public Fraction sumFraction(Fraction f1, Fraction f2) {
        int a = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int b = f1.denominator * f2.denominator;
        Fraction result = new Fraction(a, b);
        result.reduceFraction();
        return result;
    }

    public Fraction subFraction(Fraction f1, Fraction f2) {
        int a = f1.numerator * f2.denominator - f2.numerator * f1.denominator;
        int b = f1.denominator * f2.denominator;
        Fraction result = new Fraction(a, b);
        result.reduceFraction();
        return result;
    }

    public Fraction multiplicationFraction(Fraction f1, Fraction f2) {
        int a = f1.numerator * f2.numerator;
        int b = f1.denominator * f2.denominator;
        Fraction result = new Fraction(a, b);
        result.reduceFraction();
        return result;
    }

    public Fraction divisionFraction(Fraction f1, Fraction f2) {
        int a = f1.numerator * f2.denominator;
        int b = f1.denominator * f2.numerator;
        Fraction result = new Fraction(a, b);
        result.reduceFraction();
        return result;
    }

    /**
     * Kiểm tra phân số tối giản
     */
    public boolean isReduceFrac(Fraction f) {
        if (findUSCLN(f.numerator, f.denominator) == 1) {
            return true;
        }
        return false;
    }
    /**
     Quy đồng hai phân số
     */

    /**
     * Kiểm tra phân số âm hay dương
     */
    public boolean isNegative(Fraction f) {
        if (f.numerator < 0 || f.denominator < 0)
            return true;
        return false;
    }

    /**
     * So sánh hai phân số
     */
    public boolean isBiggerFrac(Fraction f1, Fraction f2) {
        if (f1.denominator == f2.denominator) {
            if (f1.numerator > f2.numerator)
                return true;
            return false;
        } else {
            f1.numerator = f1.numerator*f2.denominator;
            f2.numerator = f2.numerator*f1.denominator;
            if (f1.numerator > f2.numerator)
                return true;
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a (numerator): ");
        int num = sc.nextInt();
        System.out.println("Please enter b (denominator): ");
        int deno = sc.nextInt();
//
        Fraction f = new Fraction(num, deno);
        Fraction f2 = new Fraction();
//            System.out.println("Print fraction: ");
//            f.print();
        System.out.println("Reduce fraction: ");
        f.reduceFraction();
        f.print();

        System.out.println("Sum 2 fraction: ");
        Fraction sum = f2.sumFraction(new Fraction(2, 3), new Fraction(4, 3));
        sum.print();

        System.out.println("Subtraction 2 fraction: ");
        Fraction sub = f2.subFraction(new Fraction(8, 3), new Fraction(4, 3));
        sub.print();

        System.out.println("Multiplication 2 fraction: ");
        Fraction mul = f2.multiplicationFraction(new Fraction(2, 3), new Fraction(4, 2));
        mul.print();

        System.out.println("Division 2 fraction: ");
        Fraction div = f2.divisionFraction(new Fraction(2, 3), new Fraction(4, 2));
        div.print();

        System.out.print("Is reduce?? : ");
        System.out.println(f2.isReduceFrac(new Fraction(2, 3)));

        System.out.print("Is negative?? : ");
        System.out.println(f2.isNegative(new Fraction(2, 3)));

        System.out.println("Compare 2 fraction: ");
        boolean compare = f2.isBiggerFrac(new Fraction(2, 2), new Fraction(4, 3));
        if (compare)
            System.out.println("Fraction 1 bigger than fraction 2");
            System.out.println("Fraction 2 bigger than fraction 1");

    }
}
