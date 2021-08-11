package Lab_5;

public class Main_Test {
    public static void main(String[] args) {
        Bai_2 b2 = new Bai_2();
        System.out.println("***Bai 2***");
        // cau b
        int[] arr = new int[]{11,13,17};
        if(b2.isArrayOfPrimes(arr)){
            System.out.println("This is the array of primes !!");
        }else {
            System.out.println("This is not the array of primes");
        }

        // cau c
        int[] arr2 = new int[]{11,19,17};
        if(b2.isArrOfIncreaseNumbers(arr2)){
            System.out.println("This is the array of increase numbers !!");
        }else {
            System.out.println("This is not the array of increase numbers ");
        }

        Bai_3 b3 = new Bai_3();
        System.out.println("***Bai 2***");
        // a
        int[] arr3 = new int[]{25,15,4};
        System.out.println("There are "+b3.countNumber(arr3)+" numbers divisible by 4 but not\n" +
                "divisible by 5");
        // b
        int[] arr4 = new int[]{1,2,3,7,11,15,4};
        System.out.println("Sum of the primes in the array is "+b3.sumNumber(arr4));
    }
}
