import java.util.ArrayList;

public class Traitement
{
    public static void main(String[] args)
    {
        Produit monProduit = new Produit(123, "tagliatelles", 100);
        Categorie maCategorie = new Categorie(257, "alimentaire");
        ArrayList<Produit> mesProduits = new ArrayList<Produit>();
        ArrayList<Categorie> mesCategories = new ArrayList<Categorie>();
        mesProduits.add(monProduit);
        mesCategories.add(maCategorie);
    }
}
