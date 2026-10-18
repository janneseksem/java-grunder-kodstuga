package week3_metoder;
/*Skapa en klass Dog där hundens hunger kan förändras med hjälp av metoder.

· Skapa instansvariabeln int hunger.

· Skapa metoden eat() som minskar hundens hunger.

· Skapa metoden showHunger() som skriver ut hur hungrig hunden är.

· Skapa ett Dog-objekt i main() och anropa metoderna med punktoperatorn.

Tränar på: objekt, state, void-metoder och punktoperatorn.  */
public class Hungrydog {
    int hunger;

    Hungrydog(){
        this.hunger = 10;
    }

    void eat(){
        hunger--;
    }

    void showHunger(){
        System.out.println("Dogs current hunger: " + hunger);
    }
}
