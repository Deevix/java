public class Deposant extends Personne
{
    protected String civlite;
    protected String mail;
    protected Adresse adresse;

    public Deposant(String pNom, String pPrenom, String pCivlite, String pMail, Adresse pAdresse)
    {
        super(pNom, pPrenom);
        civlite = pCivlite;
        mail = pMail;
        adresse = pAdresse;
    }

    @Override
    public String toString() {
        return "Deposant{" +
                "civlite='" + civlite + '\'' +
                ", mail='" + mail + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

}
