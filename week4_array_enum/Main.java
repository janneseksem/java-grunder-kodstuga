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

        //6.
        Hälsarobot robot = new Hälsarobot();

        System.out.println(robot.nameRobot("Daniel"));
        System.out.println(robot.nameRobot("Martin"));
        System.out.println(robot.nameRobot("Simon"));
        System.out.println(robot.nameRobot("Simon") + " Min favorit nummer är " + robot.favoriteNumber(12));

        //7.

        Godisräknaren candy = new Godisräknaren();
        System.out.println("Priset på godiset är: " + candy.godisPris(10, 3) + " Kr!");
        System.out.println("Priset på godiset med fastpris på 2 kr: " + candy.fastPris(10) + " Kr!");

        //8.
        Skatten kista = new Skatten();
        int summa = kista.raknaGuld(kista.guld);

        System.out.println("Totalt guld är: " + summa);
        System.out.println("Största guldet är: " + kista.hittaStörst(kista.guld));

        //9. 

        Superkraft currPower = Superkraft.VIND;
        currPower.visaKraft();

        for(Superkraft w : Superkraft.values()){
            System.out.println(w);
        }

        //10. 
        Litetspel spel = new Litetspel();

        spel.setPoints(15);
        System.out.println("Player points: " + spel.getPoints());

        System.out.println("Total points in array: " + spel.totalPoints(spel.poangArray));

        System.out.println("Highest points: " + spel.highestPoints(spel.poangArray));
    }   
}
