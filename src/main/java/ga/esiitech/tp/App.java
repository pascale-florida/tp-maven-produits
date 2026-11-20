package ga.esiitech.tp;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Product clavier = new Product("Clavier", 15000, 3);
        System.out.println(clavier);
        System.out.println("Valeur du stock : " + clavier.getStockValue() + " FCFA");

        Gson gson = new Gson();
        String json = gson.toJson(clavier);
        System.out.println("En JSON : " + json);

        // Bonus 1 : un deuxième produit
        Product souris = new Product("Souris", 5000, 10);
        System.out.println(souris);
        System.out.println("Valeur du stock : " + souris.getStockValue() + " FCFA");

        // Bonus 4 : une liste de produits et la valeur totale du stock
        List<Product> produits = new ArrayList<>();
        produits.add(clavier);
        produits.add(souris);

        int valeurTotale = 0;
        for (Product p : produits) {
            valeurTotale += p.getStockValue();
        }
        System.out.println("Valeur totale du stock : " + valeurTotale + " FCFA");
    }
}
