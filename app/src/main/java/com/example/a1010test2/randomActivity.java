package com.example.a1010test2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class randomActivity extends AppCompatActivity {

    int images[] = new int[]{R.drawable.gobchang, R.drawable.pizza, R.drawable.jokbal, R.drawable.dak};
    Button ricebutton, stewbuttonm, pastabutton, seafoodbutton, deliverybutton, noodlebutton, schoolbutton, meatbutton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        Intent intent = getIntent();

        Button end = (Button) findViewById(R.id.select_cancel_button);
        end.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });

        ricebutton = (Button) findViewById(R.id.rice_button);

    }
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.rice_button:
                Intent rice_intent = new Intent(randomActivity.this, Rice_Random_Activity.class);
                startActivity(rice_intent);
                break;
            case R.id.delivery_button:
                Intent delivery_intent = new Intent(randomActivity.this, Delivery_Random_Activity.class);
                startActivity(delivery_intent);
                break;
            case R.id.meat_button:
                Intent meat_intent = new Intent(randomActivity.this, Meat_Random_Activity.class);
                startActivity(meat_intent);
                break;
            case R.id.school_food_button:
                Intent school_intent = new Intent(randomActivity.this, Schoolfood_Random_Activity.class);
                startActivity(school_intent);
                break;
            case R.id.seafood_button:
                Intent seafood_intent = new Intent(randomActivity.this, Seafood_Random_Activity.class);
                startActivity(seafood_intent);
                break;
            case R.id.stew_button:
                Intent stew_intent = new Intent(randomActivity.this, Stew_Random_Activity.class);
                startActivity(stew_intent);
                break;
            case R.id.pasta_button:
                Intent pasta_intent = new Intent(randomActivity.this, Pasta_Random_Activity.class);
                startActivity(pasta_intent);
                break;
            case R.id.noodle_button:
                Intent noodle_intent = new Intent(randomActivity.this, Noodle_Random_Activity.class);
                startActivity(noodle_intent);
                break;
        }
    }
}
