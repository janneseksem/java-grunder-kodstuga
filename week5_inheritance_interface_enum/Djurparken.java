package week5_inheritance_interface_enum;
/*I djurparken finns flera sorters djur.
•	Skapa en klass Animal med en instansvariabel name och en konstruktor som tar emot ett namn.
•	Skapa klasserna Dog och Cat som ärver från Animal med extends.
•	Ge båda klasserna en konstruktor som använder super(name).
•	Skapa en metod makeSound() i Animal. Låt Dog och Cat skriva över den så att de låter olika.
•	Skapa ett Dog-objekt och ett Cat-objekt i main och anropa makeSound() på båda.
Extra utmaning: Skapa ytterligare en djurklass som ärver från Animal.
Tränar: arv, superklass, subklass, super(), overriding
 */
public class Djurparken {
    String name;

    Djurparken(String name){
        this.name = name;
    }
    void makeSound(){
        
    }
}

class Dog extends Djurparken{
    Dog(String name){
        super(name);
    }
    void makeSound(){
        System.out.println(name + " says: woof!");
    }
}

class Cat extends Djurparken{
    Cat(String name){
        super(name);
    }

    void makeSound(){
        System.out.println(name + " says: meow!");
    }
    
}


