package fr.iut.editeur.commande;/*Dans l’application récupérée, ajoutez une commande inserer qui permet d’insérer une chaîne de caractères à partir d’un index donné. Par exemple :

 ajouter;bonjour monde
 bonjour monde
 inserer;6; le
 bonjour le monde*/


import fr.iut.editeur.commande.CommandeDocument;
import fr.iut.editeur.document.Document;

public class CommandeInserer implements Commande{

    protected Document document;

    protected String[]parameters;

    public CommandeInserer(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : inserer;index;texte");
            return;
        }
        int index = Integer.parseInt(parameters[1]);
        String texte = parameters[2];
       /* this.document.inserer(index, texte);
        super.executer();*/
    }
}