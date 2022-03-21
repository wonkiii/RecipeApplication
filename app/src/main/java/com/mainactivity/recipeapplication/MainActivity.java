package com.mainactivity.recipeapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Sinigang na Hipon", "2 pounds Shrimps\n" +
                "2 pieces Radishes orLabanos, sliced\n" +
                "1 bunch Water Spinach or Kangkong leaves\n" +
                "5-8 pieces Long String Beans or Sitaw, cut in 2 inches length\n" +
                "3 Long Green Pepper or Siling Pang-sigang, cut in half\n" +
                "2 Knorr Shrimp Broth Cubes\n" +
                "1 pack Sinigang Mix\n" +
                "2 pieces Tomatoes, quartered\n" +
                "1 medium Onion, sliced\n" +
                "1 tablespoon Fish Sauce(Patis)\n" +
                "1 teaspoon Pepper\n" +
                "6 – 8 cups water","Cooking Procedure","Put together in a deep pan onion, tomato, radishes, string beans, shrimp cubes, water and sinigang mix. Bring to a boil.\n" +
                "Turn the heat down and simmer until the radishes and the string beans are cooked.\n" +
                "Add the shrimp and green pepper and cook for 5 minutes.\n" +
                "Turn the heat off and add the water spinach.\n" +
                "Serve hot with rice.",R.drawable.sinigang));

        recipes1.add(new Recipes("Creamy Sweet Chicken Adobo", "1 whole Garlic (minced)\n" +
                "1 Onion (medium – minced)\n" +
                "1/2 kg Chicken\n" +
                "1/2 cup Soy Sauce\n" +
                "1/3 cup Vinegar\n" +
                "1 tsp Black Pepper (whole)\n" +
                "10 pcs of Laurel Leaves\n" +
                "Salt and Pepper to taste\n" +
                "1/4 cup Angel Kremdensada\n","Cooking Procedure","Saute Garlic and Onions\n" +
                "Add Chicken, saute until brown\n" +
                "On a separate container, mix Vinegar, Soy Sauce, Pepper(whole)\n" +
                "Add the mixture to pan, simmer for 15 mins\n" +
                "Salt and Pepper to taste depending on your preference\n" +
                "If Chicken is ready, add the Angel Kremdensada then simmer for 2-3 mins.\n" +
                "Add boiled egg (optional)\n" +
                "Serve.",R.drawable.adobo));

        recipes1.add(new Recipes("Pork Sisig", "1 pound or 450 grams pork belly\n" +
                "2 tbsp or 30ml vegetable oil like Canola\n" +
                "16.9oz or 500 ml pinealpple juice\n" +
                "16.9oz or 500 ml water\n" +
                "1 tbsp or 15g  of butter (unsalted)\n" +
                "4 pcs chicken liver\n" +
                "1 red onion, chopped\n" +
                "1 tbsp or 1 red or green chilies, minced\n" +
                "2 tbsp or 30ml of calamansi juice or ½ lemon or lime juice\n" +
                "½ tbsp or 8ml of soy sauce\n" +
                "Salt & pepper to taste","Cooking Procedure","Combine water with the pineapple juice and pour into a pot. Boil the pork belly in the liquid, until tender (about 30 min) Set aside and let it dry. \n" +
                "Grill or pan fry the pork belly until the skin turns crispy and golden brown. Chop into small pieces and set aside.\n" +
                "Heat oil in a skillet and pan fry the chicken liver until cooked through. Chop the liver into small pieces.\n" +
                "In a bowl combine the chopped meat, the onions, lemon juice, soy sauce and chilies. Warm it in a pan with the butter.\n" +
                "Transfer it to a plate or a sizzling plate!", R.drawable.sisig));

        recipes1.add(new Recipes("Laing","2 ounces dried gabi leaves\n" +
                "2 lemongrass stalks\n" +
                "1 tablespoon canola oil\n" +
                "1 onion, peeled and chopped\n" +
                "4 cloves garlic, peeled and minced\n" +
                "1 thumb-size ginger, peeled and minced\n" +
                "1 pound pork belly, diced\n" +
                "pepper to taste\n" +
                "1 tablespoon shrimp paste\n" +
                "4 cups coconut milk\n" +
                "8 Thai chili peppers, chopped\n" +
                "1 cup coconut cream\n" +
                "salt to taste","Cooking Procedure","Go through the dried leaves, and shred into pieces. Inspect for any other stray leaves accidentally mixed in during the drying process and discard.\n" +
                "Remove and discard the dark green layers of the lemongrass until you get to the lighter green part. Using the back of a knife, pound ends of stalks to release flavor and then chop.\n" +
                "In a wide pan over medium heat, heat oil. Add onions, garlic, and ginger and cook, stirring occasionally, until softened and aromatic.\n" +
                "Add pork and cook until lightly browned. Season with pepper to taste.\n" +
                "Add shrimp paste and cook, stirring occasionally, for about 1 to 2 minutes.\n" +
                "Add coconut milk and bring to a simmer.\n" +
                "Add lemongrass and chili peppers.\n" +
                "Add gabi leaves and with the spoon, push down into the liquid until moistened. Do not stir for the first 15 to 20 minutes.\n" +
                "Lower heat, cover, and cook for about 25 to 30 minutes or until pork is fully cooked and leaves have softened.\n" +
                "Add coconut cream and continue to cook for about 10 to 15 minutes or mixture is almost dry and begins to render fat. Season with salt to taste.",R.drawable.laing));

        recipes1.add(new Recipes("Sagot Gulaman","3 cups of brown sugar for syrup\n" +
                "1 cup of brown sugar for sago\n" +
                "3 cups of water\n" +
                "3 cups of tapioca pearls\n" +
                "2 tablespoons of vanilla extract\n" +
                "1 can of grass jelly, cubed\n" +
                "ice","Cooking Procedure","Soak the tapioca pearls in water for at least an hour to soften them.\n" +
                "Drain it then place them in a large pot with 3 cups of the water and 1 cup of brown sugar.\n" +
                "Bring the tapioca pearls to a boil.\n" +
                "Cook until the tapioca pearls become transparent then drain them and set them aside to cool.\n" +
                "In a separate pot add the 2 tbsp of sugar and scorch it, but do not burn it.\n" +
                "Then add the water, vanilla and the remaining sugar.\n" +
                "Bring it to a boil then reduce heat and simmer for 5 minutes.\n" +
                "Make sure that the sugar is totally dissolved, then you have a simple syrup.\n" +
                "Strain the syrup using a cheese cloth or any clean cloth to separate the sand-like grains from the sugar, leaving a clear brown syrup.\n" +
                "Now pour the syrup in glass then add tapioca pearls, cubed grass jelly, water and ice.",R.drawable.gulaman));


        myrecyclerView = (RecyclerView) findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this, recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        myrecyclerView.setAdapter(myAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.maina_ctivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.infos:
                startActivity(new Intent(this, About.class));
        }

        return super.onOptionsItemSelected(item);
    }

//    private void fba(){
//        FloatingActionButton fbaAdd = findViewById(R.id.fbaAdd);
//        fbaAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =  new Intent(MainActivity.this, AddRecipe.class);
//                startActivity(intent);
//            }
//        });
//    }


}