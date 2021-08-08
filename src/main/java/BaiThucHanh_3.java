public class BaiThucHanh_3 {
    int monthArr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int leapMonthArr[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // bai 1 tinh nam nhuan
    public boolean isLeapYear(int year) {
        if (year > 0) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                // nam nhuan
//                System.out.println("This is leap year !!");
                return true;
            } else {
//                System.out.println("This is not leap year !!");
                return false;
            }
        } else {
            System.out.println("Error...Please enter again !!");
            return false;
        }
    }

    // bai 2
    // xac dinh ngay hop le
    public boolean isValidityOfDate(int day, int month, int year) {
        if (0 < month && month <= 12) {
            if (isLeapYear(year)) {
                if (day <= leapMonthArr[month - 1]) {
//                    System.out.println("The date is valid");
                    return true;
                } else {
//                    System.out.println("The date is not valid");
                    return false;
                }
            } else {
                if (day <= monthArr[month - 1]) {
//                    System.out.println("The date is valid");
                    return true;
                } else {
//                    System.out.println("The date is not valid");
                    return false;
                }
            }
        } else {
//            System.out.println("The date is not valid");
            return false;
        }
    }

    public String nextDate(int day, int month, int year) {

        int monthNext = month + 1;
        int dayNext = day + 1;
        int yearNext = year + 1;
        String result = "";

        if(isValidityOfDate(day,month,year)) {
        if (isLeapYear(year)) {
            // nam nhuan
            if (day == leapMonthArr[month - 1] && month < 12) {
                result = "1/" + monthNext + "/" + year;
            } else if (day == leapMonthArr[month - 1] && month == 12) {
                result = "1/1" + "/" + yearNext;
            } else {
                result = dayNext + "/" + month + "/" + year;
            }
        } else if (!isLeapYear(year)){
            if (day == monthArr[month - 1] && month < 12) {
                result = "1/" + monthNext + "/" + year;
            } else if (day == monthArr[month - 1] && month == 12) {
                result = "1/1" + "/" + yearNext;
            } else {
                result = dayNext + "/" + month + "/" + year;
            }
        }} else {
            result = "false - maybe the date invalid";
        }
        return result;
    }

    public String preDate(int day, int month, int year) {

        int monthPre = month - 1;
        int dayPre = day - 1;
        int yearPre = year - 1;
        String result = "";
        if(isValidityOfDate(day,month,year)) {
            // ngay truoc do
            if (isLeapYear(year)) {
                // nam nhuan
                if (day == 1 && 1 < month && month <= 12) {
                    result = leapMonthArr[month - 2] + "/" + monthPre + "/" + year;
                } else if (day == 1 && month == 1) {
                    result = leapMonthArr[leapMonthArr.length - 1] + "/" + "12" + "/" + yearPre;
                } else {
                    result =  dayPre + "/" + month + "/" + year;
                }
            } else if (!isLeapYear(year)) {
                if (day == monthArr[month - 1] && month < 12) {
                    result = "1/" + monthPre + "/" + year;
                } else if (day == monthArr[month - 1] && month == 12) {
                    result = "1/1" + "/" + yearPre;
                } else {
                    result = dayPre + "/" + month + "/" + year;
                }
            }
        }else {
            result = "false - maybe the date invalid";
        }
        return result;
    }

    public static void main(String[] args) {
        BaiThucHanh_3 b3 = new BaiThucHanh_3();
        System.out.println("----------EX 1----------");
        System.out.println(b3.isLeapYear(100));
        System.out.println("----------EX 2----------");
        System.out.println("Valid/Invalid: "+b3.isValidityOfDate(1, 13, 100));
        System.out.println("Next day: "+b3.nextDate(1,13,100));
        System.out.println("Previous day: "+b3.preDate(1,13,100));
        System.out.println("***");
        System.out.println("Valid/Invalid: "+b3.isValidityOfDate(29,2,101));
        System.out.println("Next day: "+b3.nextDate(29,2,101));
        System.out.println("Previous day: "+b3.preDate(29,2,101));
//        System.out.println("***");

    }
}
