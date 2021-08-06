import java.util.Locale;

public class BaiThucHanh_2 {

    // bai 1 - doc 1 so tu 1 den 9
    public String readNumber(int number){
        if(number == 1){
            return "One";
        }else if (number == 2){
            return "Two";
        }else if (number == 3){
            return "Three";
        }else if (number == 4){
            return "Four";
        }else if (number == 5){
            return "Five";
        }else if (number == 6){
            return "Six";
        }else if (number == 7){
            return "Seven";
        }else if (number == 8){
            return "Eight";
        }else if (number == 9){
            return "Nine";
        }else {
            return "Can't read";
        }
    }

    // bai 2 - doi chu thuong sang chu hoa va nguoc lai
    public String changeWord(String s){
        if(s.length()==1){
            char c = s.charAt(0);
        if(Character.isUpperCase(c) == true){
            return s.toLowerCase();
        }else{
            return s.toUpperCase();
        }
        }else {
            return "Please enter ONE word !!";
        }
    }

    // bai 3 giai pt bac 1 ax+ b = 0
    public double firstDegree(int a,int b){
        if(a == 0){
            System.out.println("The number a must != 0 !!");
            return 0;
        }else {
            return -b/a;
        }
    }

    // bai 4 giai pt bac 2 ax2 + b = 0
    public String secondDegree(double a, double b, double c){
        if(a != 0){
            double denta = b*b - 4*a*c;
        if (denta<0){
            return "The equation has no solution";
        }else if (denta>0){
            double x1 = (-b + Math.abs(denta))/2*a;
            double x2 = (-b - Math.abs(denta))/2*a;
            return "The equation has two solution: x1 = "+x1+" x2 = "+x2;
        }else if (denta == 0){
            double x = -b/(2*a);
            return "The equation has one solution: x1 = x2 = "+x;
        }
        }else {
            return "The number a must != 0 !!";
        }
        return "";
    }

    // bai 5 tim so co gia tri nho nhat
    public int findMin (int a,int b,int c,int d){
        int min = a;
        if (min>b){
            min = b ;
        }
        if (min>c){
            min = c ;
        }
        if (min>d){
            min = d ;
        }

        return min;
    }

    // bai 6 sap xep 4 so nguyen tang dan
    public String sortNumber (int a,int b,int c,int d){
        int[] arr = new int[4];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        int min = arr[0];
        for (int i = 0 ; i < arr.length-1;i++){
            for(int j = i+1 ; j <arr.length;j++){
                if(arr[i]>arr[j]){
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }

        for (int i = 0 ; i <arr.length;i++){
            System.out.print(arr[i]+"-");
        }
      return "";
    }

    // bai 7 tinh tien taxi
    public double payTaxi(double numKM){
        double result = 0;
        if(numKM<=1){
            result = numKM*15000;
        }else if (2.0 <= numKM && numKM <=5.0){
            result = numKM*13500;
        }else if(numKM>= 6 ){
            result = numKM*1100;
        } else if(numKM>=120){
            result = 0.1*(numKM*1100);
        }else {
            System.out.println("Error");
        }
        return result;
    }

    // bai 8 xac dinh 1 thang co bao nhieu ngay
    public int dateNumber(int month, int year){
         int  monthArr[]      = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
         int  leapMonthArr[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
         int result = 0 ;

         if((year%400 == 0) || (year%4 == 0 && year%100 != 0)){
             // nam nhuan
             result = leapMonthArr[month-1];
         } else {
             result = monthArr[month-1];
         }
         return result;
    }

    // bai 9 3 canh tam giac
    public String triangle(double a,double b,double c){
        if(a+b>c || a+c>b || b+c>a){
            if(a==b||a==c|| b==c){
                if(a*a+b*b==c*c || a*a+c*c==b*b || c*c+b*b==a*a){
                    return "This is right-angled and isosceles  triangle";
                }else {
                    return "This is isosceles  triangle";
                }
            }else if(a==b && b==c && a==c) {
                return "This is equilateral triangle";
            } else {
                return "This is simple triangle";
            }
        } else {
            return "This is not triangle";
        }
    }

    public static void main(String[] args) {
    BaiThucHanh_2 b2 = new BaiThucHanh_2();
        System.out.println("--------Ex 1--------");
        System.out.println("The result is: "+ b2.readNumber(9));
        System.out.println("--------Ex 2--------");
        System.out.println("UpperCase or LowerCase: "+b2.changeWord("s"));
        System.out.println("--------Ex 3--------");
        System.out.println("The solution of the first degree equation is: "+ b2.firstDegree(2,4));
        System.out.println("--------Ex 4--------");
        System.out.println(b2.secondDegree(2,1,-1));
        System.out.println("--------Ex 5--------");
        System.out.println("Min: "+ b2.findMin(2,4,5,1));
        System.out.println("--------Ex 6--------");
        System.out.println("Sort in ascending order: "+b2.sortNumber(3,5,7,4));
        System.out.println("--------Ex 7--------");
        System.out.println("The amount to be paid is: "+ b2.payTaxi(55));
        System.out.println("--------Ex 8--------");
        System.out.println("The number of this month is: "+ b2.dateNumber(8,2018));
        System.out.println("--------Ex 9--------");
        System.out.println(b2.triangle(1,2,3));
    }
}
