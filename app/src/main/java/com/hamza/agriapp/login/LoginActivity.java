package com.hamza.agriapp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.hamza.agriapp.MainActivity;
import com.hamza.agriapp.R;

public class LoginActivity extends AppCompatActivity {

    private String email = "agri";
    private String pass = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void verifierLogin(View view) {
        String email =  ((EditText)findViewById(R.id.userEmail)).getText().toString();
        String pass = ((EditText)findViewById(R.id.userPassword)).getText().toString();

        if (this.email.equalsIgnoreCase(email) && this.pass.equalsIgnoreCase(pass)) {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.putExtra("IS_USER_CONNECTED", true);
            Toast.makeText(getApplicationContext(), email + " : " + pass + " est correct", Toast.LENGTH_LONG).show();
            startActivity(intent);
        } else {
            String messageEchecConnexion = "Vérifiez votre email / mot de passe.";
            Toast.makeText(getApplicationContext(), email + " : " + pass, Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), messageEchecConnexion, Toast.LENGTH_LONG).show();
        }

    }
}
