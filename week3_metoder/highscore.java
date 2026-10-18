package week3_metoder;
/*Skapa en klass Player där spelarens poäng är privat och bara nås genom metoder.

· Skapa private int score.

· Skapa getScore() som returnerar spelarens score.

· Skapa setScore(int score) som ändrar spelarens score.

· Använd this.score i settern.

· Testa från main() att ändra och läsa spelarens score.

Tränar på: private, getters, setters, parametrar, this och shadowing. */
public class highscore {
    private int score;

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore(){
        return score;
    }
}
