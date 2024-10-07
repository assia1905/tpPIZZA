package com.example.tppizza.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tppizza.R;
import com.example.tppizza.classes.Produit;

import java.util.List;

public class PizzaAdapter extends ArrayAdapter<Produit> {

    public PizzaAdapter(Context context, List<Produit> pizzas) {
        super(context, 0, pizzas);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Produit pizza = getItem(position); // Obtenir l'élément de pizza

        // Vérifiez si une vue existante est réutilisée, sinon gonflez la vue
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_pizza, parent, false);
        }

        // Récupérer les vues
        ImageView pizzaImage = convertView.findViewById(R.id.pizza_image);
        TextView pizzaName = convertView.findViewById(R.id.pizza_name);
        TextView pizzaDuree = convertView.findViewById(R.id.pizza_duree);
        TextView pizzaNbrIngredients = convertView.findViewById(R.id.pizza_nbr_ingredients);

        // Remplir les vues avec les données de l'objet pizza
        pizzaImage.setImageResource(pizza.getPhoto()); // Définir l'image de la pizza
        pizzaName.setText(pizza.getNom()); // Définir le nom de la pizza
        pizzaDuree.setText("Durée: " + pizza.getDuree()); // Définir la durée
        pizzaNbrIngredients.setText("Ingrédients: " + pizza.getNbrIngredients()); // Définir le nombre d'ingrédients

        return convertView; // Retourner la vue remplie
    }
}
