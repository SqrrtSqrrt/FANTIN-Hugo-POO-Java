public class Partie {

    Quiz quiz;
    Joueur joueur;
    int score;

    public Partie(Quiz quiz, Joueur joueur, int score) {
        this.quiz = quiz;
        this.joueur = joueur;
        this.score = score;
        quiz.parties.add(this);
        System.out.println("Nouvelle partie créée");
    }

    public int getScore() {
        return score;
    }
}