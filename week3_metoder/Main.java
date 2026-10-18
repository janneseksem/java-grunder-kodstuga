package week3_metoder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.
        Hälsningsroboten message = new Hälsningsroboten();
        message.halsa();

        //2.
        Pizzakalkylatorn beställning = new Pizzakalkylatorn();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hur många pizzor vill du beställa (Pris per pizza är 120 SEK): ");
        int antal = scanner.nextInt();

        int totalpris = beställning.beraknaPris(antal);

        System.out.println("Totalt Pris: " + totalpris + " SEK");

        scanner.close();

        //3.
        Superhjältekraft hjälte = new Superhjältekraft();

        int totalpower = hjälte.powerLevel(15, 20);

        System.out.println("Hjältens power är: " + totalpower);

        //4.
        Hungrydog husky = new Hungrydog();
        husky.showHunger();
        husky.eat();
        husky.showHunger();

        highscore poäng = new highscore();

        poäng.setScore(5);
        int coin = poäng.getScore();

        System.out.println(coin);

        poäng.setScore(15);
        coin = poäng.getScore();
        System.out.println(coin);

        //4.
        /*magic Power = new magic();
        Power.showPower(5);
        Power.showPower("IT Högskolan");*/
        //Anledning varför java vet version körs är pga vi har angett argument på int och String i magic klassen.

        //5.
        //Olika attacker: 1. sword = 2 dmg 2. magic = 3 dmg 3. Gun = 5 dmg
        int sword = 2;
        int magic = 3;
        int gun = 5;

        Bossfight zombie = new Bossfight();
        zombie.setHealth(10);
        int hp = zombie.showHealth();
        
        System.out.println("Boss current Health: " + hp);

        Bossfight.attack(); //static -metod. Kan anropa via klassen istället för objektet
        hp = zombie.attack(magic);

        System.out.print("Boss current Health: " + hp);
    }
    
}
