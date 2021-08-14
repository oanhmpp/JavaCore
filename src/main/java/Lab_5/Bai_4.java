package Lab_5;

public class Bai_4 {
    // a tim kiem vi tri cuoi cung cua phan tu x trong mang
    public int findLastElement(int x, int[] arr) {
        int location = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                location = i;
            }
        }
        return location;
    }

    // b vi tri so nguyen to dau tien
    public int findFirstPrime(int[] arr) {
        int location = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Lab_4.Bai_4.isPrime(arr[i])) {
                location = i;
                break;
            }
        }
        return location;
    }

    // c tim so nho nhat trong mang
    public int findMinInArr(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    // sai
    // d tim vi tri so duong nho nhat trong mang
    public int findMinPositiveIndex(int[] arr) {
        int lastPosiInd = findLastPositiveIndex(arr);
        if (lastPosiInd < 0) {
            return -1;
        }
        int index = lastPosiInd;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[index] > arr[i]) {
                index = i;
            }
        }
        return index;
    }

    // tim vi tri so am lon nhat
    public int findMaxNavigativeIndex(int[] arr) {
        int maxNegInx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && (maxNegInx == -1 || arr[i] > arr[maxNegInx])) {
                maxNegInx = i;
            }
        }
        return maxNegInx;
    }

    // tim vi tri so duong cuoi cung trong mang
    public int findLastPositiveIndex(int[] arr) {
        int index = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > 0) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Bai_4 b4 = new Bai_4();

        int[] arr = new int[]{7, 1, -3, -4, -5, 6, 2};
        System.out.println("***");
        System.out.print("Vị trí cuối cùng của phần tử x trong mảng: ");
        System.out.println(b4.findLastElement(2, arr));
        System.out.println("***");
        System.out.print("Số nguyên tố đầu tiên trong mảng: ");
        System.out.println(b4.findFirstPrime(arr));
        System.out.println("***");
        System.out.print("Số dương nhỏ nhất trong mảng: ");
        System.out.println(b4.findMinInArr(arr));
        System.out.println("***");
        System.out.print("Vị trí số dương nhỏ nhất trong mảng: ");
        System.out.println(b4.findMinPositiveIndex(arr));
        System.out.println("***");
        System.out.print("Vị trí số dương cuối cùng trong mảng: ");
        System.out.println(b4.findLastPositiveIndex(arr));
        System.out.println("***");
        System.out.print("Vị trí số âm lớn nhất trong mảng: ");
        System.out.println(b4.findMaxNavigativeIndex(arr));
    }
}
