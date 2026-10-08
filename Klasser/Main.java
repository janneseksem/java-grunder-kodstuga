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

        Robot iphone = new Robot("iPhone 15", 3000);
        iphone.visaStatus();
    }
}
