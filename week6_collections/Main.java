package week6_collections;
import java.util.Scanner;

//1. och 2.
/*Skriv ned vad ni tror att de fyra utskrifterna blir. Vad är skillnaden mellan peek() och poll()? Får samma namn finnas flera gånger i en Queue?
Svar: Jag tror första utskriften är Kim, sen Kim igen, sen storlek är 2 och sista är Alex, Kim */
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Queue<String> ko = new LinkedList<>();

        ko.offer("Kim"); // [Kim]
        ko.offer("Alex"); // [Kim, Alex]
        ko.offer("Kim"); // [Kim, Alex, Kim]

        System.out.println(ko.peek()); //Första element
        System.out.println(ko.poll()); //Första element men tas bort
        System.out.println(ko.size()); //Finns bara nu Alex och Kim
        System.out.println(ko); //Skriver ut hela arrayn

        //3. Utöka programmet så att en fjärde person kan ställa sig i kön. Skriv sedan ut vem som står först, betjäna två personer och skriv ut vilka som är kvar. Kontrollera att rätt person alltid betjänas först.
        ko.offer("Daniel");

        System.out.println(ko.peek());
        System.out.println(ko.poll());
        System.out.println(ko.poll());
        System.out.println(ko);

        //4. Caféet vill också ha en lista med unika medlemsnamn. En medlem ska bara registreras en gång även om personalen försöker lägga till namnet flera gånger. Skapa en separat samling som löser detta och demonstrera att den fungerar.
        //Förklara kort varför ni valde den samlingen i stället för Queue. Fundera också på vad som skiljer den från List.
        //Svar: Det är gränsnitt för köer, först in, först ut men den kan lägga dublera inmatning av samma namn
        Set<String> myList = new HashSet<>();
        myList.add("Robin");
        myList.add("Jojo");
        myList.add("Robin");

        System.out.println(myList);
        System.out.println(myList.size());

        //5. Skapa en List<Integer> med minst fyra poäng från caféets spel. Skriv ut poängen, sortera dem med Collections.sort() och skriv ut dem igen. Varför används Integer och inte int mellan <>?
        List<Integer> spel = new ArrayList<>();
        spel.add(4);
        spel.add(2);
        spel.add(7);
        spel.add(5);

        Collections.sort(spel);

        System.out.println(spel);
        //Integer används pga det inte kan användas primitiva typer, det är generiska samlingar som List och Set som lagrar objekt (referenser)
        
        //6.
        /*Förslag på meny
        1. Visa alla monster
        2. Starta en match
        3. Visa topplistan
        4. Visa monstertyper
        5. Avsluta
 */

        List<MonsterSpel> monster = new ArrayList<>();

        monster.add(new Dragon("Drake"));
        monster.add(new Robot("Bot"));
        monster.add(new Slime("Slimey"));

        Collections.shuffle(monster);

        Queue<MonsterSpel> queue = new LinkedList<>(monster);
        Map<String, Integer> topplista = new HashMap <>();

        //6.1
        boolean gameStatus = true;
        Scanner scanner = new Scanner(System.in);
        
        while(gameStatus){
            System.err.println("Mata in vad du vill göra, Meny: ");
            System.err.println("1. Visa alla monster");
            System.err.println("2. Starta en match");
            System.err.println("3. Visa topplistan");
            System.err.println("4. Avsluta");
            

            switch (scanner.nextInt()) {
            case 1:
                for (MonsterSpel w : monster){
                    System.out.println(w.getnamn() + " - Current HP: " + w.getHP());
            }
            break;
            case 2:
                if (queue.size() < 2){
                    System.out.println("Det finns inte två monster att fighta mot varandra");
                    
                    
                }
                MonsterSpel monster1 = queue.poll();
                MonsterSpel monster2 = queue.poll();

                monster1.setHP(100);
                monster2.setHP(100);

                System.out.println(monster1.getnamn() + " VS " + monster2.getnamn());

                Queue<MonsterSpel> turorning = new LinkedList<>();
                turorning.offer(monster2);
                turorning.offer(monster1);

                while(monster2.getHP() > 0 && monster1.getHP() > 0){

                    MonsterSpel anfallare = turorning.poll();
                    MonsterSpel försvarare = turorning.peek();

                    int skada = anfallare.attack();
                    försvarare.setHP(försvarare.getHP() - skada);

                    System.out.println(anfallare.getnamn() + " gör " + skada + " mot monster " + försvarare.getnamn() + " och har " + försvarare.getHP() + " HP kvar");
                    turorning.offer(anfallare);
                }
                if(monster2.getHP() > 0){
                    String namn = monster2.getnamn();
                    topplista.put(namn, topplista.getOrDefault(namn, 0) + 2); //vinnaren får 2 poäng
                    System.out.println("Vinnaren är: " + namn);   
                }
                else{
                    String namn = monster1.getnamn();
                    topplista.put(namn, topplista.getOrDefault(namn, 0) + 2);
                    System.out.println("Vinnaren är: " + namn);
                }
                //ställer sist i kön
                queue.offer(monster1);
                queue.offer(monster2);
                break;
            case 3:
                for(Map.Entry<String, Integer> entry : topplista.entrySet()){
                    System.out.println(entry.getKey() + " " + entry.getValue() + " pts");
                }
                break;
            case 4:
                gameStatus = false;
                break;
        
            default:
                System.out.println("Välj alternativ mellan 1 - 4.");
                break;
        }
        }
        
        









    }
}


