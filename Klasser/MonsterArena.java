package Klasser;
/*•	Skapa klassen Monster med namn och health.
•	Skapa en konstruktor som bestämmer monstrets namn och start-health.
•	Skapa ett monster i main.
•	Använd en loop för att simulera attacker där monstret förlorar health varje runda.
•	Avsluta loopen med break när monstrets health är 0 eller mindre.
Tränar: klasser + objekt + loop + if + break
 */
public class MonsterArena {
    int health;
    String name;

    MonsterArena(String name, int health){
        this.name = name;
        this.health = health;
    }

    void fight(){
        while(health > 0){
        System.out.println("Monster: " + name + " has " + health + "hearts left!");
        health = health - 2;
        }
        System.out.println("MONSTER IS DEFEATED");
    }

}
