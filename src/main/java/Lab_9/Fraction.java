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
    public String print() {
        if (denominator == 0) {
            return "Invalid !!! (Denominator must be greater than 0)";
        }
        if (denominator == 1)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    /**
     * Tìm ước chung lớn nhất
     */
    public int findUSCLN(int a, int b) {
        if (a < 0)
            a *= (-1);
        if (b < 0)
            b *= (-1);
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
    public Fraction sumFraction(Fraction f2) {
        int a = this.numerator * f2.denominator + f2.numerator * this.denominator;
        int b = this.denominator * f2.denominator;
        Fraction result = new Fraction(a, b);
        result.reduceFraction();
        return result;
    }

    public Fraction subFraction(Fraction f2) {
        int a = this.numerator * f2.denominator - f2.numerator * this.denominator;
        int b = this.denominator * f2.denominator;
        Fraction result = new Fraction(a, b);
        result.reduceFraction();
        return result;
    }

    public Fraction multiplicationFraction(Fraction f2) {
        int a = this.numerator * f2.numerator;
        int b = this.denominator * f2.denominator;
        Fraction result = new Fraction(a, b);
        result.reduceFraction();
        return result;
    }

    public Fraction divisionFraction(Fraction f2) {
        int a = this.numerator * f2.denominator;
        int b = this.denominator * f2.numerator;
        Fraction result = new Fraction(a, b);
        result.reduceFraction();
        return result;
    }

    /**
     * Kiểm tra phân số tối giản
     */
    public boolean isReduceFrac() {
        if (findUSCLN(this.numerator, this.denominator) == 1) {
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
    public boolean isNegative() {
        if (this.numerator < 0 || this.denominator < 0)
            return true;
        return false;
    }

    /**
     * So sánh hai phân số
     */
    public int compare(Fraction f2) {
        if (this.denominator == f2.denominator) {
            if (this.numerator > f2.numerator)
                return 1;
            else if (this.numerator < f2.numerator)
                return -1;
            return 0;
        } else {
            this.numerator = this.numerator * f2.denominator;
            f2.numerator = f2.numerator * this.denominator;
            if (this.numerator > f2.numerator)
                return 1;
            else if (this.numerator < f2.numerator)
                return -1;
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a (numerator): ");
        int num = sc.nextInt();
        System.out.println("Please enter b (denominator): ");
        int deno = sc.nextInt();

        Fraction f = new Fraction(num, deno);
        System.out.println("***");
        System.out.println("Print fraction: ");
        System.out.println(f.print());

        System.out.println("***");
        System.out.print("Reduce fraction: ");
        f.reduceFraction();
        System.out.println(f.print());

        System.out.println("***");
        System.out.print("Sum 2 fraction: ");
        Fraction sum = f.sumFraction(new Fraction(4, 5));
        System.out.println(sum.print());

        System.out.println("***");
        System.out.print("Subtraction 2 fraction: ");
        Fraction sub = f.subFraction(new Fraction(4, 5));
        System.out.println(sub.print());

        System.out.println("***");
        System.out.print("Multiplication 2 fraction: ");
        Fraction mul = f.multiplicationFraction(new Fraction(4, 2));
        System.out.println(mul.print());

        System.out.println("***");
        System.out.print("Division 2 fraction: ");
        Fraction div = f.divisionFraction(new Fraction(4, 2));
        System.out.println(div.print());

        System.out.println("***");
        System.out.print("Is reduce?? : ");
        System.out.println(f.isReduceFrac());

        System.out.println("***");
        System.out.print("Is negative?? : ");
        System.out.println(f.isNegative());

        System.out.println("***");
        System.out.print("Compare 2 fraction: ");
        Fraction f1 = new Fraction(3, 4);
        int compare = f.compare(f1);
        if (compare == 1)
            System.out.format("%s > %s", f.print(), f1);
        else if (compare == -1)
            System.out.format("%s < %s", f.print(), f1.print());
        System.out.format("%s = %s", f.print(), f1.print());

    }
}
