package com.example.luistercero.ca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button millas = (Button) findViewById(R.id.millas);
        Button kilometros = (Button) findViewById(R.id.kilometros);

        final EditText edit_km = (EditText) findViewById(R.id.edit_km);
        final EditText convencional = (EditText) findViewById(R.id.convencional);
        final EditText sintetico = (EditText) findViewById(R.id.sintetico);


        millas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String skm = edit_km.getText().toString();
                float km = Float.parseFloat(skm);
                float millas = km + 1865f;
                float millas2 = km + 2486f;
                String smillas = String.format("%.2f", millas2);
                String smillas2 = String.format("%.2f", millas);
                convencional.setText(smillas);
                sintetico.setText(smillas2);
            }
        });


        kilometros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String skm = edit_km.getText().toString();
                float km = Float.parseFloat(skm);
                float millas = km + 3000f;
                float millas2 = km + 4000f;
                String smillas = String.format("%.2f", millas);
                String smillas2 = String.format("%.2f", millas2);
                convencional.setText(smillas2);
                sintetico.setText(smillas);
            }
        });














    }
}
