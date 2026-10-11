package Klasser;


/*1.	Får du åka berg- och-dalbanan?
•	Skapa variabler för en persons ålder och längd.
•	Använd if, else if och else för att avgöra om personen får åka.
•	Programmet ska skriva ut ett tydligt meddelande beroende på resultatet.
Tränar: if / else if / else
 */
public class Liseberg {
    int age;
    int length;

    Liseberg(int age, int length){
        this.age = age;
        this.length = length;
    }
    //Dalbanan har 6 år och 140cm gräns
    void allowed(){
        if(age > 5 && length > 139){
            System.out.println("Tillåten att åka");
        }
        else{
            System.out.println("Du är för kort och ung");
        }
    }
}
