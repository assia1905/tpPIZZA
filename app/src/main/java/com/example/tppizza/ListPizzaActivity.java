package com.example.tppizza;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tppizza.adapter.PizzaAdapter;
import com.example.tppizza.classes.Produit;
import com.example.tppizza.service.ProduitService;

import java.util.List;

public class ListPizzaActivity extends AppCompatActivity {

    private ListView pizzaListView;
    private ProduitService produitService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);

        // Initialiser la ListView
        pizzaListView = findViewById(R.id.activity_list_pizza);

        // Initialiser le service pour récupérer les produits
        produitService = new ProduitService(); // Initialiser le service

        // Récupérer la liste des pizzas
        List<Produit> pizzaList = produitService.findAll();

        // Définir l'adaptateur pour la ListView
        PizzaAdapter adapter = new PizzaAdapter(this, pizzaList);
        pizzaListView.setAdapter(adapter);

        // Gérer les clics sur les éléments de la liste
        pizzaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                Produit selectedPizza = pizzaList.get(position);
                openPizzaDetailActivity(selectedPizza); // Ouvrir l'activité de détail pour la pizza sélectionnée
            }
        });
    }

    // Méthode pour ouvrir l'activité de détail de la pizza
    private void openPizzaDetailActivity(Produit pizza) {
        Intent intent = new Intent(this, PizzaDetailActivity.class);
        intent.putExtra(PizzaDetailActivity.EXTRA_PIZZA_NAME, pizza.getNom());
        intent.putExtra(PizzaDetailActivity.EXTRA_PIZZA_INGREDIENTS, pizza.getDetaisIngred());
        intent.putExtra(PizzaDetailActivity.EXTRA_PIZZA_PREPARATION, pizza.getPreparation());
        intent.putExtra(PizzaDetailActivity.EXTRA_PIZZA_DUREE, pizza.getDuree());
        intent.putExtra(PizzaDetailActivity.EXTRA_PIZZA_IMAGE, pizza.getPhoto());
        intent.putExtra(PizzaDetailActivity.EXTRA_PIZZA_NBR_INGREDIENTS, pizza.getNbrIngredients()); // Nombre d'ingrédients
        startActivity(intent);
    }


}
