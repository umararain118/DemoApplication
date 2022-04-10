package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView1,textView2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView1 = findViewById(R.id.textview1);
        textView2 = findViewById(R.id.textview2);

        button = findViewById(R.id.button_back);

        Bundle bundle = getIntent().getExtras();
        assert  bundle != null;

        String first_name = bundle.getString("FirstName");
        String last_name = bundle.getString("LastName");

        textView1.setText("First Name: "+ first_name);
        textView2.setText("Last Name: "+last_name);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}