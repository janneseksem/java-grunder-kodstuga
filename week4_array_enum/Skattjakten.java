package week4_array_enum;
import java.util.Arrays;

/*Du ska skapa en liten skattkarta med hjälp av en tvådimensionell array.
•	Skapa en int[][] med 3 rader och 3 kolumner.
•	Placera ut en skatt genom att sätta värdet 1 på valfri position.
•	Låt alla andra positioner ha värdet 0.
•	Använd två for-loopar för att skriva ut hela kartan som ett rutnät.
Bonus: Flytta skatten genom att ändra två värden i arrayen.
 */
public class Skattjakten {
    int [][] skatt = new int[3][3];
    

    public Skattjakten(){
        skatt [0][2] = 1;
    }
    

    void skattKarta(){
        for(int [] w : skatt){
            for (int element : w){
                System.out.print(element + " ");
            }
            System.out.println();
         }
    }
    
}
