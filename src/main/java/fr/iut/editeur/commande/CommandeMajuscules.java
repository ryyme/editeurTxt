package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscules extends CommandeDocument {
    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }



    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : majuscules;depart;fin");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.majuscules(debut, fin);
        super.executer();
    }

    /**
     *
     * @param debut debut a mettre en miniscule
     * @param fin fin a mettre en miniscule
     */
    public void minuscule(int debut, int fin) {
        String texte = this.document.getContentDocument();
        String texteMinuscule = texte.substring(debut, fin).toLowerCase();
        this.document.remplacer(debut, fin, texteMinuscule);
    }

}
