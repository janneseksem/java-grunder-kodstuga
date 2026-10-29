package week5_inheritance_interface_enum;
/*Nu kombinerar du arv, interface och polymorfism.
•	Skapa en abstrakt klass Animal med en abstrakt metod makeSound().
•	Skapa interfacet Playable med metoden play().
•	Skapa Dog och Cat som ärver från Animal. Låt minst Dog implementera Playable.
•	Skapa objekten i main och spara dem i variabler av typen Animal. Anropa makeSound() på båda.
•	Skapa en metod showTalent(Playable participant) som anropar play(). Skicka in din Dog till metoden.
Extra utmaning: Låt även Cat implementera Playable och testa samma metod med båda.
Tränar: arv, abstract, interface, polymorfism
 */
abstract class Animal {
    abstract void makeSound();

    static void showTalent(Playable participant){
        participant.play();
    }
}

/**
 * Playable
 */
interface Playable {
    void play();
}

class Dog1 extends Animal implements Playable{
    @Override
    void makeSound(){
        System.out.println("Dog says: woof");
    }
    @Override 
    public void play(){
        System.out.println("Dag is playing with a ball");
    }
}

class Cat1 extends Animal{
    @Override 
    void makeSound(){
        System.out.println("Cat says: Meow");
    }
}

