package week4_array_enum;

public class Main {
    public static void main(String[] args) {
        //1.
        Spellager lager = new Spellager();
        lager.getLast();

        lager.föremål[2] = "Arrow";
        System.out.println(lager.föremål[2]);

        System.out.println(lager.föremål.length);

        //Bonus
        for(String w : lager.föremål){
            System.out.println(w);
        }

        //2.
        Highscore score = new Highscore();

        score.everyPoints();

        score.sumPoints();

        score.sortPoints();

        System.out.println(score.poäng[score.poäng.length - 1]);

        //3.
        Skattjakten jakt = new Skattjakten();
        jakt.skattKarta();
        System.out.println();
        //flytta skatten
        jakt.skatt[0][2] = 0;
        jakt.skatt[2][0] = 1;
        jakt.skattKarta();

        //4.
        Direction currDirection = Direction.NORTH;

        currDirection.showDirection();
        currDirection = Direction.WEST; //Bonus
        currDirection.showDirection();

        for(Direction d : Direction.values()){
            System.out.println(d);
        }

        //5.

        Tärningsspelet tärning = new Tärningsspelet();
        tärning.showAll();

        int result = tärning.showTotal();
        System.out.println(result);

        tärning.sortArray();
        tärning.showAll();

        tärning.highLow();

        tärning.searchBinary();

        tärning.extraThrows(); //Bonus

    }
}
