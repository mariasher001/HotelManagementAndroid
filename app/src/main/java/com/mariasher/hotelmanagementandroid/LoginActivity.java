package com.mariasher.hotelmanagementandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mariasher.hotelmanagementandroid.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void loginButtonClicked(View view) {

    }

    public void registerButtonClicked(View view) {
        intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void forgotPasswordClicked(View view) {
    }
}