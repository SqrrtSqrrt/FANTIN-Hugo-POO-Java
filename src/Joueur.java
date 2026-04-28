public class Joueur {

    String nom;
    String prenom;

    public Joueur(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
        System.out.println("Nouveau joueur créé : " + this.prenom + " " + this.nom);
    }

    public void jouer(Quiz q){
        System.out.println(prenom + " " + nom + " joue au quiz : " + q.getNom());
    }
}
