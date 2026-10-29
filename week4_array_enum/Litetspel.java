package week4_array_enum;
import java.util.Arrays;
/*Skapa en klass som heter Hjalte.
•	Ge hjälten en privat instansvariabel poang.
•	Skapa en getter som returnerar poängen.
•	Skapa en setter som kan ändra poängen.
•	Skapa en int-array med fem poängvärden, till exempel {10, 20, 5, 50, 15}.
•	Använd en loop för att räkna ihop poängen och ge dem till hjälten.
•	Skriv ut hjältens totala poäng.
Extra utmaning: Skapa en metod som tar emot en array och returnerar den högsta poängen.
 */
public class Litetspel {
    private int poang;
    int [] poangArray = {10, 20, 5, 50, 15};

    public int getPoints(){
        return poang;
    }

    public void setPoints(int newPoints){
        poang = newPoints;
    }

    public int totalPoints(int [] poangArray){
        int sum = 0;
        for(int w : poangArray){
            sum += w;
        }

        return sum;
    }

    public int highestPoints(int [] poangArray){
        Arrays.sort(poangArray);

        return poangArray[poangArray.length - 1];
    }
}
