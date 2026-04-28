public class Main {

    public static void main(String[] args) {

        Redacteur redacteur = new Redacteur("Dupont", "Marie");

        Quiz quiz = new Quiz("Les capitales du monde", Categorie.GEOGRAPHIE, redacteur);
        redacteur.rediger(quiz);

        Question q1 = new Question("Quelle est la capitale de la France ?");
        q1.ajouterReponse(new Reponse("Paris",     true,  Position.A));
        q1.ajouterReponse(new Reponse("Lyon",      false, Position.B));
        q1.ajouterReponse(new Reponse("Marseille", false, Position.C));
        q1.ajouterReponse(new Reponse("Bordeaux",  false, Position.D));
        quiz.ajouterQuestion(q1);

        Question q2 = new Question("Quelle est la capitale du Japon ?");
        q2.ajouterReponse(new Reponse("Osaka",  false, Position.A));
        q2.ajouterReponse(new Reponse("Tokyo",  true,  Position.B));
        q2.ajouterReponse(new Reponse("Kyoto",  false, Position.C));
        q2.ajouterReponse(new Reponse("Nagoya", false, Position.D));
        quiz.ajouterQuestion(q2);

        System.out.println("Quiz : " + quiz.getNom());
        System.out.println("Nombre de questions : " + quiz.questions.size());

        Joueur joueur1 = new Joueur("Martin", "Lucas");
        Joueur joueur2 = new Joueur("Bernard", "Sophie");

        joueur1.jouer(quiz);
        joueur2.jouer(quiz);

        Partie partie1 = new Partie(quiz, joueur1, 1);
        Partie partie2 = new Partie(quiz, joueur2, 2);

        System.out.println("Score de " + joueur1.prenom + " : " + partie1.getScore());
        System.out.println("Score de " + joueur2.prenom + " : " + partie2.getScore());

    }
}