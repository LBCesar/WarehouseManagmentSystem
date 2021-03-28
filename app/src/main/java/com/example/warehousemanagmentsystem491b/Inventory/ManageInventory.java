package com.example.warehousemanagmentsystem491b.Inventory;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.warehousemanagmentsystem491b.Item;
import com.example.warehousemanagmentsystem491b.R;

import java.util.ArrayList;
import java.util.List;

public class ManageInventory extends AppCompatActivity {

    private List<Item> inventoryList;
    private RecyclerView recyclerView;
    private InventoryAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_inventory);

        inventoryList = new ArrayList<>();
        initializeList();
        inventoryList.add(new Item(101, "Coke", "Coke", 49.99, 40));

        recyclerView = findViewById(R.id.manageInventory_recyclerView); // rv_itemDisplay
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new InventoryAdapter(inventoryList);
        recyclerView.setAdapter(mAdapter);

    }

    public void initializeList() {
        inventoryList.add(new Item(101, "Coke", "Coke", 49.99, 40));
        inventoryList.add(new Item(102, "Cheese", "Coke", 67.23, 25));
        inventoryList.add(new Item(103, "Bread", "Coke", 12.59, 65));
        inventoryList.add(new Item(104, "Egg", "Coke", 19.99, 79));
        inventoryList.add(new Item(105, "Ham", "Coke", 45.65, 48));
        inventoryList.add(new Item(106, "Spinach", "Coke", 48.65, 70));
        inventoryList.add(new Item(107, "Garlic", "Coke", 78.99, 56));
        inventoryList.add(new Item(108, "Weed", "Coke", 1.99, 555));
        inventoryList.add(new Item(109, "Raspberry", "Coke", 98.49, 5));
        inventoryList.add(new Item(110, "Apple", "Coke", 150.46, 1));
    }


    /**
     * Displays a Toast with the message.
     *
     * @param message Message to display
     */
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }


}
