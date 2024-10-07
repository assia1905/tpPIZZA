package com.example.tppizza.classes;

public class Produit {

    // Champs statiques pour gérer l'auto-incrémentation de l'ID
    private static int idCounter = 0;

    // Champs de la classe
    private int id;
    private String nom;
    private int nbrIngredients;
    private String duree;
    private int photo;
    private String detaisIngred;
    private String description;
    private String preparation;




    // Constructeur de la classe Produit
    public Produit(String nom, int nbrIngredients,  int photo,String duree, String detaisIngred,String description,String preparation) {
        this.id = ++idCounter;  // Auto-incrémentation de l'ID
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detaisIngred = detaisIngred;
        this.description=description;
        this.preparation = preparation;

    }

    // Getters
    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getDetaisIngred() { return detaisIngred; }
    public String getPreparation() { return preparation; }
    public String getDuree() { return duree; }
    public int getNbrIngredients() { return nbrIngredients; }
    public int getPhoto() { return photo; }
    public String getDescription(){return description;}

    // toString() pour afficher les détails du produit
    @Override
    public String toString() {
        return   "Nom: " + nom + "\nDurée: " + duree + "\nNombre d'ingrédients: " + nbrIngredients;
    }
}
