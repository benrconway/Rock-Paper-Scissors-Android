package com.example.user.myapplication;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    TextView resultText;
    Game game;
    ImageView image1, image2;
    Button playAgainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        playAgainButton = (Button) findViewById(R.id.play_again_button);
        resultText = (TextView) findViewById(R.id.result_text);
        game = new Game();
        image1 = (ImageView) findViewById(R.id.imageView);
        image2 = (ImageView) findViewById(R.id.imageView2);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        Hand playerHand = (Hand) extras.get("hand");
        game.setHands(playerHand);
        String result = game.compete();
        resultText.setText(result);
        Drawable background1 = getImage(playerHand);
        Drawable background2 = getImage(game.getHand2());

        image1.setBackground(background1);
        image2.setBackground(background2);

    }

    public void onPlayAgainButtonClicked(View button){
        Intent intentToReturn = new Intent(this, GameActivity.class);
        startActivity(intentToReturn);
    }


    public Drawable getImage(Hand hand){
        if (hand == Hand.ROCK){
            return getResources().getDrawable(R.drawable.rock);
        }
        else if (hand == Hand.PAPER){
            return getResources().getDrawable(R.drawable.paper);
        }
        else {
            return getResources().getDrawable(R.drawable.scissors);
        }
    }

}






