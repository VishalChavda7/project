package com.vishalchavda.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etone,ettwo,etthree;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etone = findViewById(R.id.etone);
        ettwo = findViewById(R.id.ettwo);
        etthree = findViewById(R.id.etthree);
        next = findViewById(R.id.next);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etthree.getText().toString().matches("9")) {
                    etone.setText("1");
                    ettwo.setText("2");
                    etthree.setText("3");
                    return;
                }
                    settext();




            }
        });
    }
    private void settext(){

        int a = Integer.parseInt(etone.getText().toString());
        int b = Integer.parseInt(ettwo.getText().toString());
        int c = Integer.parseInt(etthree.getText().toString());

        etone.setText(String.valueOf(a+3));
        ettwo.setText(String.valueOf(b+3));
        etthree.setText(String.valueOf(c+3));
    }
}