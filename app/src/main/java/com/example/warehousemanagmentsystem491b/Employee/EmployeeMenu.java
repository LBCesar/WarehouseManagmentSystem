package com.example.warehousemanagmentsystem491b.Employee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.warehousemanagmentsystem491b.Orderlist.OrderList;
import com.example.warehousemanagmentsystem491b.R;

public class EmployeeMenu extends AppCompatActivity {

    private final String[] employeeMenu = {
            "Manage Inventory",
            "OrderList",
            "Shift Management",
            "Suppliers",
            "Customers"
    };
    private ListView employeeMenu_listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_menu);

        employeeMenu_listView = findViewById(R.id.employee_listView);

        ArrayAdapter adapter = new ArrayAdapter(this,
                R.layout.list_employee_mainmenu, R.id.employee_mainmenu_textView, employeeMenu);

        employeeMenu_listView.setAdapter(adapter);

        employeeMenu_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0) {        // Manage Inventory
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

//    Initial Test Button
//    public void add_supplier_onClick(View view) {
//        Intent startAddSupplier = new Intent(this, add_supplier.class);
//        startActivity(startAddSupplier);
//    }
//
//    public void add_order_list(View view) {
//        Intent startOrderList = new Intent(this, OrderList.class);
//        startActivity(startOrderList);
//    }


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


// Website Referenced:
// https://www.javatpoint.com/android-custom-listview
// https://stackoverflow.com/questions/19662233/how-open-new-activity-clicking-an-item-in-listview
