public class Adresse
{
    public String numero;
    public String voie;
    public String ville;
    public String cp;

    public Adresse(String pNumero, String pVoie, String pVille, String pCp) {
        numero = validate(pNumero, 4);
        voie = validate(pVoie, 40);
        ville = validate(pVille, 20);
        cp = validate(pCp, 5);
    }

    public String validate(String pChaine, int pTaille)
    {
        return pChaine;
    }
}
