package Klasser;

/*3.	Raketuppskjutning
•	Gör en for-loop som räknar ner från 10 till 1.
•	Efter nedräkningen ska programmet skriva ut "LIFTOFF!".
•	Utöka programmet så att talet 5 hoppas över med continue.
Tränar: for-loop och continue
 */

public class Raketuppskjutning {
    void rocket(){
        for(int x = 10; x > 0; x--){
            if(x == 5){
                continue;
            }
            else{
                System.out.println("Rocket launch in: " + x);
            }
        }
        System.out.println("LIFTOFF!");
    }
}
