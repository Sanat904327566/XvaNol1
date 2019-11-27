package com.example.xva0;

import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.williammora.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private CardView cardview1, cardview2, cardview3, cardview4, cardview5, cardview6, cardview7, cardview8, cardview9;
    private TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9;
    private int cnt = 0, k1 = 0, k2 = 0;
    private Button button;
    private TextView textViewP1, textViewP2;
    private String s1, s2, s3, s4, s5, s6, s7, s8, s9;
    private Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textViewP1 = findViewById(R.id.texviewPlayer1);
        textViewP2 = findViewById(R.id.texviewPlayer2);
        snackbar = findViewById(R.id.snackbar);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textview2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textview5);
        textView6 = findViewById(R.id.textview6);
        textView7 = findViewById(R.id.textview7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        cardview1 = findViewById(R.id.cardview1);
        cardview2 = findViewById(R.id.cardview2);
        cardview3 = findViewById(R.id.cardview3);
        cardview4 = findViewById(R.id.cardview4);
        cardview5 = findViewById(R.id.cardview5);
        cardview6 = findViewById(R.id.cardview6);
        cardview7 = findViewById(R.id.carview7);
        cardview8 = findViewById(R.id.cardview8);
        cardview9 = findViewById(R.id.carview9);

        getData();
        onClick();
        setColor();
    }

    public void onClick() {
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt++;
                if (cnt % 2 == 1 && textView1.getText().equals("")) textView1.setText("X");
                else if (textView1.getText().equals("")) textView1.setText("0");

                getData();

                if (s1.equals(s2) && s1.equals(s3) && s1.equals("X") ||
                        s1.equals(s4) && s1.equals(s7) && s1.equals("X") ||
                        s1.equals(s5) && s1.equals(s9) && s1.equals("X"))
                {
                    k1++;
                    textViewP1.setText("1 - PLAYER : " + k1);
                    setClear();

                }
                else if (s1.equals(s2) && s1.equals(s3) && s1.equals("0") ||
                        s1.equals(s4) && s1.equals(s7) && s1.equals("0") ||
                        s1.equals(s5) && s1.equals(s9) && s1.equals("0")) {
                    k2++;
                    textViewP1.setText("2 - PLAYER : " + k2);
                    setClear();
                }
                setColor();


            }
        });
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt++;
                if (cnt % 2 == 1 && textView2.getText().equals("")) textView2.setText("X");
                else if (textView2.getText().equals("")) textView2.setText("0");

                getData();

                if(s2.equals(s1) && s2.equals(s3) && s2.equals("X") ||
                s2.equals(s5) && s2.equals(s8) && s2.equals("X"))
                {
                    k1++;
                    textViewP1.setText("1 - PLAYER : " + k1);
                    setClear();
                }
                else  if(s2.equals(s1) && s2.equals(s3) && s2.equals("0") ||
                        s2.equals(s5) && s2.equals(s8) && s2.equals("0"))
                {
                    k2++;
                    textViewP2.setText("2 - PLAYER : " + k2);
                    setClear();
                }
                setColor();
            }
        });
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cnt++;
                if (cnt % 2 == 1 && textView3.getText().equals("")) textView3.setText("X");
                else if (textView3.getText().equals("")) textView3.setText("0");

                getData();

                if(s3.equals(s2) && s3.equals(s1) && s3.equals("X") ||
                s3.equals(s6) && s3.equals(s9) && s3.equals("X") ||
                s3.equals(s5) && s3.equals(s7) && s3.equals("X"))
                {
                    k1++;
                    textViewP1.setText("1 - PLAYER : " + k1);
                    setClear();
                }
                else if(s3.equals(s2) && s3.equals(s1) && s3.equals("0") ||
                        s3.equals(s6) && s3.equals(s9) && s3.equals("0") ||
                        s3.equals(s5) && s3.equals(s7) && s3.equals("0"))
                {
                    k2++;
                    textViewP2.setText("2 - PLAYER : " + k2);
                    setClear();
                }

                setColor();

            }
        });
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt++;
                if (cnt % 2 == 1 && textView4.getText().equals("")) textView4.setText("X");
                else if (textView4.getText().equals("")) textView4.setText("0");

                getData();

                if(s4.equals(s1) && s4.equals(s7) && s4.equals("X") ||
                s4.equals(s5) && s4.equals(s6) && s4.equals("X") )
                {
                    k1++;
                    textViewP1.setText("1 - PLAYER : " + k1);
                    setClear();
                }
               else if(s4.equals(s1) && s4.equals(s7) && s4.equals("0") ||
                        s4.equals(s5) && s4.equals(s6) && s4.equals("0") )
                {
                    k2++;
                    textViewP2.setText("2 - PLAYER : " + k2);
                    setClear();
                }
                setColor();

            }
        });
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt++;
                if (cnt % 2 == 1 && textView5.getText().equals("")) textView5.setText("X");
                else if (textView5.getText().equals("")) textView5.setText("0");

                getData();

                if(s5.equals(s1) && s5.equals(s9) && s5.equals("X") ||
                   s5.equals(s3) && s5.equals(s7) &&  s5.equals("X")||
                   s5.equals(s2) && s5.equals(s8) && s5.equals("X")||
                  s5.equals(s4) && s5.equals(s6) && s5.equals("X"))
                {
                    k1++;
                    textViewP1.setText("1 - PLAYER : " + k1);
                    setClear();
                }
                else if(s5.equals(s1) && s5.equals(s9) && s5.equals("0") ||
                        s5.equals(s3) && s5.equals(s7) &&  s5.equals("0")||
                        s5.equals(s2) && s5.equals(s8) && s5.equals("0")||
                        s5.equals(s4) && s5.equals(s6) && s5.equals("0"))
                {
                    k2++;
                    textViewP2.setText("2 - PLAYER : " + k2);
                    setClear();
                }
                setColor();

            }
        });
        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt++;
                if (cnt % 2 == 1 && textView6.getText().equals("")) textView6.setText("X");
                else if (textView6.getText().equals("")) textView6.setText("0");

                getData();

                if(s6.equals(s3) && s6.equals(s9) && s6.equals("X") ||
                s6.equals(s5) && s6.equals(s4) && s6.equals("X"))
                {
                    k1++;
                    textViewP1.setText("1 - PLAYER : " + k1);
                    setClear();
                }
               else if(s6.equals(s3) && s6.equals(s9) && s6.equals("0") ||
                        s6.equals(s5) && s6.equals(s4) && s6.equals("0"))
                {
                    k2++;
                    textViewP2.setText("2 - PLAYER : " + k2);
                    setClear();
                }
                setColor();


            }
        });
        cardview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt++;
                if (cnt % 2 == 1 && textView7.getText().equals("")) textView7.setText("X");
                else if (textView7.getText().equals("")) textView7.setText("0");

                getData();

                if(s7.equals(s4) && s7.equals(s1) && s7.equals("X")||
                s7.equals(s5) && s7.equals(s3) && s7.equals("X")||
                s7.equals(s8) && s7.equals(s9) && s7.equals("X"))
                {
                    k1++;
                    textViewP1.setText("1 - PLAYER : " + k1);
                    setClear();
                }
               else if(s7.equals(s4) && s7.equals(s1) && s7.equals("0")||
                        s7.equals(s5) && s7.equals(s3) && s7.equals("0")||
                        s7.equals(s8) && s7.equals(s9) && s7.equals("0"))
                {
                    k2++;
                    textViewP2.setText("2 - PLAYER : " + k2);
                    setClear();
                }
                setColor();

            }
        });
        cardview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt++;
                if (cnt % 2 == 1 && textView8.getText().equals("")) textView8.setText("X");
                else if (textView8.getText().equals("")) textView8.setText("0");

                getData();

                if(s8.equals(s5) && s8.equals(s2) && s8.equals("X") ||
                s8.equals(s7) && s8.equals(s9) && s8.equals("X") )
                {
                    k1++;
                    textViewP1.setText("1 - PLAYER : " + k1);
                    setClear();
                }
                if(s8.equals(s5) && s8.equals(s2) && s8.equals("0") ||
                        s8.equals(s7) && s8.equals(s9) && s8.equals("0") )
                {
                    k2++;
                    textViewP2.setText("2 - PLAYER : " + k2);
                    setClear();
                }
                setColor();

            }
        });
        cardview9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt++;
                if (cnt % 2 == 1 && textView9.getText().equals("")) textView9.setText("X");
                else if (textView9.getText().equals("")) textView9.setText("0");

                getData();

                if(s9.equals(s5) && s9.equals(s1) && s9.equals("X")||
                s9.equals(s8) && s9.equals(s7)&& s9.equals("X")||
                s9.equals(s6) && s9.equals(s3) && s9.equals("X"))
                {
                    k1++;
                    textViewP1.setText("1 - PLAYER : " + k1);
                    setClear();
                }
               else  if(s9.equals(s5) && s9.equals(s1) && s9.equals("0")||
                        s9.equals(s8) && s9.equals(s7)&& s9.equals("0")||
                        s9.equals(s6) && s9.equals(s3) && s9.equals("0"))
                {
                    k2++;
                    textViewP2.setText("2 - PLAYER : " + k2);
                    setClear();
                }
                setColor();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setClear();
                k1=0;
                k2=0;
                textViewP1.setText("1 - PLAYER : 0");
                textViewP2.setText("2 - PLAYER : 0");

                textViewP1.setTextColor(Color.GREEN);
                textViewP2.setTextColor(Color.WHITE);
            }
        });

    }

    public void setClear() {

        new CountDownTimer( 800,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {

        textView1.setText("");
        textView2.setText("");
        textView3.setText("");
        textView4.setText("");
        textView5.setText("");
        textView6.setText("");
        textView7.setText("");
        textView8.setText("");
        textView9.setText("");
            }
        }.start();

    }

    public void getData() {
        s1 = textView1.getText().toString();
        s2 = textView2.getText().toString();
        s3 = textView3.getText().toString();
        s4 = textView4.getText().toString();
        s5 = textView5.getText().toString();
        s6 = textView6.getText().toString();
        s7 = textView7.getText().toString();
        s8 = textView8.getText().toString();
        s9 = textView9.getText().toString();
    }
    public void setColor()
    {
        if(cnt%2==0)
        {
        textViewP1.setTextColor(Color.GREEN);
        textViewP2.setTextColor(Color.WHITE);
        }
        else
        {
            textViewP1.setTextColor(Color.WHITE);
            textViewP2.setTextColor(Color.GREEN);
        }

    }
}
