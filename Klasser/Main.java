package Klasser;

public class Main {
    public static void main(String[] args) {

        //Skapa en hund och katt som gör ljud
        Djur hund = new Djur("Voff");
        Djur katt = new Djur("Meow");

        hund.gorLjud();
        katt.gorLjud();

        //Skapa två olika karaktärer
        SpelChar daniel = new SpelChar(10, "Daniel");
        SpelChar fredrik = new SpelChar(5, "Fredrik");

        daniel.presentera();
        fredrik.presentera();

        //Skapar karaktär för iphone
        Robot iphone = new Robot("iPhone 15", 3000);
        iphone.visaStatus();//Numret ändras inte pga privat instansvariabel
        
        //Skapar karaktär för dalbanan för en som är vuxen och en som är för ung

        Liseberg daniella = new Liseberg(25, 178);
        Liseberg william = new Liseberg(3, 150);

        daniella.allowed();
        william.allowed();

        //Skapa karaktär för Fredagsmys meny
        Fredagsmenyn jesper = new Fredagsmenyn(1); //Mcdonalds
        Fredagsmenyn uga = new Fredagsmenyn(3); //Burger king

        jesper.maträtt();
        uga.maträtt();

        //Skapa karaktär för Raket uppskjutning
        Raketuppskjutning spacex = new Raketuppskjutning();
        spacex.rocket();

        //Skapa karaktär för monster
        MonsterArena herobrine = new MonsterArena("Herobrine", 20);
        herobrine.fight();

        //Skapa karaktär för tamagochi pet
        Tamagotchi morris = new Tamagotchi("Morris", 15, 25);
        morris.play();
        morris.eat();
        morris.eat();
        morris.eat();
        morris.play();
    }
}
