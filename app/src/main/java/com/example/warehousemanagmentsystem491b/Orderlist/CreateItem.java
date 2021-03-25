package com.example.warehousemanagmentsystem491b.Orderlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.warehousemanagmentsystem491b.Item;
import com.example.warehousemanagmentsystem491b.R;

public class CreateItem extends AppCompatActivity {

    // Member variables for creating a new item
    private EditText editProductName;
    private EditText editProductID;
    private EditText editProductPrice;
    private EditText editProductDescription;
    private EditText editProductQuantity;
    private int quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_product);

        editProductName = findViewById(R.id.orderlist_product_name_edit_text);
        editProductID = findViewById(R.id.orderlist_product_id_edit_text);
        editProductPrice = findViewById(R.id.orderlist_product_price_edit_text);
        editProductDescription = findViewById(R.id.orderlist_product_description_edit_text);
        editProductQuantity = findViewById(R.id.orderlist_product_quantity_edit_text);

        initialValueTextField(editProductName, "Ex: Water");
        initialValueTextField(editProductID, "Ex: 1101");
        initialValueTextField(editProductPrice, "Ex: 29.99");
        initialValueTextField(editProductDescription, "Ex: Item Description");

        Button button = findViewById(R.id.orderlist_addProductButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = Integer.parseInt(editProductID.getText().toString());
                String name = editProductName.getText().toString();
                String descr = editProductDescription.getText().toString();
                double price = Double.parseDouble(editProductPrice.getText().toString());
                int quantity = Integer.parseInt(editProductQuantity.getText().toString());

                Item item = new Item(id, name, descr, price, quantity);

                Intent intent = new Intent();
                intent.putExtra("item", item);
                setResult(RESULT_OK, intent);
                finish();       // finishing activity
            }
        });

    }


    public void initialValueTextField(final EditText editText, final String text) {
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus)
                    editText.setHint(text);
                else
                    editText.setHint("");
            }
        });
    }


    /**
     * Method that handles the onClick of decreasing the quantity
     */
    public void decreaseQuantity(View view) {
        quantity = Integer.parseInt(editProductQuantity.getText().toString());
        if (quantity < 0)
            quantity = 0;
        else
            quantity--;
        editProductQuantity.setText(String.valueOf(quantity));
    }

    /**
     * Method that handles the onClick of increases the quantity
     */
    public void increaseQuantity(View view) {
        quantity = Integer.parseInt(editProductQuantity.getText().toString());
        quantity++;
        editProductQuantity.setText(String.valueOf(quantity));
    }

}

/*
     Website Referenced:
         - https://stackoverflow.com/questions/44164170/android-edittext-with-different-floating-label-and-placeholder/44165904
 */

