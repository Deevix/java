import java.util.SplittableRandom;

public class Categorie
{
    private int codeCategorie;
    private String nomCategorie;

    public Categorie(int pCodeCategorie, String pNomCategorie)
    {
        codeCategorie = pCodeCategorie;
        nomCategorie = pNomCategorie;
    }

    public int getCodeCategorie()
    {
        return codeCategorie;
    }

    public void setCodeCategorie(int pCodeCategorie)
    {
        codeCategorie = pCodeCategorie;
    }

    public String getNomCategorie()
    {
        return nomCategorie;
    }

    public void setNomCategorie(String pNomCategorie)
    {
        nomCategorie = pNomCategorie;
    }
}
