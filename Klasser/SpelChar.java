package Klasser;

public class SpelChar {

    int lives;
    String name;
    

    SpelChar(int lives, String name){
        this.lives = lives;
        this.name = name;
    }

    void presentera(){
        System.out.println("Karaktärens namn: " + name + " har antal liv: " + lives);
    }
}
