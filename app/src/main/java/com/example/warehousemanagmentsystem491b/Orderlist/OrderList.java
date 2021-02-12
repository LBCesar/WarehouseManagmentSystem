package com.example.warehousemanagmentsystem491b.Orderlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.warehousemanagmentsystem491b.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class OrderList extends AppCompatActivity {


    // FAB
    TextView addProductTextView;
    private FloatingActionButton fab1_main, fab2_addProduct, fab3;
    private Animation fab_open, fab_close, fab_clock, fab_anticlock;
    Boolean fab1_main_isOpen = false;


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

        // FAB
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);
        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_clock = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_rotate_clock);
        fab_anticlock = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_rotate_anticlock);

        addProductTextView = (TextView) findViewById(R.id.orderlist_addProductText);
        fab1_main = (FloatingActionButton) findViewById(R.id.orderlist_FAB1);
        fab2_addProduct = (FloatingActionButton) findViewById(R.id.orderlist_FAB2);
        fab3 = (FloatingActionButton) findViewById(R.id.orderlist_FAB3);

    }

    public List<String> initializeItem() {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add("Item" + i);
        }
        return data;
    }

    /**
     * Close the main FAB menu
     */
    public void closeFabMenu() {
        addProductTextView.setVisibility(View.INVISIBLE);
        fab2_addProduct.startAnimation(fab_close);
        fab3.startAnimation(fab_close);
        fab1_main.startAnimation(fab_close);
        fab1_main.startAnimation(fab_anticlock);
        fab2_addProduct.setClickable(false);
        fab3.setClickable(false);
        fab1_main_isOpen = false;
    }

    public void fab1_main_onClick(View view) {
        if (fab1_main_isOpen) {
            closeFabMenu();
        } else {
            addProductTextView.setVisibility(View.VISIBLE);
            fab2_addProduct.startAnimation(fab_open);
            fab3.startAnimation(fab_open);
            fab1_main.startAnimation(fab_open);
            fab1_main.startAnimation(fab_clock);
            fab2_addProduct.setClickable(true);
            fab3.setClickable(true);
            fab1_main_isOpen = true;
        }
    }

    public void fab2_addProduct_onClick(View view) {
        closeFabMenu();             // close the FAB menu before going to the next activity
        Intent intentOrderItem = new Intent(this, Product.class);
        startActivity(intentOrderItem);
    }

    public void fab3click(View view) {
        closeFabMenu();             // close the FAB menu before going to the next activity
        displayToast("FAB3 Clicked!");
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



/*
    Resources used:
        RecyclerView: https://stackoverflow.com/questions/40584424/simple-android-recyclerview-example
        Search bar: https://www.journaldev.com/12478/android-searchview-example-tutorial
        FAB tool: https://medium.com/@shubham_nikam/easy-way-to-add-minimal-expandable-floating-action-button-fab-menu-dd8e6e011f52 -> (Used)
                                    OR
                  https://github.com/nambicompany/expandable-fab

 */




