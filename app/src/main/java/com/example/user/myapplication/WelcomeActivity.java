package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    TextView welcomeText;
    TextView rules;
    Button playGame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        playGame = (Button) findViewById(R.id.play_game_button);

    }

    public void onPlayGameButtonClicked(View button){
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}
