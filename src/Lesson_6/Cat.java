package Lesson_6;

public class Cat extends Animal{
    int maxDistRun = 200;
    public Cat(String name, int distance) {
        super(name, distance);
    }
    @Override
    public void running(int distance) {
        if(distance <= maxDistRun){
            super.running(distance);
        }else {
            System.out.println("Кошка не может пробежать более: " + maxDistRun + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кошки бояться воды и по этому не плавают :)");
    }
}
