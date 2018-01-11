package HumanComparatorb1;

public class Human {
    private String name;
    private int age;
    private double height;
    private double weight;

    public Human(){
        this.name="_";
        this.age=0;
        this.height=0.0;
        this.weight=0.0;

    }

    public Human(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }


}
