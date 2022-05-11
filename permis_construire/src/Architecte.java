public class Architecte extends Personne
{
     protected String conseilRegional;
     protected Adresse adresse;
     protected String telephone;
     protected boolean inscriptionOrdre;

    public Architecte(String pNom, String pPrenom, String pConseilRegional, Adresse pAdresse, String pTelephone, boolean pOrdre) {
        super(pNom, pPrenom);
        conseilRegional = pConseilRegional;
        adresse = pAdresse;
        if (telephoneValide(pTelephone))
            telephone = pTelephone;
        else
            telephone = "";

        inscriptionOrdre = pOrdre;

        majConseilRegional();
    }

    @Override
    public String toString() {
        return "Architecte{" +
                "conseilRegional='" + conseilRegional + '\'' +
                ", adresse=" + adresse +
                ", telephone='" + telephone + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    private boolean telephoneValide(String telephone)
    {
        if(telephone.length() == 10)
            return true;
        else
            return false;
    }

    private String majConseilRegional()
    {
        if(inscriptionOrdre)
            return(nom + prenom + conseilRegional + telephone + "inscrit");
        else
            return(nom + prenom + conseilRegional + telephone + "non inscrit");
    }
}
