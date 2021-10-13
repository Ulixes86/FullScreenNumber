package com.example.numberboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InlineSuggestionsRequest;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private EditText display;
    public Button povecajBTN;

    public void init(){

        povecajBTN = (Button) findViewById(R.id.povecajBTN);
        povecajBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//https://stackoverflow.com/questions/4114443/use-an-intent-to-send-data-to-my-activity?fbclid=IwAR1n0kEappsB_t-jTM5x4YsLhXcimCE27Bex7t5hM2ZOIm87Kwu1VLtgacM

                Intent toy = new Intent(MainActivity.this, FullScreen.class);
                toy.putExtra("MY_VAR", display.getText().toString());
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getString(R.string.display).equals(display.getText().toString())) {
                    display.setText("");
                }
            }
        });
    }

    public void updateText(String strToAdd) {
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);

        if (display.length()==6) {
            //display.setText("ERROR");
        }
        else{
                if (getString(R.string.display).equals(display.getText().toString())) {
                    display.setText(strToAdd);
                    display.setSelection(cursorPos + 1);
                } else {
                    display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
                    display.setSelection(cursorPos + 1);
                }
             }
    }

    public void enaBTN(View view) {
        updateText("1");
    }

    public void dvaBTN(View view) {
        updateText("2");
    }

    public void triBTN(View view) {
        updateText("3");
    }

    public void stiriBTN(View view) {
        updateText("4");
    }

    public void petBTN(View view) {
        updateText("5");
    }

    public void sestBTN(View view) {
        updateText("6");
    }

    public void sedemBTN(View view) {
        updateText("7");
    }

    public void osemBTN(View view) {
        updateText("8");
    }

    public void devetBTN(View view) {
        updateText("9");
    }

    public void nicBTN(View view) {
        updateText("0");
    }

    public void minusBTN(View view) {
        updateText("-");
    }

    public void pocistiBTN(View view) {
        display.setText("");
    }

    public void povecajBTN(View view) {
        init();
    }

}
