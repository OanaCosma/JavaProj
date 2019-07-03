package company.lab5.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog Sky = new Dog();

        System.out.println(Sky.breed);
        Sky.sleep();


        Cat Missy = new Cat();
        System.out.println(Missy.breed);
        Missy.play();
        Missy.drink();

        AnimalAdopter MrSmith = new AnimalAdopter();
        System.out.println(MrSmith.name);
        MrSmith.money();

        AnimalFood RoyalCanin = new AnimalFood();
        System.out.println(RoyalCanin.name);
        RoyalCanin.price();
        RoyalCanin.quantity();
        RoyalCanin.disponibility();


        Veterinary DoctorPush = new Veterinary();
        System.out.println(DoctorPush.name);
        DoctorPush.specialization();

        Activity walking = new Activity();
        System.out.println(walking.name);
        walking.name();


    }

}

