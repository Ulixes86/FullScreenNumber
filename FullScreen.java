package com.example.numberboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FullScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);
        String passedArg = getIntent().getExtras().getString("MY_VAR");
        TextView koncna = findViewById(R.id.koncna);
        koncna.setText(passedArg);


    }
}
