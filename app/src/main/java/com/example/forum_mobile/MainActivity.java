package com.example.forum_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnNext;
    public static final String USER_NAME = "com.example.forum_mobile.USER_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText txtUserName = (EditText) findViewById(R.id.txtUserName);
                String userName = txtUserName.getText().toString();
                Intent novatela = new Intent(MainActivity.this, MainActivity2.class);
                novatela.putExtra(USER_NAME, userName);
                
                startActivity(novatela);
            }
        });
    }
}