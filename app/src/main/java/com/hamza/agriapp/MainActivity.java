package com.hamza.agriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.hamza.agriapp.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Appel à la fonction pour vérifier la connexion
        verifierUtilisateur();

        // Affiche la liste des capteurs

        setContentView(R.layout.activity_main);
    }

    private void verifierUtilisateur() {
        // Verifier si l'utilsateur est bien connecté
        boolean isUserConnected = getIntent().getBooleanExtra("IS_USER_CONNECTED", false);
        if (!isUserConnected) {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        }
    }
}
