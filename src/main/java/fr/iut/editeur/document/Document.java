package fr.iut.editeur.document;

public class Document {

    private String contentDocument;

    public Document() {
        this.contentDocument = "";
    }
	
    public String getContentDocument() {
        return contentDocument;
    }

    public void setContentDocument(String contentDocument) {
        this.contentDocument = contentDocument;
    }

    public void ajouter(String texte) {
        this.contentDocument += texte;
    }

    @Override
    public String toString() {
        return this.contentDocument;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = contentDocument.substring(0, start);
        String rightPart = contentDocument.substring(end);
        contentDocument = leftPart + remplacement + rightPart;
    }
    public void majuscules(int start, int end) {
        String morceau = contentDocument.substring(start,end);
        String maj = morceau.toUpperCase();
        remplacer(start,end,maj);
    }

    public void clear() {
        contentDocument = ""; // Efface tout le texte
        // Ajoutez ici votre bug intentionnel, par exemple ajouter une lettre.
        contentDocument += "a"; // Bug intentionnel
    }
}  // contentDocument changer
