package fr.iut.editeur.document;

import java.util.Locale;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }
    public void majuscules(int start, int end) {
        String morceau = texte.substring(start,end);
        String maj = morceau.toUpperCase();
        remplacer(start,end,maj);
    }

    public void clear() {
        texte = ""; // Efface tout le texte
        // Ajoutez ici votre bug intentionnel, par exemple ajouter une lettre.
        texte += "a"; // Bug intentionnel
    }
}
