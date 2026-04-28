import java.util.ArrayList;

public class Question {

    String titre;
    ArrayList<Reponse> reponses = new ArrayList<>();

    public Question(String titre) {
        this.titre = titre;
    }

    public ArrayList<Reponse> getReponse() {
        return reponses;
    }

    public void ajouterReponse(Reponse r) {
        reponses.add(r);
    }

    public boolean verifierReponse(Position positionChoisie) {
        for (Reponse r : reponses) {
            if (r.position == positionChoisie) {
                return r.estCorrecte();
            }
        }
        return false;
    }
}