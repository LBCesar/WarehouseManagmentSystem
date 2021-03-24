package com.example.warehousemanagmentsystem491b.Employee;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.warehousemanagmentsystem491b.Orderlist.OrderList;
import com.example.warehousemanagmentsystem491b.Profile.Profile;
import com.example.warehousemanagmentsystem491b.R;

public class EmployeeMenu extends AppCompatActivity {

    private ListView employeeMenu_listView;
    private Toolbar employee_toolbar;

    private final String[] employeeMenu = {
            "Manage Inventory",
            "Ordering List",
            "Shift Management",
            "Suppliers",
            "Customers"
    };

    private int[] employeeMenuImage = {
            R.drawable.employee_mainmenu_manage_inventory,
            R.drawable.employee_mainmenu_orderlist,
            R.drawable.employee_mainmenu_shift_management,
            R.drawable.employee_mainmenu_supplier,
            R.drawable.employee_mainmenu_customer
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_menu);

        employeeMenu_listView = findViewById(R.id.employee_listView);
        employee_toolbar = findViewById(R.id.employee_toolbar);
        setSupportActionBar(employee_toolbar);


        EmployeeMenuAdapter adapter = new EmployeeMenuAdapter(getApplicationContext(), employeeMenu, employeeMenuImage);
        employeeMenu_listView.setAdapter(adapter);
        employeeMenu_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0) {           // Manage Inventory
                    displayToast("Manage Inventory Clicked!");
                } else if (i == 1) {   // Order List
                    Intent startOrderList = new Intent(EmployeeMenu.this, OrderList.class);
                    startActivity(startOrderList);
                } else if (i == 2) {   // Shift Management
                    displayToast("Shift Management Clicked! ");
                } else if (i == 3) {   // Suppliers
                    Intent startAddSupplier = new Intent(EmployeeMenu.this, add_supplier.class);
                    startActivity(startAddSupplier);
                } else if (i == 4) {   // Customers
                    displayToast("Customers Clicked! ");
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.employee_toolbar_menu, menu);
        return true;
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case R.id.employee_menu_signout:
                displayToast("Sign Out Clicked");
                break;
            case R.id.employee_menu_profile:
                Intent profile = new Intent(EmployeeMenu.this, Profile.class);
                startActivity(profile);
                break;
            default:
                break;
        }
        return true;
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
     Website Referenced:
         - https://www.javatpoint.com/android-custom-listview
         - https://stackoverflow.com/questions/19662233/how-open-new-activity-clicking-an-item-in-listview
 */


/**
 * Customer:
 * first name
 * last name
 * shipping address -> [strt number, city, zip]
 * CreditCard-> [number, expiration, cvv]
 */