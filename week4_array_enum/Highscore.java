package week4_array_enum;
import java.util.Arrays;


/*Du utvecklar ett spel och vill hålla reda på spelarnas poäng.
•	Skapa en int[] som innehåller fem olika poäng.
•	Använd en vanlig for-loop för att skriva ut alla poäng.
•	Skriv ut den totala summan av poängen.
•	Använd Arrays.sort() för att sortera poängen.
•	Skriv ut den sorterade arrayen med Arrays.toString().
Bonus: Skriv ut den högsta poängen efter sorteringen.
 */
public class Highscore {
    int[] poäng = {3, 2, 5, 8, 10};

    void everyPoints(){
        for(int element : poäng){ 
            System.out.println(element);
        }
    }

    void sumPoints(){
        int sum = 0;
        for(int i : poäng){
            sum += i;
        }
        System.out.println(sum);
    }

    void sortPoints(){
        Arrays.sort(poäng);
        System.out.println(Arrays.toString(poäng));
    }
}
