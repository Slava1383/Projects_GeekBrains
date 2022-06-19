package Lesson_6;

public class Animal {
    private String name;
    private int distance;

    public Animal(String name, int distance){
        this.name = name;
        this.distance = distance;
    }
    public void running(int distance){
        System.out.println(name + " пробежал: " + distance + " m.");
    }
    public void swim(int distance){
        System.out.println(name + " проплыл: " + distance + " m.");
    }
}
