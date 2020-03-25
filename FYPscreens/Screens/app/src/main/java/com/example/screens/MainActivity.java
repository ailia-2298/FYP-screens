package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        EditText editText = (EditText) findViewById(R.id.usrnme);
        String message = editText.getText().toString();
        if(message.equals("admin")) {
            Intent intent = new Intent(this, Admin.class);
            startActivity(intent);
        }
        else if(message.equals("staff")) {
            Intent intent = new Intent(this, Staff.class);
            startActivity(intent);
        }
        else if(message.equals("parent")) {
            Intent intent = new Intent(this, Parent.class);
            startActivity(intent);
        }
    }
}