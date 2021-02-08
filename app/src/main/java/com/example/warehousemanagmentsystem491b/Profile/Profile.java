package com.example.warehousemanagmentsystem491b.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.warehousemanagmentsystem491b.Employee.EmployeeMenu;
import com.example.warehousemanagmentsystem491b.R;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    /**
     * Create a new account when < Textview is clicked
     *
     * @param view
     */
    public void backToMenu(View view) {
        Intent intentBackToMenu = new Intent(this, EmployeeMenu.class);
        startActivity(intentBackToMenu);
        //displayToast("backToMenu clicked!");
    }

    /**
     * onClick method when the user clicks the Edit Profile button
     *
     * @param view
     */
    public void EditProfileButton(View view) {
        // Just to get ready if more things are added
        if (view.getId() == R.id.profile_edit_profile_btn) {
            // Goes to Edit Profile Activity
            Intent editProfile = new Intent(this, EditProfile.class);
            startActivity(editProfile);
        }
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