package company.lab3.AnimalRescue;

public class Dog {

    private String name;
    private int age;
    private float heightM;
    private float weight;
    private float health;


    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeightM(float heightM) {
        this.heightM = heightM;
    }

    public float getHeightM() {
        return heightM;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getHealth() {
        return health;
    }
}
