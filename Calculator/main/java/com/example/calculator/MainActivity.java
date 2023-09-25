package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button add,sub,multi,div;
    TextView res;

    EditText fnum,snum;
    Double s1,s2,s3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fnum=findViewById(R.id.fnum);
        snum=findViewById(R.id.snum);
        res=findViewById(R.id.res);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        multi=findViewById(R.id.multi);
        div=findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=Double.parseDouble(fnum.getText().toString());
                s2=Double.parseDouble(snum.getText().toString());
                s3=s1+s2;
                res.setText(""+s3);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=Double.parseDouble(fnum.getText().toString());
                s2=Double.parseDouble(snum.getText().toString());
                s3=s1-s2;
                res.setText(""+s3);
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=Double.parseDouble(fnum.getText().toString());
                s2=Double.parseDouble(snum.getText().toString());
                s3=s1*s2;
                res.setText(""+s3);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=Double.parseDouble(fnum.getText().toString());
                s2=Double.parseDouble(snum.getText().toString());
                s3=s1/s2;
                res.setText(""+s3);
            }
        });
    }
}