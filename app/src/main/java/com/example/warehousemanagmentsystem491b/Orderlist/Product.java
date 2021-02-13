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

        final EditText editProductName = (EditText) findViewById(R.id.orderlist_product_name_edit_text);
        final EditText editProductID = (EditText) findViewById(R.id.orderlist_product_id_edit_text);
        final EditText editProductPrice = (EditText) findViewById(R.id.orderlist_product_price_edit_text);
        final EditText editProductDescription = (EditText) findViewById(R.id.orderlist_product_description_edit_text);

        // Placeholder for Product Name
        editProductName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    editProductName.setHint("Ex: Water");
                } else {
                    editProductName.setHint("");
                }
            }

        });

        // Placeholder for Product ID
        editProductID.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    editProductID.setHint("Ex: 1023");
                } else {
                    editProductID.setHint("");
                }
            }

        });

        // Placeholder for Product ID
        // TODO ADD PREFIX "$"
        editProductPrice.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    editProductPrice.setHint("Ex: 69.69");
                } else {
                    editProductPrice.setHint("");
                }
            }

        });

        // Placeholder for Product Description
        editProductDescription.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    editProductDescription.setHint("Ex: This is a Acqua di Cristallo Tributo ");
                } else {
                    editProductDescription.setHint("");
                }
            }

        });
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

/*
     Website Referenced:
         - https://stackoverflow.com/questions/44164170/android-edittext-with-different-floating-label-and-placeholder/44165904
 */
