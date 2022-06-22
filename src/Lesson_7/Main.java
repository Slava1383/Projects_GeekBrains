package Lesson_7;

public class Main {
    public static void main(String[] args) {
//        Cat cat1 = new Cat("Барсик", 90, false);
//        Plate plate = new Plate(100);
//        plate.info();
//        cat1.eat(plate);
//        plate.info();

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Мурзик", 38, false);
        cats[1] = new Cat("Мурка", 26, false);
        cats[2] = new Cat("Васька", 34, false);
        cats[3] = new Cat("Багира", 25, false);
        Plate plate1 = new Plate(100);
        plate1.info();

        for(int i = 0; i < cats.length; i++){
                cats[i].eat(plate1);
        }

       // plate.setFood(plate.getFood() - cat1.getAppetite());
    }
}
