package week6_collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/*
Bygg ett enkelt monsterspel i terminalen! Tre monster möts i en arena, turas om att attackera och samlar poäng.

Mål
Öva på arv (extends), abstrakta klasser, interface (implements), @Override, polymorfism samt List, Set, Queue, Map och Collections.shuffle().

Spelets regler
Skapa tre monster: Dragon, Robot och Slime. Alla börjar med 100 HP.
Två monster möts i en match och attackerar växelvis.
När ett monsters HP når 0 är matchen slut. Vinnaren får 3 poäng.
Spelaren ska kunna visa monster, starta match, se topplista och avsluta.

Uppdrag
1. Skapa monster
Skapa en abstrakt klass Monster med namn, HP och en abstrakt metod attack(). Låt Dragon, Robot och Slime ärva Monster och skriva egna attack()-metoder med @Override.
2. Lägg till specialattacker
Skapa interfacet SpecialAttack med useSpecialAttack(). Låt Dragon och Robot implementera det och ha var sin specialattack. Slime har bara vanlig attack.
3. Organisera arenan
Lägg monstren i en List<Monster> (ArrayList). Blanda startordningen med Collections.shuffle(). Använd en Queue<Monster> för att turas om att attackera.
4. Räkna poäng
Använd Map<String, Integer> (HashMap) till topplistan. Använd Set<String> (HashSet) för att samla unika monstertyper.
 
Förslag på meny
1. Visa alla monster
2. Starta en match
3. Visa topplistan
4. Visa monstertyper
5. Avsluta
 */
abstract class MonsterSpel {
    private String namn;
    private int hp = 100;

    public MonsterSpel(String namn){
        this.namn = namn;
    }

    public String getnamn(){
        return namn;
    }

    public int getHP(){
        return hp;
    }

    public void setHP(int hp){
        this.hp = Math.max(0, hp);
    }

    abstract int attack();
}

class Dragon extends MonsterSpel implements SpecialAttack{
    public Dragon(String namn){
        super(namn);
    }
    @Override 
    int attack(){
        return 25;
    }

    @Override
    public int useSpecialAttack(){
        return 50;
    }
}

class Robot extends MonsterSpel implements SpecialAttack{

    public Robot(String namn){
        super(namn);
    }
    @Override 
    int attack(){
        return 20;
    }

    @Override
    public int useSpecialAttack(){
        return 40;
    }
}

class Slime extends MonsterSpel {
    public Slime(String namn){
        super(namn);
    }
    @Override 
    int attack(){
        return 15;
    }
}

/**
 * SpecialAttack
    */
interface SpecialAttack {
    
    int useSpecialAttack();
    
}