public class Reponse {

    String texte;
    boolean bonne_reponse;
    Position position;

    public Reponse(String texte, boolean bonne_reponse, Position position) {
        this.texte = texte;
        this.bonne_reponse = bonne_reponse;
        this.position = position;
    }

    public boolean estCorrecte() {
        return bonne_reponse;
    }
}