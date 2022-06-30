package Lesson_2;

public class Lesson_2 {
    public static void main(String[] args) {

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if( i == 0 || j == 0|| i == 5 || j == 5 || i == j){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println(compareSum(10, 7));
        verifyPositiveNegative(-1);
        System.out.println(verifyPositiveNegativeBool(43));
        printStrings("Привет мир", 4);
        System.out.println(verifyLeapYear(2024));
    }

    public static boolean compareSum(int a, int b) {
        int res = a + b;
        if (res >= 10 && res <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void verifyPositiveNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean verifyPositiveNegativeBool(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printStrings(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }

    public static boolean verifyLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }
}