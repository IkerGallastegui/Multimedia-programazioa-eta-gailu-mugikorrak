package com.example.eragiketa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.scrotingtext.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.zenb1),
                editText2 = findViewById(R.id.zenb2);
        Button gehi = findViewById(R.id.btnGehi);
        gehi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String zenb1String = editText.getText().toString(),
                        zenb2String = editText2.getText().toString();

                if (zenb1String.equals("") || zenb2String.equals("")) {
                    return;
                }

                int zenb1 = Integer.parseInt(zenb1String),
                        zenb2 = Integer.parseInt(zenb2String);
                int gehi = zenb1 + zenb2;
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("gehi", gehi);
                startActivity(intent);
            }
        });
    }
}