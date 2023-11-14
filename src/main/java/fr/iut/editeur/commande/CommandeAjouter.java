package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * execute la commande ajoouter
 */
public class CommandeAjouter extends CommandeDocument {

    /**
     *
     * @param document docu utilise
     * @param parameters commande rentere avec param
     */
    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

}
