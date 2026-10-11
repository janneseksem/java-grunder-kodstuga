package Klasser;
/*2.	Fredagsmenyn
•	Skapa en variabel choice med ett värde mellan 1 och 4.
•	Använd switch för att koppla varje val till en maträtt.
•	Lägg till default för ett ogiltigt val.
Tränar: switch, case, break
 */
public class Fredagsmenyn {
        int choice;

        Fredagsmenyn(int choice){
            this.choice = choice;
        }

        void maträtt(){
            switch (choice) {
                case 1:
                    System.out.println("McDonalds");
                    break;
                case 2:
                    System.out.println("Max");
                case 3:
                    System.out.println("Burger King");
                default:
                    break;
            }
        }
}
    

