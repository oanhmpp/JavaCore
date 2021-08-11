package Lab_5;

import Lab_4.Bai_4;

public class Bai_3 {
    // a co bao nhieu so chia het cho 4 nhung khong chia het cho 5
    public int countNumber(int[] arr) {
        int count = 0;
        for (int a : arr) {
            if (a % 4 == 0 && a % 5 != 0) {
                count++;
            }
        }
        return count;
    }

    // b tong cac so nguyen to co trong mang
    public int sumNumber(int[] arr){
        int sum = 0;
        for(int a:arr){
            if(Bai_4.isPrime(a)){
                sum += a;
            }
        }
        return sum;
    }
}
