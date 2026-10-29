package week5_inheritance_interface_enum;

public class Main {
    public static void main(String[] args) {

        //1.
        Djurparken cat = new Cat("Simon");
        Djurparken dog = new Dog("Daniel");
        
        dog.makeSound();
        cat.makeSound();

        //2.
        MystiskaTrädet oak = new Oak(10);
        MystiskaTrädet pine = new Pine(15);

        oak.describe();
        pine.describe();

        //3.
        Drivable [] vehicles = {
            new Car(),
            new Bicycle(),
            new Scooter()
        };

        for (Drivable vehicle : vehicles){
            vehicle.drivabled();
        }

        //4.
        Animal dog1 = new Dog1();
        Animal cat1 = new Cat1();

        dog1.makeSound();
        cat1.makeSound();
        Animal.showTalent((Playable) dog1);

    }
    
}
