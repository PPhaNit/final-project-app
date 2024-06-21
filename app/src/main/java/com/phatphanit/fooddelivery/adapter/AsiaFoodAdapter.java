package com.phatphanit.fooddelivery.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.phatphanit.fooddelivery.R;
import com.phatphanit.fooddelivery.model.AsiaFood;

import java.util.List;

public class AsiaFoodAdapter extends RecyclerView.Adapter<AsiaFoodAdapter.AsiaFoodViewHolder> {

    Context context;
    List<AsiaFood> asiaFoodList;

    public AsiaFoodAdapter(Context context, List<AsiaFood> asiaFoodList) {
        this.context = context;
        this.asiaFoodList = asiaFoodList;
    }

    @NonNull
    @Override
    public AsiaFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.asia_food_row_item, parent, false);
        return new AsiaFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AsiaFoodViewHolder holder, int position) {
        AsiaFood asiaFood = asiaFoodList.get(position);
        holder.foodImage.setImageResource(asiaFood.getImageUrl());
        holder.name.setText(asiaFood.getName());
        holder.price.setText(asiaFood.getPrice());
        holder.rating.setText(asiaFood.getRating());
        holder.restorantName.setText(asiaFood.getRestorantname());
    }

    @Override
    public int getItemCount() {
        return asiaFoodList.size();
    }

    public static final class AsiaFoodViewHolder extends RecyclerView.ViewHolder {
        ImageView foodImage;
        TextView price, name, rating, restorantName;

        public AsiaFoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.price);
            name = itemView.findViewById(R.id.name);
            rating = itemView.findViewById(R.id.rating);
            restorantName = itemView.findViewById(R.id.restorant_name);
        }
    }
}
