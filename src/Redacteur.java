public class Redacteur {

    String nom;
    String prenom;

    public Redacteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        System.out.println("Nouveau rédacteur créé : " + this.prenom + " " + this.nom + "");
    }

    public void rediger(Quiz q) {
        System.out.println(prenom + " " + nom + " a rédigé le quiz : " + q.getNom());
    }
}