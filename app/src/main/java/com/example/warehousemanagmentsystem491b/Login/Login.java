package com.example.warehousemanagmentsystem491b.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.warehousemanagmentsystem491b.MainActivity;
import com.example.warehousemanagmentsystem491b.R;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {

    // Initialize variables
    private EditText loginUsername;
    private EditText loginPassword;
    private Button loginButton;
    private TextView loginRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //
        loginUsername = findViewById(R.id.login_username);
        loginPassword = findViewById(R.id.login_password);
        loginButton = findViewById(R.id.login_login_btn);
        loginRegister = findViewById(R.id.login_register_btn);


    }

    /**
     * onClick method when the user clicks the login button
     * @param view
     */
    public void login(View view) {
        if (setValidation()){
//            Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
            Intent intentMainMenu = new Intent(this, MainActivity.class);
            startActivity(intentMainMenu);
        } else {
            displayToast("Error in Login");
        }

    }


    /**
     * Create a new account when register Textview is clicked
     * @param view
     */
    public void registerAccount(View view) {
        Intent intentRegister = new Intent(this, Register.class);
        startActivity(intentRegister);
    }

    // Incomplete!!! returns a boolean true or false? successful login or not
    public boolean setValidation(){
        // empty field gives errors
        if (loginUsername.getText().toString().isEmpty()){
//            Toast.makeText(getApplicationContext(), "Empty Field", Toast.LENGTH_SHORT).show();
            return false;
        } else if(loginPassword.getText().toString().isEmpty()){
//            Toast.makeText(getApplicationContext(), "Empty Field", Toast.LENGTH_SHORT).show();
            return false;
        } else{
            // username = admin, password = admin
            if (loginUsername.getText().toString().equals("admin") ||
                    loginPassword.getText().toString().equals("admin") ){
                displayToast("Login Successful");
                return true;
            }
        }
        return false;
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