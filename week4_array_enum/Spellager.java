package week4_array_enum;
/*Du har samlat fem föremål i ett datorspel och vill spara dem i en array.
•	Skapa en String[] med fem valfria föremål, exempelvis svärd, sköld och potion.
•	Skriv ut det första och sista föremålet med hjälp av index.
•	Byt ut det tredje föremålet mot något bättre.
•	Skriv ut hur många föremål du har med .length.
Bonus: Använd en enhanced for-loop för att skriva ut hela ditt spellager.
 */
public class Spellager {

    String[] föremål = {"Svärd", "Sköld", "Potion", "Gun", "Gas"};

    void getLast(){
        System.out.println(föremål[föremål.length - 1]);
    }
}
