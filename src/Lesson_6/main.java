package Lesson_6;

public class main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик", 50);
        Cat cat1 = new Cat("Мурзик", 30);
        dog1.running(500);
        dog1.swim(10);
        cat1.running(100);
        cat1.swim(2);
    }
}
