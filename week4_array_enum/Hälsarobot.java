package week4_array_enum;
/*Skapa en metod som heter halsa.
•	Metoden ska ta emot ett namn som parameter.
•	Metoden ska skriva ut till exempel: ”Hej Alex! Jag är din robot!”.
•	Anropa metoden flera gånger med olika namn.
Extra utmaning: Skapa ytterligare en metod som returnerar robotens favoritnummer.
 */
public class Hälsarobot {
    

    public String nameRobot(String name){
        return "Hej " + name + "! Jag är din robot!";
    }

    public int favoriteNumber(int number){
        return number;
    }

}
