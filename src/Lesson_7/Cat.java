package Lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            System.out.print(name + " съел(-a) " + appetite + "г еды");
            satiety = true;
            System.out.println(", сытость = "+satiety);
        } else {
            System.out.print("Коту " + name + " не хватает " + (appetite - p.getFood()) + "г еды");
            System.out.println(", сытость = "+satiety);
            p.info();
            p.addEat();
        }
        //plate1.setFood(plate1.getFood() - cats[i].getAppetite());
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }
}
