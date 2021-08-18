package Lab_7;

import Lab_4.Bai_4;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class Bai_1_2_3_4 {
    // tim mang m x n có chứa phần tử x hay không
    public static boolean hasXInArr(int[][] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == x)
                    return true;
            }
        }
        return false;
    }

    // ma tran a co phai la ma tran toan so nguyen to khong
    public static boolean isPrimeArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (!Bai_4.isPrime(arr[i][j]))
                    return false;
            }
        }
        return true;
    }

    // tim gia tri lon nhat trong ma tran a
    public static int maxInArr(int[][] arr) {
        int max = arr[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.print("arr[" + x + "][" + y + "]: ");
        return max;
    }

    //    Bài 4 Cho trước ma trận a, kích thước m x n. Tính tổng các phần tử trên:
//    a. Dòng d, cột c
    // nếu nhập row = 0 col = 3 tức là tính tổng cột 3
    // nếu nhập row = 3 col = 0 tức là tính tổng dòng 3
    // ngược lại báo lỗi
    public static int sumRowCollum(int[][] arr, int row, int col) {
        int sumRow = 0;
        int sumCollum = 0;

        // tính tổng cột thứ: col ( col > 1 )
        if (row == 0 && col <= arr[0].length) {
            for (int i = 0; i < arr.length; i++) {
                sumCollum += arr[i][col - 1];
            }
            return sumCollum;
            // tính tổng hàng thứ: row (row > 1)
        } else if (col == 0 && row <= arr.length) {
            for (int i = 0; i < arr[0].length; i++) {
                sumRow += arr[row - 1][i];
            }
            return sumRow;
        } else {
            return -1;
        }
    }

    //    b. Đường chéo chính, đường chéo phụ (ma trận vuông)
    //      truyền vào boolean true nếu muốn tính đường chéo chính và ngược lại
    public static int sumDiagonalLine(int[][] arr, boolean isMain) {
        int sum = 0;

        if (arr.length == arr[0].length) {
            if (isMain == true) {
                // tính đường chéo chính
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i][i];
                }
                return sum;
            } else {
                // tính đường chéo phụ
                for (int i = arr.length - 1; i > 0; i--) {
                    for (int j = 0; j < arr.length; j++) {
                        sum += arr[j][i];
                        i--;
                    }
                }
                return sum;
            }
        } else {
            return -1;
        }
    }

    //    c. Nửa trên/dưới đường chéo chính (ma trận vuông)
    //     Truyền vào true nếu muốn tính nữa trên và ngược lại
    public static int sumHaftMain(int[][] arr, boolean isUp) {
        int sum = 0;
        if (arr.length == arr[0].length) {
            // tính nữa trên
            if (isUp == true) {
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i; j < arr.length; j++) {
                        sum += arr[i][j];
                    }
                }
                return sum;
            } else {
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i; j < arr.length; j++) {
                        sum += arr[j][i];
                    }
                }
                return sum;
            }
        } else {
            return -1;
        }
    }

    //    d. Nửa trên/dưới đường chéo phụ (ma trận vuông)
    //     Truyền vào true nếu muốn tính nữa trên và ngược lại
    public static int sumHaftExtra(int[][] arr, boolean isUp) {
        int sum = 0;
        int n = arr.length;
        int a = 0;
        if (arr.length == arr[0].length) {
            // tính nữa trên
            if (isUp == true) {
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < n; j++) {
                        sum += arr[i][j];
                    }
                    n--;
                }
                return sum;
            } else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    for (int j = arr.length - 1; j >= a; j--) {
                        sum += arr[j][i];
                    }
                    a++;
                }
                return sum;
            }
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number row:");
//        int r = sc.nextInt();
//        System.out.println("Enter number collum: ");
//        int c = sc.nextInt();
//        int[][] arr = new int[r][c];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.println("Arr[" + i + "][" + j + "]:");
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Please enter x: ");
//        int x = sc.nextInt();
//
//        //bai 1
//        if (hasXInArr(arr, x)) {
//            System.out.println("The arr has contain x !!");
//        } else {
//            System.out.println("The arr has not contain x !!");
//
//        }
//
//        //bai 2
//        if (isPrimeArr(arr)) {
//            System.out.println("This is a matrix of all primes !!");
//        } else {
//            System.out.println("This is not a matrix of all primes !!");
//        }
//
//        // bai 3
//        System.out.println("Max of arr is: ");
//        System.out.println(maxInArr(arr));

        // bai 4
        // a // nếu nhập row = 0 col = 3 tức là tính tổng cột thứ 3 (đếm từ 1)
        //    // nếu nhập row = 3 col = 0 tức là tính tổng dòng thứ 3 (đếm từ 1)
        //    // ngược lại báo lỗi
        int[][] arr4 = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        System.out.println("The sum row/col: " + sumRowCollum(arr4, 3, 0));
        //    b. Đường chéo chính, đường chéo phụ (ma trận vuông)
        //      truyền vào boolean true nếu muốn tính đường chéo chính và ngược lại
        int[][] arr5 = new int[][]{{1, 2, 1}, {3, 1, 4}, {1, 5, 6}};
        System.out.println("The sum diagonal line main/extra: " + sumDiagonalLine(arr5, false));
        //    c. Nửa trên/dưới đường chéo chính (ma trận vuông)
        //     Truyền vào true nếu muốn tính nữa trên và ngược lại
        int[][] arr6 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("The sum haft main up/down: " + sumHaftMain(arr6, true));
        System.out.println("The sum haft main up/down: " + sumHaftMain(arr6, false));
        //    d. Nửa trên/dưới đường chéo phụ (ma trận vuông)
        //     Truyền vào true nếu muốn tính nữa trên và ngược lại
        int[][] arr7 = new int[][]{{1, 1, 2, 3}, {4, 1, 5, 6}, {7, 1, 8, 9}, {1, 1, 1, 1}};
        System.out.println("The sum haft extra up/down: " + sumHaftExtra(arr7, true));
        System.out.println("The sum haft extra up/down: " + sumHaftExtra(arr7, false));
    }
}
