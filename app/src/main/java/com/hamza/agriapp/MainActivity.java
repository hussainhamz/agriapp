package com.hamza.agriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.hamza.agriapp.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter<String> baliseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_balise); // Vue

        // Appel à la fonction pour vérifier la connexion
        verifierUtilisateur();
        generateMesBalises();

        ListView baliseListView = (ListView) findViewById(R.id.listBalise);
        if (baliseListView != null && baliseAdapter != null) {
            baliseListView.setAdapter(baliseAdapter);


            baliseListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
                @Override
                public void onItemClick(AdapterView<?> adapter, View v, int position,
                                        long arg3)
                {
                    String value = (String)adapter.getItemAtPosition(position);
                    // assuming string and if you want to get the value on click of list item
                    // do what you intend to do on click of listview row
                    afficheMessage("Vous avez cliqué sur la balise : "+value);
                    Intent intent = new Intent(MainActivity.this, BaliseInfo.class);
                    startActivity(intent);
                }
            });
        } else {
            Log.d("AGRI_APP", "Liste balise adapteur était null");
        }
    }

    private void verifierUtilisateur() {
        // Verifier si l'utilsateur est bien connecté
        boolean isUserConnected = getIntent().getBooleanExtra("IS_USER_CONNECTED", false);
        if (!isUserConnected) {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Vous êtes bien connecté", Toast.LENGTH_LONG).show();
        }
    }

    private void generateMesBalises() {

        // Faire une appel à l'API pour récuperer les balises
        String mesBalises [] = new String[14];
        for (int i = 0; i < mesBalises.length; i++) {
            mesBalises[i] = "Balise " + i;
        }

        baliseAdapter = new ArrayAdapter<String>(this, R.layout.une_balise,
                R.id.textBalise, mesBalises);
    }

    public void afficheMessage(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }


}
