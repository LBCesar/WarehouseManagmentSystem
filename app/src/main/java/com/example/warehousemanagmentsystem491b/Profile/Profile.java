package com.example.warehousemanagmentsystem491b.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.warehousemanagmentsystem491b.Employee.EmployeeMenu;
import com.example.warehousemanagmentsystem491b.R;
import com.google.android.material.textfield.TextInputLayout;

public class Profile extends AppCompatActivity {

    private TextInputLayout password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        password = findViewById(R.id.confirm_password);
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
        if (view.getId() == R.id.profile_edit_profile_button) {
            // Goes to Edit Profile Activity
            Intent editProfile = new Intent(this, EditProfile.class);
            startActivity(editProfile);
        }
    }

    /**
     * onClick method when the user clicks the Edit Button in full name
     *
     * @param view
     */
    public void EditProfileName(View view) {
        // Just to get ready if more things are added
        final EditText editProductName = (EditText) findViewById(R.id.profile_name);
        final TextInputLayout editProductFullName = (TextInputLayout) findViewById(R.id.profile_full_name);
        if (view.getId() == R.id.test) {
            // Makes button invisible after being clicked
            final Button button = (Button) view;
            button.setVisibility(View.GONE);
            // Goes to Edit Profile Activity
            editProductName.setEnabled(true);
            // When user presses enter, saves info and exits out of text field
            // TODO Save info
            editProductName.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (i == KeyEvent.KEYCODE_ENTER)) {
                        editProductName.setEnabled(false);
                        editProductFullName.setEnabled(false);
                        button.setVisibility(View.VISIBLE); // Makes button visible
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    /**
     * onClick method when the user clicks the Edit Button in username
     *
     * @param view
     */
    public void EditProfileUsername(View view) {
        // Just to get ready if more things are added
        final EditText editProductUsername = (EditText) findViewById(R.id.username);
        if (view.getId() == R.id.test4) {
            // Makes button invisible after being clicked
            final Button button = (Button) view;
            button.setVisibility(View.GONE);
            // Goes to Edit Profile Activity
            editProductUsername.setEnabled(true);
            // When user presses enter, saves info and exits out of text field
            // TODO Save info
            editProductUsername.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (i == KeyEvent.KEYCODE_ENTER)) {
                        editProductUsername.setEnabled(false);
                        button.setVisibility(View.VISIBLE); // Makes button visible
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    /**
     * onClick method when the user clicks the Edit Button in email
     *
     * @param view
     */
    public void EditProfileEmail(View view) {
        // Just to get ready if more things are added
        final EditText editProductEmail = (EditText) findViewById(R.id.email);
        if (view.getId() == R.id.test3) {
            // Makes button invisible after being clicked
            final Button button = (Button) view;
            button.setVisibility(View.GONE);
            // Goes to Edit Profile Activity
            editProductEmail.setEnabled(true);
            // When user presses enter, saves info and exits out of text field
            // TODO Save info
            editProductEmail.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (i == KeyEvent.KEYCODE_ENTER)) {
                        editProductEmail.setEnabled(false);
                        button.setVisibility(View.VISIBLE); // Makes button visible
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    /**
     * onClick method when the user clicks the Edit Button in password
     *
     * @param view
     */
    public void EditProfilePassword(View view) {
        // Just to get ready if more things are added
        final EditText editProductPassword = (EditText) findViewById(R.id.profile_password);
        final EditText editProductConfirmPassword = (EditText) findViewById(R.id.profile_confirm_password);
        if (view.getId() == R.id.test2) {
            // Makes button invisible after being clicked
            final Button button = (Button) view;
            button.setVisibility(View.GONE);
            password.setVisibility(View.VISIBLE);
            // Goes to Edit Profile Activity
            editProductPassword.setEnabled(true);
            editProductConfirmPassword.setEnabled(true);
            // When user presses enter, saves info and exits out of text field
            // TODO Save info
            editProductConfirmPassword.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (i == KeyEvent.KEYCODE_ENTER)) {
                        editProductPassword.setEnabled(false);
                        editProductConfirmPassword.setEnabled(false);
                        password.setVisibility(View.GONE);
                        button.setVisibility(View.VISIBLE); // Makes button visible
                        return true;
                    }
                    return false;
                }
            });
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