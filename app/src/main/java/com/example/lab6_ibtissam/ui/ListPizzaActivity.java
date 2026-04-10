package com.example.lab6_ibtissam.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.example.lab6_ibtissam.R;
import com.example.lab6_ibtissam.adapter.PizzaAdapter;
import com.example.lab6_ibtissam.classes.Produit;
import com.example.lab6_ibtissam.service.ProduitService;
import java.util.List;

public class ListPizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_list_pizza);

        ListView lv = findViewById(R.id.lvPizzas);
        List<Produit> pizzas = ProduitService.getInstance().findAll();

        lv.setAdapter(new PizzaAdapter(this, pizzas));

        lv.setOnItemClickListener((parent, view, pos, id) -> {
            Intent it = new Intent(this, PizzaDetailActivity.class);
            it.putExtra("pizza_id", id);
            startActivity(it);
        });
    }
}