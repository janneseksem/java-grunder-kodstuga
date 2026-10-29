package week4_array_enum;

/*Skapa en metod som heter raknaPris.
•	Metoden ska ta emot antal godisbitar och pris per bit som parametrar.
•	Metoden ska returnera det totala priset.
•	Anropa metoden och skriv ut resultatet.
Extra utmaning: Skapa en överlagrad version av metoden som bara tar emot antal godisbitar och använder ett fast pris på 2 kr per bit.
 */

public class Godisräknaren {
    public int godisPris(int antal, int pris){
        int resultat = antal * pris;
        return resultat;
    }

    public int fastPris(int antal){
        return antal * 2;
    }
}
