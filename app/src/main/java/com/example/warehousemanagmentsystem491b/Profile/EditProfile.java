package com.example.warehousemanagmentsystem491b.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.warehousemanagmentsystem491b.R;

public class EditProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
    }

    /**
     * Create a new account when < Textview is clicked
     *
     * @param view
     */
    public void backToMenu(View view) {
        Intent intentBackToProfile = new Intent(this, Profile.class);
        startActivity(intentBackToProfile);
    }

    /**
     * onClick method when the user clicks the Save button
     *
     * @param view
     */
    public void SaveButton(View view) {
        // Just to get ready if more things are added
        if (view.getId() == R.id.edit_profile_save_btn) {
            displayToast("Information Saved!");
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