public class BaiThucHanh_3 {

    // bai 1 tinh nam nhuan
    public boolean isLeapYear(int year){
        if(year>0){
            if((year%400 == 0) || (year%4 == 0 && year%100 != 0)){
                // nam nhuan
                System.out.println("This is leap year !!");
                return true;}
            else {
                System.out.println("This is not leap year !!");
                return false;
            }
        }else {
            System.out.println("Error...Please enter again !!");
            return false;
        }
    }

    // bai 2
    // xac dinh ngay hop le
    public boolean isValidityOfDate(int day,int month,int year){
        int  monthArr[]      = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int  leapMonthArr[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int monthNext = month+1;
        int dayNext = day+1;
        int yearNext = year+1;

        int monthPre = month-1;
        int dayPre = day-1;
        int yearPre = year-1;

        if(isLeapYear(year)){
            if(day <= leapMonthArr[month-1]){
                System.out.println("The date is valid");

                // ngay tiep theo
                if(day == leapMonthArr[month-1] && month<12){
                    System.out.println("The next day is "+ "1/"+monthNext+"/"+year);
                }else if (day == leapMonthArr[month-1] && month==12) {
                    System.out.println("The next day is " + "1/1" + "/" + yearNext);
                }else {
                    System.out.println("The next day is "+ dayNext+"/"+month+"/"+year);
                }

                // ngay truoc do
                if(day == 1 && 1 < month && month<=12){
                    System.out.println("The previous day is "+ leapMonthArr[month-2] + "/" + monthPre +"/"+year);
                }else if(day == 1 && month == 1 ){
                    System.out.println("The previous day is "+ leapMonthArr[leapMonthArr.length-1] + "/" + "12" +"/"+yearPre);
                } else {
                    System.out.println("The previous day is "+ dayPre + "/" + month +"/"+year);
                }

                return true;
            }else {
                System.out.println("The date is not valid");
                return false;
            }
        }else {
            if(day <= monthArr[month-1]){
                System.out.println("The date is valid");
                if(day == monthArr[month-1] && month<12){
                    System.out.println("The next day is "+ "1/"+monthNext+"/"+year);
                    System.out.println("The previous day is "+ dayPre + "/" + month +"/"+year);
                }else if (day == monthArr[month-1] && month==12){
                    System.out.println("The next day is "+ "1/1"+"/"+yearNext);
                    System.out.println("The previous day is "+ dayPre + "/" + month +"/"+year);
                }else if (day == leapMonthArr[month-1] && month==1){
                    System.out.println("The next day is "+ "1/"+monthNext+"/"+year);
                    System.out.println("The previous day is "+ "1/12"+"/"+year);
                } else {
                    System.out.println("The next day is "+ dayNext+"/"+month+"/"+year);
                    System.out.println("The previous day is "+ dayPre + "/" + month +"/"+year);
                }
                return true;
            }else {
                System.out.println("The date is not valid");
                return false;
            }
        }
    }

    public static void main(String[] args) {
        BaiThucHanh_3 b3 = new BaiThucHanh_3();
        System.out.println("----------EX 1----------");
        b3.isLeapYear(100);
        System.out.println("----------EX 2----------");
        b3.isValidityOfDate(1,1,96);
        System.out.println("***");
        b3.isValidityOfDate(31,12,96);
        System.out.println("***");
        b3.isValidityOfDate(21,12,96);
    }
}
