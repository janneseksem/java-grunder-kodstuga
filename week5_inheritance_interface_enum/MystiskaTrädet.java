package week5_inheritance_interface_enum;
/*Alla träd är träd, men olika träd kan beskrivas på olika sätt.
•	Skapa en abstrakt klass Tree med en instansvariabel height.
•	Lägg till en abstrakt metod describe().
•	Skapa klasserna Oak och Pine som ärver från Tree och implementerar describe() på olika sätt.
•	Skapa objekt av Oak och Pine i main och skriv ut deras beskrivningar.
Extra utmaning: Prova att skriva new Tree() – varför får du ett kompileringsfel?
Tränar: abstract, abstrakta metoder, extends
 */
abstract class MystiskaTrädet {
    int height;

    MystiskaTrädet(int height){
        this.height = height;
    }

    abstract void describe();

}

class Oak extends MystiskaTrädet{

    Oak(int height){
        super(height);
    }
    @Override 
    void describe(){
        System.out.println("This Oak is: " + height + " meters long.");

    }
}

class Pine extends MystiskaTrädet{

    Pine(int height){
        super(height);
    }

    @Override 
    void describe(){
        System.out.println("This Pine is: " + height + " meters long.");
    }
}
