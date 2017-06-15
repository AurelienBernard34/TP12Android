package fr.formation.tp12;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;

import fr.formation.tp12.database.modele.User;

public class Secondaire extends AppCompatActivity {

    Button button_save;
    EditText nomSaisie;

    private EditText nom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondaire);
        nom = (EditText) findViewById(R.id.nomSaisie);
    }

    public void sauvegarder(View v) {

        User utilisateur = new User();
        utilisateur.setNom(nom.getText().toString());
        // Transformation en JSON :
        String flux = (new Gson().toJson(utilisateur));

        // On dépose notre utilisateur jsonné dans l'intent
        Intent resultIntent = new Intent();
        resultIntent.putExtra("nomUser", flux);
        setResult(2, resultIntent);

        // Bye l'activité
        finish();

    }
}


