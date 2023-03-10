package com.example.firebaseapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference ref1;

    private static final String[] VILLES = {"Paris", "Londres"};
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        database = FirebaseDatabase.getInstance();
        ref1 = database.getReference("test1");
        save = findViewById(R.id.button);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

       // ref1.push();


    }
}