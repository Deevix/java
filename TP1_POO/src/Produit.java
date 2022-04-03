import java.sql.SQLOutput;

public class Produit
{
    private long codeProduit;
    private String nom;
    private int quantite;
    private float prix;
    private int stockSecu;
    private Categorie categorie;

    public Produit(long pCodeProduit, String pNom, int pQuantite, float pPrix, int pStock, Categorie pCategorie)
    {
        codeProduit = pCodeProduit;
        nom = pNom;
        quantite = pQuantite;
        prix = pPrix;
        stockSecu = pStock;
        categorie = pCategorie;
    }

    public Produit(long pCodeProduit, String pNom, int pQuantite)
    {
        codeProduit = pCodeProduit;
        nom = pNom;
        quantite = pQuantite;
    }

    public void setQuantiteUp(int pQuantite) {
        quantite += pQuantite;
    }

    public void setQuantiteDown(int pQuantite)
    {
        if(valideCommande(pQuantite))
            quantite -= pQuantite;
        else
            System.out.println("Commande impossible, stock insuffisant");
        alerteQte();
    }

    public void alerteQte()
    {
        if(quantite <= stockSecu)
            System.out.println("Stock de sécutité atteint, faut commander");
    }

    public boolean valideCommande(int pQuantite)
    {
        if(quantite - pQuantite < stockSecu)
            return false;
        else
            return true;
    }

    public int getQuantite()
    {
        return quantite;
    }

    @Override
    public String toString()
    {
        return "Produit{" +
                "codeProduit=" + codeProduit +
                ", nom='" + nom + '\'' +
                ", quantite=" + quantite +
                ", prix=" + prix +
                ", stock=" + stockSecu +
                '}';
    }
}
