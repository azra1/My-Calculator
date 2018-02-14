package com.techfreaks.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FrontActivity extends AppCompatActivity {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bPlus, bMinus, bDivide, bMultiply, bDot, bEqual, bDelete;
    EditText input;
    float value1, value2;
    boolean add, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        b0=findViewById(R.id.zeroButton);
        b1=findViewById(R.id.oneButton);
        b2=findViewById(R.id.twoButton);
        b3=findViewById(R.id.threeButton);
        b4=findViewById(R.id.fourButton);
        b5=findViewById(R.id.fiveButton);
        b6=findViewById(R.id.sixButton);
        b7=findViewById(R.id.sevenButton);
        b8=findViewById(R.id.eightButton);
        b9=findViewById(R.id.nineButton);
        bPlus=findViewById(R.id.plusButton);
        bMinus=findViewById(R.id.minusButton);
        bDivide=findViewById(R.id.divisionButton);
        bMultiply=findViewById(R.id.multiplyButton);
        bDot=findViewById(R.id.dotButton);
        bEqual=findViewById(R.id.equalButton);
        bDelete=findViewById(R.id.deleteButton);
        input=findViewById(R.id.input);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"0");
            }

        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"1");
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"2");
            }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"3");
            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"4");
            }

        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"5");
            }

        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"6");
            }

        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"7");
            }

        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"8");
            }

        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"9");
            }

        });
        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (input == null){
                    input.setText("");
                }else {
                    value1 = Float.parseFloat(input.getText() + "");
                    add = true;
                    input.setText(null);
                }
            }
        });

        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1= Float.parseFloat(input.getText() + "");
                subtract = true ;
                input.setText(null);
            }
        });

        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(input.getText() + "");
                multiply = true ;
                input.setText("");
            }
        });

        bDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(input.getText()+"");
                divide = true ;
                input.setText(null);
            }
        });

        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Float.parseFloat(input.getText() + "");

                if (add== true){

                    input.setText(value1 + value2 +"");
                    add=false;
                }


                if (subtract == true){
                    input.setText(value1 - value2+"");
                    subtract=false;
                }

                if (multiply == true){
                    input.setText(value1* value2+"");
                    multiply=false;
                }

                if (divide == true){
                    input.setText(value1/ value2+"");
                    divide=false;
                }
            }
        });

        bDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
            }
        });

        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+".");
            }
        });
    }


}

