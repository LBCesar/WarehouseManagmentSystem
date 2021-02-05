package com.example.warehousemanagmentsystem491b.Employee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.warehousemanagmentsystem491b.Orderlist.OrderList;
import com.example.warehousemanagmentsystem491b.R;

public class EmployeeMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_menu);
    }

    public void add_supplier_onClick(View view) {
        Intent startAddSupplier = new Intent(this, add_supplier.class);
        startActivity(startAddSupplier);
    }

    public void add_order_list(View view) {
        Intent startOrderList = new Intent(this, OrderList.class);
        startActivity(startOrderList);
    }

}
