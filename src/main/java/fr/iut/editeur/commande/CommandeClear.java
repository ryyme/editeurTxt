package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeClear extends CommandeDocument{
    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer(){

        int debut = 0;
        int fin = document.getContentDocument().length();
        String texte = " ";




        this.document.remplacer(debut,fin,texte);
        super.executer();
    }

}
