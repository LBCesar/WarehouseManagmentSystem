package com.example.warehousemanagmentsystem491b.Employee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
}