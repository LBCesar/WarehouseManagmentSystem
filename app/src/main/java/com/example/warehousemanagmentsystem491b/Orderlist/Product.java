package com.example.warehousemanagmentsystem491b.Orderlist;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.warehousemanagmentsystem491b.R;

public class Product extends AppCompatActivity {

    // Member variable for holding the quantity
    private int quantity;

    // Member variables for ...
    private EditText quantityText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_product);

        quantityText = (EditText) findViewById(R.id.product_quantity);

    }

    /**
     * Method that handles the onClick of decreasing the quantity
     */
    public void decreaseQuantity(View view) {
        quantity = Integer.parseInt(quantityText.getText().toString());
        quantity--;
        quantityText.setText(String.valueOf(quantity));

        /*
        int viewID = view.getId();
        quantity = Integer.parseInt(quantityText.getText().toString());
        switch (viewID){
            case R.id.image_minus:
                quantity--;
                quantityText.setText(String.valueOf(quantity));
        }
        */
    }

    /**
     * Method that handles the onClick of increases the quantity
     */
    public void increaseQuantity(View view) {
        quantity = Integer.parseInt(quantityText.getText().toString());
        quantity++;
        quantityText.setText(String.valueOf(quantity));
    }

}

