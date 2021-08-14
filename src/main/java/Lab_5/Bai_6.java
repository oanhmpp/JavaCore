package Lab_5;

public class Bai_6 {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

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

    // xóa phần tử tại vị trí x trong mảng
    public int[] deleteXOnArr(int[] arr, int x) {
        int c = 0;
        int[] result = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i != x) {
                result[c] = arr[i];
                c++;
            }
        }
        return result;
    }

    //a. Sửa các số nguyên tố có trong mảng thành
    //số 0
    public int[] editPrimeOnArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    //b. Chèn số 0 đằng sau các số nguyên tố
    //trong mảng
    public int[] insertPrimeOnArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                arr[i] = arr[i] * 10;
            }
        }
        return arr;
    }

    //c. Xóa tất cả số nguyên tố có trong mảng
    public int[] deletePrimeOnArr(int[] arr) {
        int n = arr.length;
        int[] arr2 = arr;
        for (int i = 0; i < arr2.length; i++) {
            if (isPrime(arr2[i])) {
                arr2 = deleteXOnArr(arr2, i);
                i--;
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        Bai_6 b6 = new Bai_6();

        int[] a = new int[]{1, 2, 3, 5, 7, 5, 1, 3, 4};
        int[] b = new int[]{1, 2, 3, 5, 7, 5, 1, 3, 4};
        int[] c = new int[]{1, 2, 3, 5, 7, 5, 1, 3, 4};
        System.out.println("***");
        System.out.print("Array after fixed: ");
        print(b6.editPrimeOnArr(a));
        System.out.println("***");
        System.out.print("Array after inserted: ");
        print(b6.insertPrimeOnArr(b));
        System.out.println("***");
        System.out.print("Array after deleted: ");
        print(b6.deletePrimeOnArr(c));
    }
}
