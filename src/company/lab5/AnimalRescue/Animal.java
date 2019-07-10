package company.lab5.AnimalRescue;

public class Animal {
    private String breed;
    private int age;
    private float heightM;
    private float weight;
    private String name;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeightM() {
        return heightM;
    }

    public void setHeightM(float heightM) {
        this.heightM = heightM;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("He's eating Pedigree");
    }


    public void play() {
        System.out.println("Play fetch");
    }

    public void sleep() {
        System.out.println("ZzZzZz...");
    }


    public void drink() {
        System.out.println("Drinking montain water");
    }

    public void speak(){
        System.out.println("Hey!");
    }

}
