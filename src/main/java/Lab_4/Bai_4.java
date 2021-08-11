package Lab_4;

public class Bai_4 {
    // ktra so nguyen to
    public static boolean isPrime(int n) {
        if (n > 0) {
            if (n < 2) {
                return false;
            }
            for (int i = 2; i < n - 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    // tinh tong so nguyen n
    public int sum(int n) {
        int result = 0;
        if (0 < n && n < 50) {
            while (n > 0) {
                if (isPrime(n)) {
                    System.out.println(n);
                    result += n;
                }
                n--;
            }
        } else {
            return 0;
        }
        return result;
    }
}
