package Lab_8;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class BT {
    /**
     * 1. Không dùng class hỗ trợ ngày, tháng, năm, chỉ dùng if, for, while bình dân.
     * Nhập vào int ngày, int tháng, int năm, int giờ, int phút, int giây: phát sinh ra timestamp (giây).
     */
    public static int convertToTimestamp1(int day, int month, int year, int hour, int minute, int second) {
        if (day < 0 || month < 0 || year < 0 || hour < 0 || minute < 0 || second < 0) {
            return -1;
        } else {
            minute *= 60;
            hour *= 60 * 60;
            day = (countDay(year, month, day) - countDay(1970, 1, 1)) * 24 * 60 * 60;
            return second + minute + hour + day;
        }
    }

    /**
     * 2. Dùng các class hỗ trợ ngày, tháng, năm.
     * Nhập vào int ngày, int tháng, int năm, int giờ, int phút, int giây: phát sinh ra timestamp (giây).
     */
    public static long convertToTimestamp2(int day, int month, int year, int hour, int minute, int second) {
        LocalDateTime ldt1 = LocalDateTime.ofEpochSecond(0, 0, ZoneOffset.UTC);
        LocalDateTime ldt2 = LocalDateTime.of(year, month, day, hour, minute, second);
        return Duration.between(ldt1, ldt2).toSeconds();
    }

    /**
     * 1. Không dùng class hỗ trợ ngày, tháng, năm, chỉ dùng if, for, while bình dân.
     * Nhập vào timestamp (giây): phát sinh ra ngày, tháng, năm, giờ, phút, giây.
     */
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static long getDayFromMonthYear(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }

    public static String convertToDateTime1(long seconds) {
        long sec = (seconds % 86400);       // Số giấy còn lại sau khi chia cho một ngày*/
        long hours = sec / 3600;            // Đổi ra giờ
        long minutes = (sec % 3600) / 60;   // Đổi ra phút
        sec %= 60;                          // Đổi ra giây
        long day = seconds / 86400 + 1;           // Đổi ra số ngày

        int year = 1970;
        while (day >= 366) {
            if (isLeapYear(year)) {
                day -= 366;
            } else {
                day -= 365;
            }
            year++;
        }
        int month = 1;
        while (day > getDayFromMonthYear(month, year)) {
            day -= getDayFromMonthYear(month, year);
            month++;
        }
        return String.format("%02d-%02d-%02d %02d:%02d:%02d", day, month, year, hours, minutes, sec);
    }

    /**
     * 2. Dùng các class hỗ trợ ngày, tháng, năm.
     * Nhập vào timestamp (giây): phát sinh ra ngày, tháng, năm, giờ, phút, giây.
     */
    public static LocalDateTime convertToDateTime2(long seconds) {
        return LocalDateTime.ofEpochSecond(seconds, 0, ZoneOffset.of("+7")); // Múi giờ Việt Nam
    }


    /**
     * Đếm số ngày tính cả năm nhuận Julian Date
     */
    private static int countDay(int year, int month, int day) {
        int a = (14 - month) / 12;
        int y = year + 4800 - a;
        int m = month + 12 * a - 3;
        return day + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;
    }

    public static void main(String[] args) {

        long sc1 = BT.convertToTimestamp1(2, 1, 1970, 0, 0, 0);
        long sc2 = BT.convertToTimestamp2(2, 1, 1970, 0, 0, 0);

        System.out.println("Manual\t: " + sc1);
        System.out.println("Support\t: " + sc2);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(BT.convertToDateTime1(sc1));
        System.out.println(dtf.format(BT.convertToDateTime2(sc2)));
    }
}
