package com.darkshadow.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bce,badd,bsub,bmul,bdiv,bdot,beq;
    TextView sc1,sc2;
    String s;
    float v1,v2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        bce=findViewById(R.id.bce);
        badd=findViewById(R.id.badd);
        bsub=findViewById(R.id.bsub);
        bmul=findViewById(R.id.bmul);
        bdiv=findViewById(R.id.bdiv);
        bdot=findViewById(R.id.bdot);
        beq=findViewById(R.id.beq);
        sc1=findViewById(R.id.sc1);
        sc2=findViewById(R.id.sc2);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                sc1.setText(sc1.getText()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                sc1.setText(sc1.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                sc1.setText(sc1.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                sc1.setText(sc1.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                sc1.setText(sc1.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                sc1.setText(sc1.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                sc1.setText(sc1.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                sc1.setText(sc1.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                sc1.setText(sc1.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                sc1.setText(sc1.getText()+"9");
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                sc1.setText(sc1.getText()+".");
            }
        });

        bce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                sc1.setText("");
                sc2.setText("");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(sc1.getText().toString().isEmpty() && sc2.getText().toString().isEmpty()){
                    sc1.setText("");
                }
                else if(!sc2.getText().toString().isEmpty()){
                    v1=Float.parseFloat(sc2.getText().toString());
                    s="+";
                }
                else{
                    s="+";
                    sc2.setText(sc1.getText());
                    v1=Float.parseFloat(sc1.getText().toString());
                    sc1.setText("");
                }
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(sc1.getText().toString().isEmpty() && sc2.getText().toString().isEmpty()){
                    sc1.setText("");
                }
                else if(!sc2.getText().toString().isEmpty()){
                    v1=Float.parseFloat(sc2.getText().toString());
                    s="-";
                }
                else{
                    s="-";
                    sc2.setText(sc1.getText());
                    v1=Float.parseFloat(sc1.getText().toString());
                    sc1.setText("");
                }
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(sc1.getText().toString().isEmpty() && sc2.getText().toString().isEmpty()){
                    sc1.setText("");
                }

                else if(!sc2.getText().toString().isEmpty()){
                    v1=Float.parseFloat(sc2.getText().toString());
                    s="*";
                }

                else{
                    s="*";
                    sc2.setText(sc1.getText());
                    v1=Float.parseFloat(sc1.getText().toString());
                    sc1.setText("");
                }
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(sc1.getText().toString().isEmpty() && sc2.getText().toString().isEmpty()){
                    sc1.setText("");
                }

                else if(!sc2.getText().toString().isEmpty()){
                    v1=Float.parseFloat(sc2.getText().toString());
                    s="/";
                }

                else{
                    s="/";
                    sc2.setText(sc1.getText());
                    v1=Float.parseFloat(sc1.getText().toString());
                    sc1.setText("");
                }
            }
        });

        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(sc1.getText().toString().isEmpty()){
                    sc1.setText("");
                }
                else if(!sc1.getText().toString().isEmpty() && sc2.getText().toString().isEmpty()){
                    sc2.setText(sc1.getText());
                    sc1.setText("");
                }
                else{
                    v2=Float.parseFloat(sc1.getText().toString());
                    sc1.setText("");
                    switch (s){
                        case "+":
                            sc2.setText(v1+v2+"");
                            s="";
                            break;
                        case "-":
                            sc2.setText(v1-v2+"");
                            s="";
                            break;
                        case "*":
                            sc2.setText(v1*v2+"");
                            s="";
                            break;
                        case "/":
                            sc2.setText(v1/v2+"");
                            s="";
                            break;
                        default:
                            sc2.setText("");
                            s="";
                            break;
                    }
                }
            }
        });
    }

}
