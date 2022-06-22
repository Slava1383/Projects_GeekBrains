package Lesson_6;

public class Dog extends Animal{
    int maxDistRun = 500;
    int maxDistSwim = 10;
    public Dog(String name, int distance) {
        super(name, distance);
    }

    @Override
    public void running(int distance) {
        if(distance <= maxDistRun){
            super.running(distance);
        }else {
            System.out.println("Собака не может пробежать более: " + maxDistRun + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        if(distance <= maxDistSwim){
            super.swim(distance);
        }else {
            System.out.println("Собака не может проплыть более: " + maxDistSwim + " метров");
        }
    }
}
