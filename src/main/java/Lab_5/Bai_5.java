package Lab_5;

public class Bai_5 {

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

    // a Tách các số nguyên tố có trong mảng a vào mảng b
    public int[] toArrayOfPrimes(int[] a) {
        int[] c = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                c[j] = a[i];
                j++;
            }
        }
        int[] b = new int[j];
        for (int i = 0; i < b.length; i++) {
            b[i] = c[i];
        }
        return b;
    }

    // xac dinh so so duong trong 1 mang
    public int numberPositive(int[] arr) {
        int count = 0;
        for (int a : arr) {
            if (a > 0) {
                count++;
            }
        }
        return count;
    }

    // xac dinh so so am trong 1 mang
    public int numberNegative(int[] arr) {
        int count = 0;
        for (int a : arr) {
            if (a < 0) {
                count++;
            }
        }
        return count;
    }

    // b tách 1 mảng thành 2 mảng b (số dương) và c (số âm)
    public void toArrayBC(int[] a) {
        int[] b = new int[numberPositive(a)]; // mang chua so duong
        int[] c = new int[a.length - numberPositive(a)];
        int n = 0;
        int m = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                b[n] = a[i];
                n++;
            } else {
                c[m] = a[i];
                m++;
            }

        }

        System.out.println("Array b: ");
        print(b);
        System.out.println("Array c: ");
        print(c);
    }

    // sap xep theo chieu tang dan
    public int[] sortArrIncrease(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                System.out.println("--------" + arr[i]);
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    // ghep 2 mang thanh 1
    public static int[] mergeArr (int[]a, int[]b,int[] d){
        int[]c = new int[a.length+b.length+d.length];
        int i;
        for(i=0; i<a.length; i++)
            c[i] = a[i];
        for(int j=0; j<b.length; j++)
            c[i++]=b[j];
        for (int k = 0; k < d.length;k++)
            c[i++]=d[k];
        return c;
    }

    // c sắp xếp mảng giảm dần
    public int[] sortArrDecrease(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("--------" + arr[i]);
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    // d Sắp xếp mảng sao cho các số dương đứng
    //đầu mảng giảm dần, kế đến là các số âm
    //tăng dần, cuối cùng là các số 0.
    public int[] sortArrSort(int[] arr) {
        System.out.println("le" + arr.length);
        int[] arrPositive = new int[numberPositive(arr)];
        int[] arrNegative = new int[numberNegative(arr)];
        int[] arrEuro = new int[arr.length - numberPositive(arr) - numberNegative(arr)];
        int a = 0;
        int b = 0;
        int c = 0;

        int temp;
        int lenght = arr.length;

        // tim so la so duong va sap xep chieu giam dan
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arrPositive[a] = arr[i];
                a++;
            } else if (arr[i] < 0) {
                arrNegative[b] = arr[i];
                b++;
            } else if (arr[i] == 0) {
                arrEuro[c] = arr[i];
                c++;
            }

        }
        arrPositive = sortArrDecrease(arrPositive);
        arrNegative = sortArrIncrease(arrNegative);

        arr = mergeArr(arrPositive,arrNegative,arrEuro);
        System.out.println("lenght" + arr.length);
        return arr;
    }

    public static void main(String[] args) {
        Bai_5 b5 = new Bai_5();
        int[] arrA = new int[]{1, 2, 4, 5, 6, 11, 3};
        int[] arrA2 = new int[]{1, -2, 4, -5, 6,0,0,-6, 11, 3};

        // cau a
        System.out.println("---------***---------");
        System.out.print("The result after separating primes is: ");
        print(b5.toArrayOfPrimes(arrA));
        System.out.print("The original array: ");
        print(arrA);

        // cau b
        System.out.println("---------***---------");
        b5.toArrayBC(arrA2);

        // cau c
        System.out.println("---------***---------");
        System.out.print("The array after sort: ");
        print(b5.sortArrDecrease(arrA));

        // cau d
        System.out.println("---------***---------");
        System.out.print("The array after sort: ");
        print(b5.sortArrSort(arrA2));

//        mergeArr(arrA,arrA2);
    }
}
