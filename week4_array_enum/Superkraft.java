package week4_array_enum;
/*Skapa en enum som heter Superkraft.
•	Lägg till ELD, IS, VIND och BLIXT.
•	Skapa en variabel som håller spelarens superkraft.
•	Använd switch för att skriva ut ett meddelande beroende på superkraft.
Extra utmaning: Använd values() och en Enhanced For Loop för att skriva ut alla tillgängliga superkrafter.
 */

public enum Superkraft {
    ELD,
    IS,
    VIND,
    BLIXT;

    void visaKraft(){
        switch (this) {
            case ELD:
                System.out.println("Spelarens superkraft är ELD");
                break;
            case IS:
                System.out.println("Spelarens superkraft är IS");
            case VIND:
                System.out.println("Spelarens superkraft är VIND");
                break;
            case BLIXT:
                System.out.println("Spelarens superkraft är BLIXT");
                break;
            default:
                break;
        }
    }
}
