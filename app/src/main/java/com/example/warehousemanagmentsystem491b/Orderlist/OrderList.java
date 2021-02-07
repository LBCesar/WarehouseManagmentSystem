package com.example.warehousemanagmentsystem491b.Orderlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.warehousemanagmentsystem491b.R;

import java.util.ArrayList;
import java.util.List;

public class OrderList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list);

        // Initialize items
        // initializeItem();

        RecyclerView recyclerView = findViewById(R.id.rv_itemDisplay);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItemAdapter(initializeItem()));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

    }

    public List<String> initializeItem() {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add("Item" + i);
        }
        return data;
    }

    public void addNewProduct(View view) {
        Intent intentOrderItem = new Intent(this, Product.class);
        startActivity(intentOrderItem);
    }

}


// RecyclerView: https://stackoverflow.com/questions/40584424/simple-android-recyclerview-example


