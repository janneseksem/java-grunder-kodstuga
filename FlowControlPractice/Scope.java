package FlowControlPractice;

import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        //Scop Skapa en variabel inne i ett kodblock och testa vad som händer om du försöker använda den utanför blocket.

        /*
        {int maxcount = 10;}
        System.out.println(maxcount); //ERROR
 */
        //IF Gör ett program som skriver ut ett meddelande om ett tal är större än 10.
        int person = 11;
        if(person > 10 ){
            System.out.println("Personen är äldre än 10 år");
        }

        //Else/if Gör ett program som skriver ut olika meddelanden beroende på om ett tal är litet, mellan eller stort.
        
        if (person < 10){
            System.out.println("Tal är litet");
        }
        else if(person >= 10 && person < 20){
            System.out.println("Tal är mellan");
        }
        else{
            System.out.println("Tal är större");
        }

        //Switch Låt ett tal mellan 1 och 3 motsvara tre olika alternativ och skriv ut rätt alternativ.
        
        int tal = 2;
    
        switch (tal){
            case 1: 
                System.out.println("LOW");
                break;
            case 2: 
                System.out.println("MEDIUM");
                break;
            case 3: 
                System.out.println("HIGH");
                break;
        }
        //While Skriv ut talen 1 till 5 med en while-loop.

        int nummer = 1;
        while(nummer < 6){
            System.out.println(nummer);
            nummer++;
        }

        // Do-While Skriv ut ett meddelande minst en gång med en do-while-loop.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age 10 or less: ");
        int age = scanner.nextInt();
        do{
            System.out.println("You typed: " + age);
            age++;
        }
        while(age <= 10);
        //For-loop Skriv ut talen 1 till 10 med en for-loop.
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        //Break Gör en loop som avbryts när räknaren når ett visst tal.
        int numb = 0;
        while(true){
            if(numb > 10){
                break;
            }
            else{
                numb++;
            }
        }
        //Continue Gör en loop som hoppar över ett visst tal.
        for (int j = 1; j < 20;  j++){
            if (j % 3 != 0){
                continue;
            }
            System.out.println(j);
        } 
    }

}
