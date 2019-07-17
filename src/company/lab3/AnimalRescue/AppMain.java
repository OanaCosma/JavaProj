package company.lab3.AnimalRescue;


import company.lab4.AnimalRescue.Animal;
import company.lab4.AnimalRescue.Cat;
import company.lab4.AnimalRescue.Veterinary;

public class AppMain {


        public static void main(String[] args) {


                    Dog Sky = new Dog();
            Sky.setName("Sky");
            System.out.println(Sky.getName());
            Sky.setAge(3);
            System.out.println(Sky.getAge());
            Sky.setHealth(6);
            System.out.println(Sky.getHealth());
            Sky.setHeightM(0.5f);
            System.out.println(Sky.getHeightM());
            Sky.setWeight(5);
            System.out.println(Sky.getWeight());


            Cat Missy = new Cat();
            Missy.setName("Missy");
            System.out.println(Missy.getName());
            Missy.setAge(3);
            System.out.println(Missy.getAge());
            Missy.setHealth(9);
            System.out.println(Missy.getHealth());
            Missy.setHeightM(0.4f);
            System.out.println(Missy.getHeightM());
            Missy.setWeight(4);
            System.out.println(Missy.getWeight());
            Missy.meow();


            AnimalAdopter MrSmith = new AnimalAdopter();
            MrSmith.setName("MrSmith");
            System.out.println(MrSmith.getName());
            MrSmith.setMoney(150);
            System.out.println(MrSmith.getMoney());


            AnimalFood RoyalCanin = new AnimalFood();
            RoyalCanin.setName("RoyalCanin");
            System.out.println(RoyalCanin.getName());
            RoyalCanin.setPrice(5);
            System.out.println(RoyalCanin.getPrice());
            RoyalCanin.setQuantity(20);
            System.out.println(RoyalCanin.getQuantity());
            RoyalCanin.setDisponibility("inStock");
            System.out.println(RoyalCanin.getDisponibility());


            Activity walking = new Activity();
            walking.setActivityName("walking");
            System.out.println(walking.getActivityName());



            Veterinary DoctorPush = new Veterinary();
            DoctorPush.setName("DoctorPush");
            System.out.println(DoctorPush.getName());
            DoctorPush.setSpecialization("surgery");
            System.out.println(DoctorPush.getSpecialization());
        }
    }


