package Klasser;
/*6.	Bonus - Tamagotchi
•	Skapa klassen Pet med till exempel name, hunger och energy.
•	Lägg till metoderna eat() och play() som förändrar värdena.
•	Om hunger blir för hög ska djuret klaga.
•	Om energy blir för låg ska djuret vägra leka.
•	Extra: gör variablerna private.
 */
public class Tamagotchi {
    private String name;
    private int hunger;
    private int energy;
    
    Tamagotchi(String name, int hunger, int energy){
        this.name = name;
        this.hunger = hunger;
        this.energy = energy;
    }

    void eat(){
        hunger = hunger - 2;
        energy = energy + 5;

        //Hunger ska ej va negativ
        if(hunger < 0 ){
            hunger = 0;
        }
        System.out.println("Name: " + name + " Eating");
    }
    void play(){
        if(hunger >= 10){
            System.out.println("Pet: " + name + " is hungry and barking at you, feed the pet");
            
        }

        else if(energy < 25){
            System.out.println("Pet: " + name + " has low energy and wont play, feed the pet");
        }
        
        else{
            energy = energy - 10;
            hunger = hunger + 2;
            System.out.println("Pet: " + name + " loves playing with you now");
        }
    }
}
