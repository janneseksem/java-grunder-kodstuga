package week3_metoder;
/*Skapa ett litet program där spelaren slåss mot ett monster. Fokuset är att dela upp programmet i tydliga metoder.

· Ha minst en void-metod som skriver ut en attack.

· Ha minst en metod med en parameter, exempelvis attack(int damage).

· Ha minst en metod som returnerar ett värde.

· Skapa minst ett objekt.

· Gör minst ett metodanrop med punktoperatorn.

· Bonus: Gör någon metod static och fundera på varför den kan anropas utan att först skapa ett objekt.

Tränar på: att kombinera flera delar från föreläsningen. */
public class Bossfight {
    private int health;

    public void setHealth(int health){
        this.health = health;
    }
    static void attack(){
        System.out.println("Spelaren attackerar");
    }

    int attack(int damage){
        health = health - damage;
        if (health < 0){
            health = 0;
        }
        
        return health;
    }
    int showHealth(){
        return health;
    }


}
