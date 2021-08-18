package Lab_6;

public class Bai_1 {
    // nhập vào chuỗi S và in các chữ in hoa lên
    public String printUpper(String s) {
        char[] arr = s.toCharArray();
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                result += arr[i] + "";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Bai_1 b1 = new Bai_1();
        System.out.println("The result: " + b1.printUpper("NguyenThi"));
    }
}
