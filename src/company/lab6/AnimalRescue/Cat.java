package company.lab6.AnimalRescue;

import company.lab5.AnimalRescue.Animal;

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
