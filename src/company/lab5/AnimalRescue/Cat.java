package company.lab5.AnimalRescue;

public class Cat extends Animal {
    private String claws;

    public String getClaws() {
        return claws;
    }

    public void setClaws(String claws) {
        this.claws = claws;
    }

    public void speak() {
        System.out.println("Meow!");
    }


}
