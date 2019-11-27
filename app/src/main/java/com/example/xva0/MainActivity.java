package com.example.xva0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CardView cardview1,cardview2,cardview3,cardview4,cardview5,cardview6,cardview7,cardview8,cardview9;
    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textview2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textview5);
        textView6 = findViewById(R.id.textview6);
        textView7 = findViewById(R.id.textview7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        cardview1=findViewById(R.id.cardview1);
        cardview2=findViewById(R.id.cardview2);
        cardview3=findViewById(R.id.cardview3);
        cardview4=findViewById(R.id.cardview4);
        cardview5=findViewById(R.id.cardview5);
        cardview6=findViewById(R.id.cardview6);
        cardview7=findViewById(R.id.carview7);
        cardview8=findViewById(R.id.cardview8);
        cardview9=findViewById(R.id.carview9);
    }
}
