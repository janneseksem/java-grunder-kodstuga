package week3_metoder;
/*En superhjälte har olika egenskaper som tillsammans avgör hur stark hjälten är.

· Skapa metoden powerLevel(int strength, int speed).

· Metoden ska returnera strength + speed.

· Anropa metoden från main() och skriv ut resultatet.

· Bonus: Lägg till en tredje parameter, exempelvis intelligence, och låt den också påverka resultatet.  */
public class Superhjältekraft {
    
    int powerLevel(int strength, int speed){
        int power = strength + speed;
        return power;
    }
}
