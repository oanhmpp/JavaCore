package Lab_4;

public class Bai_5 {
    public int[] reverseNumber(int number){
        int[] arr = Bai_1.numberSeparation(number);
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            for (int j = arr.length-1;j>=0;j--){
                result[i] = arr[j];
                i++;
            }
        }
        return result;
    }

    public static void print (int[] arr){
        for(int i = 0 ; i <arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
