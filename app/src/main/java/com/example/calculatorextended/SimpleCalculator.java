package com.example.calculatorextended;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.pow;

public class SimpleCalculator extends AppCompatActivity {
    private Button addBtn,mulBtn,divideBtn,subBtn,exitBtn,clearBtn,powerBtn,rootBtn;
    private EditText edText1,edText2;
    Double n1,n2,n3;
    private TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
        addBtn=(Button)findViewById(R.id.addBtn);
       subBtn=(Button)findViewById(R.id.subBtn);
        divideBtn=(Button)findViewById(R.id.divideBtn);
        mulBtn=(Button)findViewById(R.id.mulBtn);
        exitBtn=(Button)findViewById(R.id.exitBtn);
        clearBtn=(Button)findViewById(R.id.clearBtn);
        powerBtn=(Button)findViewById(R.id.powerBtn);
        rootBtn=(Button)findViewById(R.id.rootBtn);
        edText1=(EditText)findViewById(R.id.edtText1);
        edText2=(EditText)findViewById(R.id.edtText2);
        txtView=(TextView)findViewById(R.id.txtView4);


    }
    public void ADD (View view){
        try{
        Double n1 = Double.parseDouble(edText1.getText().toString());
        Double n2 = Double.parseDouble(edText2.getText().toString());
        n3 = n1 + n2;
        txtView.setText(n3.toString());
        }
        catch(NumberFormatException e){

            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();
        }
    }

    public void Subtract(View view){
        try {
            Double n1 = Double.parseDouble(edText1.getText().toString());
            Double n2 = Double.parseDouble(edText2.getText().toString());
            n3 = n1 - n2;
            txtView.setText(n3.toString());
        }
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();
        }
    }
    public void Divide(View view){
        try{
        Double n1=Double.parseDouble(edText1.getText().toString());
        Double n2=Double.parseDouble(edText2.getText().toString());
        n3=n1/n2;
        txtView.setText(n3.toString());}
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

        }

    }
    public void Multiply(View view){
        try{
        Double n1=Double.parseDouble(edText1.getText().toString());
        Double n2=Double.parseDouble(edText2.getText().toString());
        n3=n1*n2;
        txtView.setText(n3.toString());}
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();
        }

    }
    public void Exit(View view){
       System.exit(0);

    }
    public void Clear(View view){
        edText1.setText(" ");
        edText2.setText(" ");
        txtView.setText(" ");

    }
    public void POWER(View view){
        try {
            Double n1 = Double.parseDouble(edText1.getText().toString());
            Double n2 = Double.parseDouble(edText2.getText().toString());
            n3 = pow(n1, n2);
            txtView.setText(n3.toString());
        }
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();
        }
    }
    public void REMAINDER(View view){
        try{
        Double n1=Double.parseDouble(edText1.getText().toString());
        Double n2=Double.parseDouble(edText2.getText().toString());
        n3=n1%n2;
        txtView.setText(n3.toString());}
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(), "Enter value first", Toast.LENGTH_SHORT).show();

        }

    }
}
