package com.example.user.myapplication;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class GameActivity extends AppCompatActivity {

    ImageButton rockButton, paperButton, scissorsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rockButton = (ImageButton) findViewById(R.id.rock_button);
        paperButton = (ImageButton) findViewById(R.id.paper_button);
        scissorsButton = (ImageButton) findViewById(R.id.scissors_button);
    }

    public void onRockButtonClicked(View button){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("hand", Hand.ROCK);
        startActivity(intent);
    }
    public void onScissorsButtonClicked(View button){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("hand", Hand.SCISSORS);
        startActivity(intent);
    }
    public void onPaperButtonClicked(View button){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("hand", Hand.PAPER);
        startActivity(intent);
    }
}






