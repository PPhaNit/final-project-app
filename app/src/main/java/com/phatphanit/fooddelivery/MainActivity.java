package com.phatphanit.fooddelivery;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.phatphanit.fooddelivery.adapter.AsiaFoodAdapter;
import com.phatphanit.fooddelivery.adapter.PopularFoodAdapter;
import com.phatphanit.fooddelivery.model.AsiaFood;
import com.phatphanit.fooddelivery.model.PopularFood;
import com.phatphanit.fooddelivery.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler, asiaRecycler;
    PopularFoodAdapter popularFoodAdapter;
    AsiaFoodAdapter asiaFoodAdapter; // Changed AssertionError to AsiaFoodAdapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // now here we will add some dummy data to our model class

        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Khmer Noolde", "$1.50", R.drawable.noodle));
        popularFoodList.add(new PopularFood("Chicken Drumstick", "$17.05", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka Stick", "$25.05", R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Float Cake Vietnam", "$7.05", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Chicken Drumstick", "$17.05", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka Stick", "$25.05", R.drawable.popularfood3));

        setPopularRecycler(popularFoodList);

        List<AsiaFood> asiaFoodList = new ArrayList<>();
        asiaFoodList.add(new AsiaFood("Chicago Pizza", "$20", R.drawable.asiafood1, "4.5", "Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Strawberry Cake", "$25", R.drawable.asiafood2, "4.2", "Friends Restaurant"));
        asiaFoodList.add(new AsiaFood("Chicago Pizza", "$20", R.drawable.asiafood1, "4.5", "Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Strawberry Cake", "$25", R.drawable.asiafood2, "4.2", "Friends Restaurant"));
        asiaFoodList.add(new AsiaFood("Chicago Pizza", "$20", R.drawable.asiafood1, "4.5", "Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Strawberry Cake", "$25", R.drawable.asiafood2, "4.2", "Friends Restaurant"));

        setAsiaRecycler(asiaFoodList);
    }

    private void setPopularRecycler(List<PopularFood> popularFoodList) {
        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }

    private void setAsiaRecycler(List<AsiaFood> asiaFoodList) {
        asiaRecycler = findViewById(R.id.asia_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        asiaRecycler.setLayoutManager(layoutManager);
        asiaFoodAdapter = new AsiaFoodAdapter(this, asiaFoodList);
        asiaRecycler.setAdapter(asiaFoodAdapter);
    }
}
