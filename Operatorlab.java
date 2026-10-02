public class Operatorlab {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a + b); //13
        System.out.println(a - b); //7
        System.out.println(a * b); //30
        System.out.println(a / b); //3
        System.out.println(a % b); //1

        int number = 18;

        System.out.println(number % 2);
        //1. Vad blir resultatet? 1
        //2. Vad händer om number ändras till 18? 0
        //3. Vad kan % 2 användas till? Om talet är delbart med jämt eller med 2 tal

        int age = 20;

        boolean test1 = age > 18;
        boolean test2 = age < 18;
        boolean test3 = age == 20;
        boolean test4 = age != 20;

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);

        boolean hasTicket = true;
        boolean isAdult = true;

        boolean allowed = hasTicket || isAdult;
        System.out.println(allowed);

    }
}
