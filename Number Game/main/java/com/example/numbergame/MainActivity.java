package com.example.numbergame;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView res;
    EditText num;
    Button submit,newgame;
    static int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res=(TextView) findViewById(R.id.result);
        num=(EditText) findViewById(R.id.num);
        submit=(Button) findViewById(R.id.submit);
        newgame=(Button) findViewById(R.id.newgame);

        newgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random number=new Random();
                int guess;
                guess=number.nextInt(100);
                n=guess;
                num.setText("");
                res.setText("Welcome  Guess the number between 1 to 100 ");
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=num.getText().toString();

                if(num1.length()>0) {
                    int a=Integer.parseInt(num1);
                    if(a>(n-11) && a<(n+9) && a!=n){
                        res.setText("You are so close ");
                    }
                    else {
                        if (a == n) {
                            res.setText("Correct Answer :)");
                        }
                        if (a > n) {
                            res.setText("It is Too high ");
                        }
                        if (a < n) {
                            res.setText("It is Too small ");
                        }
                    }
                }
            }
        });
    }
}