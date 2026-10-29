package week4_array_enum;
import java.util.Arrays;
/*Skapa en int-array med fem olika mängder guld.
•	Skapa en metod som heter raknaGuld.
•	Metoden ska ta emot en array som parameter.
•	Använd en loop för att räkna ihop allt guld.
•	Returnera totalsumman och skriv ut resultatet.
Extra utmaning: Skapa en metod som hittar den största guldmängden i en kista.
 */
 
public class Skatten {

    int [] guld = {2, 5, 7, 12, 11};
    int summa = 0;

    public int raknaGuld(int[] guld){
        for(int w : guld){
            summa += w;
        }
        return summa;
    }
    public int hittaStörst(int[] guld){
        Arrays.sort(guld);
        return guld[guld.length - 1];
    }
}
