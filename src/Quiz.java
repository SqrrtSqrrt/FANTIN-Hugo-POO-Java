import java.util.ArrayList;

public class Quiz {
    String nom;
    Categorie categorie;
    Redacteur redacteur;
    ArrayList<Question> questions = new ArrayList<>();

    ArrayList<Partie> parties = new ArrayList<>();

    public Quiz(String nom, Categorie categorie, Redacteur redacteur){
        this.nom = nom;
        this.categorie = categorie;
        this.redacteur = redacteur;
        System.out.println("Nouveau quiz créé : " + this.nom);
    }

    public String getNom() {
        return nom;
    }

    public int getScore(Joueur joueur){
        for( Partie p : parties){
            if(p.joueur == joueur){
                return p.getScore();
            }
        }
        return 0;
    }

    public void ajouterQuestion(Question q){
        questions.add(q);
    }
}
