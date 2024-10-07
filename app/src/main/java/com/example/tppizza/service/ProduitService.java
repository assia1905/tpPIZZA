package com.example.tppizza.service;

import com.example.tppizza.R;
import com.example.tppizza.classes.Produit;

import java.util.ArrayList;
import java.util.List;

public class ProduitService {
    private List<Produit> produitList;

    public ProduitService() {
        produitList = new ArrayList<>();
        loadProduits(); // Charger les produits
    }

    // Charger les produits par défaut
    private void loadProduits() {
        produitList.add(new Produit("Margherita", 4, R.drawable.pizza1, "20 min", "Tomate, Fromage, Basilic", "Cuire au four pendant 15 minutes.", "Instructions de préparation ici."));
        produitList.add(new Produit("Pepperoni", 5, R.drawable.pizza2, "25 min", "Tomate, Fromage, Pepperoni", "Cuire au four pendant 20 minutes.", "Instructions de préparation ici."));
        produitList.add(new Produit("BBQ Chicken", 6, R.drawable.pizza3, "30 min", "Sauce BBQ, Poulet, Fromage", "Cuire au four pendant 20 minutes.", "Instructions de préparation ici."));
        produitList.add(new Produit("Végétarienne", 5, R.drawable.pizza4, "25 min", "Tomates, Poivrons, Olives, Fromage", "Cuire au four pendant 15 minutes.", "Instructions de préparation ici."));
        produitList.add(new Produit("Hawaïenne", 6, R.drawable.pizza5, "30 min", "Jambon, Ananas, Fromage", "Cuire au four pendant 20 minutes.", "Instructions de préparation ici."));
        produitList.add(new Produit("Meat Lover's", 7, R.drawable.pizza6, "35 min", "Pepperoni, Saucisse, Bacon", "Cuire au four pendant 25 minutes.", "Instructions de préparation ici."));
        produitList.add(new Produit("Épinards et Feta", 5, R.drawable.pizza7, "25 min", "Épinards, Fromage Feta", "Cuire au four pendant 15 minutes.", "Instructions de préparation ici."));
        produitList.add(new Produit("Buffalo Chicken", 6, R.drawable.pizza8, "30 min", "Sauce Buffalo, Poulet, Fromage", "Cuire au four pendant 20 minutes.", "Instructions de préparation ici."));
        produitList.add(new Produit("Quatre Fromages", 4, R.drawable.pizza9, "20 min", "Mozzarella, Cheddar, Parmesan, Gorgonzola", "Cuire au four pendant 15 minutes.", "Instructions de préparation ici."));
        produitList.add(new Produit("Végétarienne au Pesto", 5, R.drawable.pizza10, "25 min", "Sauce Pesto, Légumes, Fromage", "Cuire au four pendant 15 minutes.", "Instructions de préparation ici."));
    }

    // Retourner tous les produits
    public List<Produit> findAll() {
        return new ArrayList<>(produitList);
    }
}

