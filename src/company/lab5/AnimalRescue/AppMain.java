package company.lab5.AnimalRescue;

public class Main {
    public static void main(String[] args) {

        Dog Sky = new Dog();
        Sky.setBreed("Pug");
        System.out.println("Rasa: " + Sky.getBreed());
        Sky.setHightM(0.5f);
        System.out.println("Inaltime metri: " + Sky.getHightM());
        Sky.bark();

        AnimalAdopter MrSmith = new AnimalAdopter(();
        MrSmith.setName("Numele Adoptatorului este MrSmith");
        System.out.println(MrSmith.getName());
        MrSmith.setDollarsAvailable(3333);
        System.out.println("Dollari in buzunar:" + MrSmith.getDollarsAvailable());

        AnimalFood whiskas = new AnimalFood();
        whiskas.setName("whiskas");
        System.out.println("Mancare: " + whiskas.getName());
        whiskas.setPriceDollar(21);
        System.out.println("Pret in dolari:" + whiskas.getPriceDollar());
        whiskas.setQuantityKg(22);
        System.out.println("Cantitate :" + whiskas.getQuantityKg());
        whiskas.setStock("In stock");
        System.out.println("Stock:" + whiskas.getStock());

        Veterinary DoctorPush = new Veterinary();
        DoctorPush.setName("DoctorPush");
        System.out.println("Numele veterinarului este: " + DoctorPush.getName());
        DoctorPush.setSpecialization("Caini si pisici");
        System.out.println("Specializare: " + DoctorPush.getSpecialization());

        Cat Missy = new Cat();
        Missy.setFavoriteFood("whiskas");
        System.out.println("Mancarea favorita este: " + Missy.getFavoriteFood());
        Missy.meow();
        Missy.setWeight(4f);
        System.out.println(Missy.getWeight());


    }




}
