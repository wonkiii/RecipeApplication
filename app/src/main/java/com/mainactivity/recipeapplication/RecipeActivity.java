package com.mainactivity.recipeapplication;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    //initialize
    private TextView zRecipeName;
    private TextView zRecipeIngredients;
    private TextView zRecipeMethodTitle;
    private TextView zRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        //find
        zRecipeName = (TextView)findViewById(R.id.text_recipe);
        zRecipeIngredients = (TextView)findViewById(R.id.ingredients);
        zRecipeMethodTitle = (TextView)findViewById(R.id.method);
        zRecipe = (TextView)findViewById(R.id.recipe);

        //get the data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("RecipeName");
        String Ingredients = intent.getExtras().getString("RecipeIngredients");
        String MethodTitle = intent.getExtras().getString("RecipeMethodTitle");
        String Recipe = intent.getExtras().getString("Recipe");

        //set the data
        zRecipeName.setText(Title);
        zRecipeIngredients.setText(Ingredients);
        zRecipeMethodTitle.setText(MethodTitle);
        zRecipe.setText(Recipe);

    }

    //back btn
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
