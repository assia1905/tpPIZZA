package com.example.tppizza;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PizzaDetailActivity extends AppCompatActivity {

    public static final String EXTRA_PIZZA_NAME = "extra_pizza_name";
    public static final String EXTRA_PIZZA_INGREDIENTS = "extra_pizza_ingredients";
    public static final String EXTRA_PIZZA_DESCRIPTION = "extra_pizza_description";
    public static final String EXTRA_PIZZA_PREPARATION = "extra_pizza_preparation";
    public static final String EXTRA_PIZZA_DUREE = "extra_pizza_duree";
    public static final String EXTRA_PIZZA_IMAGE = "extra_pizza_image";
    public static final String EXTRA_PIZZA_NBR_INGREDIENTS = "extra_pizza_nbr_ingredients";

    private ImageView pizzaImage;
    private TextView pizzaName;
    private TextView pizzaIngredientsContent;
    private TextView pizzaPreparationContent;
    private TextView pizzaDureeContent;
    private TextView pizzaNbrIngredientsContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        // Récupérer les vues
        pizzaImage = findViewById(R.id.pizza_detail_image);
        pizzaName = findViewById(R.id.pizza_detail_name);
        pizzaIngredientsContent = findViewById(R.id.pizza_detail_ingredients_content);
        pizzaPreparationContent = findViewById(R.id.pizza_detail_preparation_content);
        pizzaDureeContent = findViewById(R.id.pizza_detail_duree_content);
        pizzaNbrIngredientsContent = findViewById(R.id.pizza_detail_nbr_ingredients_content);

        // Récupérer les extras passés via l'intent
        Intent intent = getIntent();
        String name = intent.getStringExtra(EXTRA_PIZZA_NAME);
        String ingredients = intent.getStringExtra(EXTRA_PIZZA_INGREDIENTS);
        String description = intent.getStringExtra(EXTRA_PIZZA_DESCRIPTION);
        String preparation = intent.getStringExtra(EXTRA_PIZZA_PREPARATION);
        String duree = intent.getStringExtra(EXTRA_PIZZA_DUREE);
        int imageResource = intent.getIntExtra(EXTRA_PIZZA_IMAGE, 0);
        int nbrIngredients = intent.getIntExtra(EXTRA_PIZZA_NBR_INGREDIENTS, 0); // Récupérer le nombre d'ingrédients

        // Définir les données dans les vues
        pizzaName.setText(name);
        pizzaIngredientsContent.setText(ingredients);
        pizzaPreparationContent.setText(preparation);
        pizzaDureeContent.setText(duree);
        pizzaNbrIngredientsContent.setText("Nombre d'ingrédients: " + nbrIngredients); // Afficher le nombre d'ingrédients
        pizzaImage.setImageResource(imageResource); // Définir l'image de la pizza
    }
}
