package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.edit_text1);
        editText2 = findViewById(R.id.edit_text2);

        button = findViewById(R.id.button_submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String first_name = editText1.getText().toString().trim();
                String last_name =  editText2.getText().toString().trim();

                if (first_name.equals("") || last_name.equals("")){
                    Toast.makeText(getApplicationContext(),"Plaese fill all fields",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent =new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("FirstName",first_name);
                    intent.putExtra("LastName",last_name);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }
}