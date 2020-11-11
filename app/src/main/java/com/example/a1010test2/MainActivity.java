package com.example.a1010test2;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    ImageButton IB1,IB2;
    EditText ET1, username;
    Dialog loginDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IB1 = (ImageButton) findViewById(R.id.IB1);
        ET1 = (EditText) findViewById(R.id.ET1);
        registerForContextMenu(IB1);
        Intent intent = getIntent();
        String userID = intent.getStringExtra("userID");
        ET1.setText(userID);

        IB2=(ImageButton)findViewById(R.id.random);

        IB2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, randomActivity.class);
                startActivity(intent);
            }
        });
    }

}

