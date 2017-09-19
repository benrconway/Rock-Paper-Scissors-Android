package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    Button rockButton, paperButton, scissorsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rockButton = (Button) findViewById(R.id.rock_button);
        paperButton = (Button) findViewById(R.id.paper_button);
        scissorsButton = (Button) findViewById(R.id.scissors_button);
    }

    public void onRockButtonClicked(View button){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("hand", Hand.ROCK);
        startActivity(intent);

    }
    public void onScissorsButtonClicked(View button){
        Log.d(getClass().toString(), "Scissors button pressed.");
    }
    public void onPaperButtonClicked(View button){
        Log.d(getClass().toString(), "Paper button pressed.");
    }
}
