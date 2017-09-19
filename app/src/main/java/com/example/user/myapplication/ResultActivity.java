package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    TextView resultText;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultText = (TextView) findViewById(R.id.result_text);
        game = new Game();
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        Hand playerHand = (Hand) extras.get("hand");
        game.setHands(playerHand);
        String result = game.compete();
        resultText.setText(result);
    }


}
