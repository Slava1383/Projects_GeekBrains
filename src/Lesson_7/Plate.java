package Lesson_7;

public class Plate {
    private int food;
    private int ADDFOOD = 100;


    public Plate(int food){
        this.food = food;
    }

    public void decreaseFood(int n){
        if(food >= n){
            food -= n;
        } else {
            System.out.println("В тарелке не достаточно еды что-бы накормить кота");
        }
    }

    public void addEat(){
        setFood(food = ADDFOOD);
        System.out.println("Добавляем еду в тарелку");
        info();
    }

    public void info(){
        System.out.println("В тарелке " + food + "г еды");
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
}
