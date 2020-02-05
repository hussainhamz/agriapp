package com.hamza.agriapp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hamza.agriapp.MainActivity;
import com.hamza.agriapp.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void verifierLogin(View view) {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        intent.putExtra("IS_USER_CONNECTED", true);
        startActivity(intent);
    }
}
