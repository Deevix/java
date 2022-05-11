public class Personne
{
    protected String nom;
    protected String prenom;

    public Personne(String pNom, String pPrenom) {
        nom = validate(pNom, 20);
        prenom = validate(pPrenom, 20);
    }

    protected String validate(String pChaine, int pTaille)
    {
        if(pChaine.length() <= pTaille)
            return pChaine;
        else
            return pChaine.substring(0, pTaille);
    }

    public String toString()
    {
        return (nom + " " + prenom);
    }
}
