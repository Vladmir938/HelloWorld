package com.example.labnum1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {
    private EditText textName;
    private Button btnSendName;
    private TextView toSendName;
    private GifImageView pepeHi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textName = findViewById(R.id.editTextTextPersonName);
        btnSendName = findViewById(R.id.button);
        toSendName = findViewById(R.id.txt_1);
        pepeHi = findViewById(R.id.pepe);

        textName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {


            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                if(textName.length() == 0) {
                    toSendName.setText("Как вас зовут?");
                    pepeHi.setVisibility(View.INVISIBLE);
                }

            }
        });
    }

    public void OnClickHi(View view) {
        if(textName.length() == 0) {

        }
        else {

            String name = textName.getText().toString();
            toSendName.setText("Привет " + name + "!");
            pepeHi.setVisibility(View.VISIBLE);
        }

    }
}