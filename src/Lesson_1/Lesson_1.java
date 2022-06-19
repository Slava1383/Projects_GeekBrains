package Lesson_1;

public class Lesson_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange \nBanana \nApple");
    }
    public static void checkSumSign(){
        int a = 29;
        int b = -100;
        int c = a + b;
        if(c >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value = 120;
        if(value <= 0){
            System.out.println("Красный");
        }else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }else if(value > 100){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 3;
        int b = 6;
        if(a >= b){
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }
}
