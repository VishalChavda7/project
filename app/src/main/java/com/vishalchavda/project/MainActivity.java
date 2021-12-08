package com.vishalchavda.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView etone, ettwo, etthree;
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

                int c = Integer.parseInt(etthree.getText().toString());
                int a;
                int b ;

                a = c + 1;
                b = a + 1;
                c = b + 1;

                if (a == 10) {
                    b = 1;
                    c = b + 1;
                }
                if (b == 10) {
                    c = 1;
                }

                if (etthree.getText().toString().matches("10")) {
                    etone.setText("1");
                    ettwo.setText("2");
                    etthree.setText("3");
                    return;
                }
                etone.setText(String.valueOf(a));
                ettwo.setText(String.valueOf(b));
                etthree.setText(String.valueOf(c));




            }
        });

    }

}