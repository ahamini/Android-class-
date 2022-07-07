package com.ahampatel.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import java.util.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_add,btn_div,btn_minus,btn_equalsto,btn_dot,btn_zero,btn_mul,btn_clr;
TextView txt;
ImageButton img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1=findViewById(R.id.one);
        btn_2=findViewById(R.id.two);
        btn_3=findViewById(R.id.three);
        btn_4=findViewById(R.id.four);
        btn_5=findViewById(R.id.five);
        btn_6=findViewById(R.id.six);
        btn_7=findViewById(R.id.seven);
        btn_8=findViewById(R.id.eigth);
        btn_9=findViewById(R.id.nine);
        btn_zero=findViewById(R.id.zero);
        btn_add=findViewById(R.id.addition);
        btn_div=findViewById(R.id.div);
        btn_minus=findViewById(R.id.minus);
        btn_mul=findViewById(R.id.mul);
        btn_equalsto=findViewById(R.id.equalsTo);
        btn_dot=findViewById(R.id.dot);
        txt=findViewById(R.id.edt_result);
        btn_clr=findViewById(R.id.clear_txt);
        img=findViewById(R.id.back);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prev=txt.getText().toString();
                String after=prev.substring(0,prev.length()-1);
                txt.setText(after);
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             txt.setText(txt.getText().toString()+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString()+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString()+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString()+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString()+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString()+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString()+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString()+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString()+"9");
            }
        });

        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString()+"0");
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString()+"+");
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString()+"-");
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString()+"*");
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString()+"/");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString()+".");
            }
        });

        btn_equalsto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = txt.getText().toString();
                if (number.contains("+")) {
                    int index=number.indexOf("+");
                    txt.setText(Double.toString(add(Double.parseDouble(number.substring(0,index)),Double.parseDouble(number.substring(index+1)))));
                }
                if (number.contains("-")) {
                    int index=number.indexOf("-");
                    txt.setText(Double.toString(sub(Double.parseDouble(number.substring(0,index)),Double.parseDouble(number.substring(index+1)))));
                }
                if (number.contains("/")) {
                    int index=number.indexOf("/");
                    txt.setText(Double.toString(div(Double.parseDouble(number.substring(0,index)),Double.parseDouble(number.substring(index+1)))));
                }
                if (number.contains("*")) {
                    int index=number.indexOf("*");
                    txt.setText(Double.toString(mul(Double.parseDouble(number.substring(0,index)),Double.parseDouble(number.substring(index+1)))));
                }
            }
        });

        btn_clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("0");
            }
        });
    }
    double add(double a,double b){
        return a+b;
    }

    double sub(double a,double b){
        return a-b;
    }

    double div(double a,double b){
        return a/b;
    }

    double mul(double a,double b){
        return a*b;
    }
}