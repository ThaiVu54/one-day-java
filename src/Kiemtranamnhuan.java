import java.util.Scanner;

public class Kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        boolean isLeapYear = false;
        year = sc.nextInt();
        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if(isLeapYear){
            System.out.printf("%d is a leap year", year);
        }else {
            System.out.printf("%d is not a leap year", year);
        }
    }
}
