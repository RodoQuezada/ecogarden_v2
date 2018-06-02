package com.example.rodo.ecogarden;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.rodo.ecogarden.view.ContainerActivity;
import com.example.rodo.ecogarden.view.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {

    private CardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cardView = (CardView) findViewById(R.id.cardview_flores);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , ContainerActivity.class);
                startActivity(intent);
            }
        });

    }
}
