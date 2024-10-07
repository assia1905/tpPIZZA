package com.example.tppizza;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tppizza.classes.Produit;
import com.example.tppizza.adapter.PizzaAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView pizzaListView;
    private List<Produit> pizzaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialiser la ListView
        pizzaListView = findViewById(R.id.activity_list_pizza);

        // Créer la liste de pizzas (exemple)
        pizzaList = getPizzaList();

        // Créer et définir l'adaptateur
        PizzaAdapter adapter = new PizzaAdapter(this, pizzaList);
        pizzaListView.setAdapter(adapter);

        // Gérer les clics sur les éléments de la liste
        pizzaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                Produit selectedPizza = pizzaList.get(position);
                openPizzaDetailActivity(selectedPizza); // Ouvrir l'activité de détails
            }
        });
    }

    // Méthode pour ouvrir l'activité de détail de la pizza
    private void openPizzaDetailActivity(Produit pizza) {
        Intent intent = new Intent(this, PizzaDetailActivity.class);
        intent.putExtra(PizzaDetailActivity.EXTRA_PIZZA_NAME, pizza.getNom());
        intent.putExtra(PizzaDetailActivity.EXTRA_PIZZA_DESCRIPTION, pizza.getDescription()); // Description de la pizza
        intent.putExtra(PizzaDetailActivity.EXTRA_PIZZA_INGREDIENTS, pizza.getDetaisIngred()); // Ingrédients
        intent.putExtra(PizzaDetailActivity.EXTRA_PIZZA_PREPARATION, pizza.getPreparation()); // Préparation
        intent.putExtra(PizzaDetailActivity.EXTRA_PIZZA_DUREE, pizza.getDuree()); // Durée
        intent.putExtra(PizzaDetailActivity.EXTRA_PIZZA_NBR_INGREDIENTS, pizza.getNbrIngredients()); // Nombre d'ingrédients
        intent.putExtra(PizzaDetailActivity.EXTRA_PIZZA_IMAGE, pizza.getPhoto()); // Image
        startActivity(intent);
    }

    // Méthode pour créer une liste de pizzas (exemple)
    private List<Produit> getPizzaList() {
        List<Produit> pizzas = new ArrayList<>();

        // Ajout de 10 pizzas avec des détails différents
        pizzas.add(new Produit("Margherita", 3, R.drawable.pizza1, "15 min",
                "Tomates, Fromage, Basilic", "Une pizza classique à base de tomate et fromage.",
                "Cuire au four à 200°C pendant 15 minutes."));

        pizzas.add(new Produit("Pepperoni", 4, R.drawable.pizza2, "20 min",
                "Tomates, Fromage, Pepperoni", "Une pizza épicée au pepperoni.",
                "Cuire au four à 200°C pendant 20 minutes."));

        pizzas.add(new Produit("Quatre Fromages", 4, R.drawable.pizza3, "18 min",
                "Mozzarella, Gorgonzola, Parmesan, Emmental", "Un mélange crémeux de quatre fromages.",
                "Cuire au four à 200°C pendant 18 minutes."));

        pizzas.add(new Produit("Hawaïenne", 5, R.drawable.pizza4, "17 min",
                "Ananas, Jambon, Fromage", "Une pizza sucrée et salée à base d'ananas.",
                "Cuire au four à 200°C pendant 17 minutes."));

        pizzas.add(new Produit("Végétarienne", 5, R.drawable.pizza5, "16 min",
                "Tomates, Poivrons, Olives, Fromage", "Une pizza colorée et riche en légumes.",
                "Cuire au four à 200°C pendant 16 minutes."));

        pizzas.add(new Produit("Mexicaine", 6, R.drawable.pizza6, "22 min",
                "Haricots, Piments, Fromage, Maïs", "Une pizza épicée inspirée de la cuisine mexicaine.",
                "Cuire au four à 200°C pendant 22 minutes."));

        pizzas.add(new Produit("Carbonara", 4, R.drawable.pizza7, "19 min",
                "Crème, Lardons, Fromage", "Une pizza riche à base de crème et de lardons.",
                "Cuire au four à 200°C pendant 19 minutes."));

        pizzas.add(new Produit("Fruits de Mer", 5, R.drawable.pizza8, "20 min",
                "Crevettes, Moules, Calmars, Fromage", "Une pizza raffinée aux fruits de mer.",
                "Cuire au four à 200°C pendant 20 minutes."));

        pizzas.add(new Produit("Napolitaine", 3, R.drawable.pizza9, "14 min",
                "Tomates, Anchois, Olives, Câpres", "Une pizza aux saveurs méditerranéennes.",
                "Cuire au four à 200°C pendant 14 minutes."));

        pizzas.add(new Produit("Diavola", 4, R.drawable.pizza10, "21 min",
                "Salami piquant, Fromage, Tomates", "Une pizza épicée pour les amateurs de salami.",
                "Cuire au four à 200°C pendant 21 minutes."));

        return pizzas;
    }

}
