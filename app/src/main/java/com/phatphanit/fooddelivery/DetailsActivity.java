package com.phatphanit.fooddelivery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.phatphanit.fooddelivery.activities.LoginActivity;
import com.phatphanit.fooddelivery.activities.RegistrationActivity;

public class DetailsActivity extends AppCompatActivity {

    private ImageView backButton, shareButton, foodImage, tagFreeImage, decrementButton, incrementButton, addToCartButton;
    private TextView rating, savedCount, orderCount, foodType, foodName, foodDescription, quantity, price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Initialize all the views
        backButton = findViewById(R.id.imageView5);
        shareButton = findViewById(R.id.imageView6);
        foodImage = findViewById(R.id.imageView8);
        rating = findViewById(R.id.textView3);
        savedCount = findViewById(R.id.textView5);
        orderCount = findViewById(R.id.textView6);
        foodType = findViewById(R.id.textView10);
        foodName = findViewById(R.id.textView11);
        tagFreeImage = findViewById(R.id.imageView9);
        foodDescription = findViewById(R.id.textView12);
        decrementButton = findViewById(R.id.imageView10);
        quantity = findViewById(R.id.textView13);
        incrementButton = findViewById(R.id.imageView11);
        price = findViewById(R.id.textView14);
        addToCartButton = findViewById(R.id.imageView12);

        // Set up click listeners
        backButton.setOnClickListener(view -> finish()); // Closes the activity when the back button is pressed
        shareButton.setOnClickListener(view -> shareFoodDetails());
        decrementButton.setOnClickListener(view -> updateQuantity(false));
        incrementButton.setOnClickListener(view -> updateQuantity(true));
        addToCartButton.setOnClickListener(view -> handleAddToCart());
    }

    private void shareFoodDetails() {
        // Implement the logic to share food details
    }

    private void updateQuantity(boolean increment) {
        int currentQuantity = Integer.parseInt(quantity.getText().toString());
        if (increment) {
            currentQuantity++;
        } else {
            if (currentQuantity > 1) {
                currentQuantity--;
            }
        }
        quantity.setText(String.valueOf(currentQuantity));
        // You can also update the price based on the quantity if needed
    }

    private void handleAddToCart() {
        // Check if user is logged in
        boolean isLoggedIn = checkIfUserIsLoggedIn();

        if (!isLoggedIn) {
            // Show login prompt
            showLoginPrompt();
        } else {
            // Add to cart logic here
            addToCart();
        }
    }

    private boolean checkIfUserIsLoggedIn() {
        // Replace with your actual logic to check if user is logged in
        // For example, check shared preferences or a session manager
        return false;
    }

    private void showLoginPrompt() {
        // Navigate to LoginActivity
        Intent intent = new Intent(DetailsActivity.this, RegistrationActivity.class);
        startActivity(intent);
    }

    private void addToCart() {
        // Your add to cart logic here
    }
}
