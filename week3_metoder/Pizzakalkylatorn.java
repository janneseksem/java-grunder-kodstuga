package week3_metoder;
/*Övning 2 – Pizzakalkylatorn

Skapa en metod som räknar ut vad en pizzabeställning kostar.

· Skapa metoden beraknaPris(...).

· Metoden ska ta emot antal pizzor och pris per pizza som parametrar.

· Metoden ska returnera det totala priset.

· Anropa metoden och skriv ut resultatet. */
public class Pizzakalkylatorn {

    private int pizzaPris;
    
    Pizzakalkylatorn(){
        this.pizzaPris = 120;
    }

    int beraknaPris(int antal){
        int total = pizzaPris * antal;
        return total;
    }
}
