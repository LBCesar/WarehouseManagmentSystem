package com.example.warehousemanagmentsystem491b.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.example.warehousemanagmentsystem491b.R;

public class Register extends AppCompatActivity
        implements View.OnClickListener {

    // Initialize variables
    private EditText registerName;
    private EditText registerEmail;
    private EditText registerPassword;
    private EditText registerConfirmPassword;
    private Button registerSignupButton;


    // Password requirement with special character, numbers...
    // private final String regexPassword = "(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])(?=.*[~`!@#\\$%\\^&\\*\\(\\)\\-_\\+=\\{\\}\\[\\]\\|\\;:\"<>,./\\?]).{5,}";
    private final String regexPassword = "(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d]).{5,}";
    // Using Github awesomeValidation library: https://github.com/thyrlian/AwesomeValidation
    // Using AwesomeValidation to check for Invalid inputs
    AwesomeValidation mAwesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
    String RegexNumber = "[/^\\d+\\.?\\d*$/]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Initialization
        registerName = findViewById(R.id.register_name);
        registerEmail = findViewById(R.id.register_email);
        registerPassword = findViewById(R.id.register_password);
        registerConfirmPassword = findViewById(R.id.register_confirm_password);
        registerSignupButton = findViewById(R.id.register_signup_btn);

        validateUserInput();

        // Signup button Clicked
        registerSignupButton.setOnClickListener(this);
    }

    public void validateUserInput() {
        mAwesomeValidation.addValidation(Register.this, R.id.register_name, "[a-zA-Z\\s]+", R.string.err_register_name);
        mAwesomeValidation.addValidation(Register.this, R.id.register_email, android.util.Patterns.EMAIL_ADDRESS, R.string.err_register_email);
        mAwesomeValidation.addValidation(Register.this, R.id.register_password, regexPassword, R.string.err_register_password);
        mAwesomeValidation.addValidation(Register.this, R.id.register_confirm_password, R.id.register_password, R.string.err_register_password_confirmation);
    }


    @Override
    public void onClick(View view) {

        if (mAwesomeValidation.validate()) {
            displayToast("Account Created");

            // move to login activity after creating an account
            Intent intentLogin = new Intent(getApplicationContext(), Login.class);
            startActivity(intentLogin);

        } else
            displayToast("Error in Sign up");
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

