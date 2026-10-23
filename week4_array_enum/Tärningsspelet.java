package week4_array_enum;
import java.util.Random;
import java.util.Arrays;

/*Du ska skapa ett enkelt tärningsspel där resultaten från fem kast redan är bestämda.
•	Skapa en int[] med fem tärningskast, värden mellan 1 och 6.
•	Använd en loop för att skriva ut alla kast.
•	Räkna ut den sammanlagda poängen.
•	Använd Arrays.sort() för att sortera kasten.
•	Skriv ut det lägsta och högsta kastet.
•	Använd Arrays.binarySearch() för att söka efter värdet 6 i den sorterade arrayen.
Bonus: Använd Arrays.copyOf() för att skapa en ny array som har plats för ytterligare två kast.
 */

public class Tärningsspelet {
    Random r = new Random();

    private int max = 6;
    private int min = 1;
    private int[] tärning = new int[5];

    Tärningsspelet(){

        for(int i = 0; i < tärning.length; i++){
            tärning[i] = r.nextInt(max - min + 1) + min;
        }
    }
    void showAll(){
        for(int e : tärning){
            System.out.println(e);
        }
    }

    int showTotal(){
        int total = 0;
        for(int e : tärning){
            total += e;
        }
        return total;
    }

    void sortArray(){
        Arrays.sort(tärning);
    }

    void highLow(){
        int low = tärning[0];
        int high = tärning[0];
        
        for(int i = 1; i < tärning.length; i++){
            if(tärning[i] < low ){
                low = tärning[i];
            }
            if(tärning[i] > high){
                high = tärning[i];
            }
        }

        System.out.println("HIGHEST Throw: " + high);
        System.out.println("LOWEST Throw: " + low);
        
    }

    void searchBinary(){
        Arrays.sort(tärning);

        int index =  Arrays.binarySearch(tärning, 6);

        if(index >= 0){
            System.out.println("Searching for 6s in Array: " + index);
        }
        else{
            System.out.println("There arent any 6s in these thorws");
        }
        
    }

    void extraThrows(){
        int[] tärning2 = Arrays.copyOf(tärning, tärning.length + 2);

        for(int i = tärning.length; i < tärning2.length; i++){
            tärning2[i] = r.nextInt(max - min + 1) + min;
        }

        //Skriver ut alla på extra kasterna
        System.out.println(Arrays.toString(tärning2));

    }

}
