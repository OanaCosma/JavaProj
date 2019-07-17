package company.lab7.AnimalRescue;

import company.lab6.AnimalRescue.Animal;

abstract class Cat extends Animal {
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

    public void eat() {
        System.out.println("The cat eats cat food.");
    }



}
