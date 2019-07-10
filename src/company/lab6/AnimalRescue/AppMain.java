package company.lab6.AnimalRescue;

import company.lab5.AnimalRescue.AnimalAdopter;
import company.lab5.AnimalRescue.AnimalFood;
import company.lab5.AnimalRescue.Cat;
import company.lab5.AnimalRescue.Dog;
import company.lab5.AnimalRescue.Veterinary;

public class Main {
    public static void main(String[] args) {

        company.lab5.AnimalRescue.Dog Sky = new Dog();
        Sky.setBreed("Pug");
        System.out.println("Rasa: " + Sky.getBreed());
        Sky.setHeightM(0.5f);
        System.out.println("Inaltime metri: " + Sky.getHeightM());


        AnimalAdopter MrSmith = new AnimalAdopter();
        MrSmith.setName("Numele Adoptatorului este MrSmith");
        System.out.println(MrSmith.getName());
        MrSmith.setDollarsAvailable(150);
        System.out.println("Dollari in buzunar:" + MrSmith.getDollarsAvailable());

        company.lab5.AnimalRescue.AnimalFood RoyalCanin = new AnimalFood();
        RoyalCanin.setName("RoyalCanin");
        System.out.println("Mancare: " + RoyalCanin.getName());
        RoyalCanin.setPriceDollar(5);
        System.out.println("Pret in dolari:" + RoyalCanin.getPriceDollar());
        RoyalCanin.setQuantityKg(20);
        System.out.println("Cantitate :" + RoyalCanin.getQuantityKg());
        RoyalCanin.setStock("In stock");
        System.out.println("Stock:" + RoyalCanin.getStock());

        company.lab5.AnimalRescue.Veterinary DoctorPush = new Veterinary();
        DoctorPush.setName("DoctorPush");
        System.out.println("Numele veterinarului este: " + DoctorPush.getName());
        DoctorPush.setSpecialization("Caini si pisici");
        System.out.println("Specializare: " + DoctorPush.getSpecialization());

        company.lab5.AnimalRescue.Cat Missy = new Cat();
        Missy.setBreed("birman");
        System.out.println("Rasa este: " + Missy.getBreed());
        Missy.setWeight(4f);
        System.out.println(Missy.getWeight());


    }




}


