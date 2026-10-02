public class StringWorkshop {
    public static void main(String[] args){
        String firstName = "Anna";
        String lastName = "Andersson";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(fullName.length());

        System.out.println("Hej! Jag here " + fullName + ".");
        System.out.println("Mitt namn innehåller " + fullName.length() + ".");
        
        String city = "Göteborg";
        String profession = "Mjukvarutestare";

        System.out.println(fullName + " bor i Göteborg och utbildar sig till " + profession + ".");


    }
}
