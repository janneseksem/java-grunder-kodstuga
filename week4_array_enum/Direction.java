package week4_array_enum;
/*Du skapar ett äventyrsspel där spelaren kan gå i olika väderstreck.
•	Skapa en enum som heter Direction.
•	Lägg till NORTH, EAST, SOUTH och WEST.
•	Skapa en variabel som innehåller Direction.NORTH.
•	Använd switch-case för att skriva ut olika meddelanden beroende på riktning.
•	Använd Direction.values() tillsammans med en enhanced for-loop för att skriva ut alla riktningar.
Bonus: Ändra spelarens riktning och se hur utskriften förändras.
 */
public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;
    
    void showDirection(){
        switch(this){
            case NORTH:
            System.out.println("Currently directing: NORTH");
            break;
            
            case WEST:
            System.out.println("Currently directing: WEST");
            break;

            case EAST:
            System.out.println("Currently directing: EAST");
            break;

            case SOUTH:
            System.out.println("Currently directing: SOUTH");
            break;
        }
    }
}
