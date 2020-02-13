package com.hamza.agriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.hamza.agriapp.data.Balise;
import com.hamza.agriapp.login.LoginActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Balise> balisesAbonnees;
    private ListView baliseListView;

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
        } else {
            Toast.makeText(getApplicationContext(), "Vous êtes bien connecté", Toast.LENGTH_LONG).show();
            //this.balisesAbonnees = new ArrayList<>();
            //recupereMesBalises();

            baliseListView = (ListView)findViewById(R.id.listBalise);
            String mesBalises[] = {"toto", "titi"};
            ArrayAdapter<String> baliseAdapter = new ArrayAdapter<>(this, R.layout.balise_list_view, R.id.uneBaliseVue, mesBalises);
            baliseListView.setAdapter(baliseAdapter);
        }

    }

    private void recupereMesBalises() {
        this.balisesAbonnees.add(new Balise("balise42"));
        this.balisesAbonnees.add(new Balise("balise50"));
        this.balisesAbonnees.add(new Balise("balise60"));
    }
}
