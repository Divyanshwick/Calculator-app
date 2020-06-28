package com.example.calculatorextended;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.pow;


public class ScientificCalculator extends AppCompatActivity {
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18;
    private EditText edTxt;
    private TextView txtView;
    Double n1,n;



    public void SINE(View view) {
        try{
        n=Double.parseDouble(edTxt.getText().toString());
        n1=java.lang.Math.sin(n);
        txtView.setText(n1.toString());}
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

        }
    }
    public void COSINE(View view) {
        try{
        n=Double.parseDouble(edTxt.getText().toString());
        n1=java.lang.Math.cos(n);
        txtView.setText(n1.toString());}
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

        }
    }
    public void TANGENT(View view) {
        try{
        n=Double.parseDouble(edTxt.getText().toString());
        n1=java.lang.Math.tan(n);
        txtView.setText(n1.toString());}
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

        }
    }
    public void SECANT(View view) {
        try {
            n = Double.parseDouble(edTxt.getText().toString());
            n1 = 1 / java.lang.Math.cos(n);
            txtView.setText(n1.toString());
        }
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

        }
    }
    public void COSECANT(View view) {
        try {
            n = Double.parseDouble(edTxt.getText().toString());
            n1 = 1 / java.lang.Math.sin(n);
            txtView.setText(n1.toString());
        }
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

        }
    }
    public void COTANGENT(View view) {
        try {
            n = Double.parseDouble(edTxt.getText().toString());
            n1 = 1 / java.lang.Math.tan(n);
            txtView.setText(n1.toString());
        }
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

        }
    }
    public void ARCSINE(View view) {
        try {
            n=Double.parseDouble(edTxt.getText().toString());
            n1 = java.lang.Math.asin(n);
            txtView.setText(n1.toString());
        }
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();
        }
    }
    public void ARCCOSINE(View view) {
        try {
            n = Double.parseDouble(edTxt.getText().toString());
            n1 = java.lang.Math.acos(n);
            txtView.setText(n1.toString());
        }
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

        }
    }
    public void ARCTANGENT(View view) {
        try{
        n=Double.parseDouble(edTxt.getText().toString());
        n1=java.lang.Math.atan(n);
        txtView.setText(n1.toString());}
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

        }
    }
    public void ARCCOSEC(View view) {
        try {
            n = Double.parseDouble(edTxt.getText().toString());
            n1 = java.lang.Math.asin(1 / n);
            txtView.setText(n1.toString());
        }
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

        }
    }
    public void ARCSEC(View view) {
        try {
            n = Double.parseDouble(edTxt.getText().toString());
            n1 = java.lang.Math.acos(1 / n);
            txtView.setText(n1.toString());
        }
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

        }
    }
    public void ARCCOT(View view) {
        try {
            n = Double.parseDouble(edTxt.getText().toString());
            n1 = java.lang.Math.atan(1 / n);
            txtView.setText(n1.toString());
        }
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

        }
    }
    public void FACTORIAL(View view){
        try{
        n=Double.parseDouble(edTxt.getText().toString());
        float i=1,fact=1;
        Double ans;
        for(i=1;i<=n;i++)
        {fact*=i;
        }
        ans=(double)fact;
        txtView.setText(ans.toString());}
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

        }
    }
    public void LOG(View view) {
        try {
            n = Double.parseDouble(edTxt.getText().toString());
            n1 = java.lang.Math.log(n);
            txtView.setText(n1.toString());
        }
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

        }
    }
    public void LOGTEN(View view) {
        try{
        n=Double.parseDouble(edTxt.getText().toString());
        n1=java.lang.Math.log10(n);
        txtView.setText(n1.toString());}
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

        }
    }
    public void ANTILOG_TEN(View view) {
        try {
            n = Double.parseDouble(edTxt.getText().toString());
            n1 = pow(10, java.lang.Math.log1p(n));
            txtView.setText(n1.toString());
        }
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

        }
    }
    public void SUMMATION(View view){
        try{
        n=Double.parseDouble(edTxt.getText().toString());
        int a=1,sum=0;
        Double answer;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        answer=(double)sum;
        txtView.setText(answer.toString());}
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

        }

    }
    public void ANTILOG_E(View view)
    { try {
        n = Double.parseDouble(edTxt.getText().toString());
        n1 = pow(2.718, java.lang.Math.log1p(n));
        txtView.setText(n1.toString());
    }
    catch(NumberFormatException e){
        Toast.makeText(getApplicationContext(),"Enter value first", Toast.LENGTH_SHORT).show();

    }

    }
    public void EXIT(View view)
    {
        System.exit(0);
    }
    public void CLEAR(View view){
        edTxt.setText("");
        txtView.setText("");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calculator);
        btn1 = (Button) findViewById(R.id.sinBtn);
        btn2 = (Button) findViewById(R.id.cosBtn);
        btn3 = (Button) findViewById(R.id.tanBtn);
        btn4 = (Button) findViewById(R.id.secBtn);
        btn5 = (Button) findViewById(R.id.cosecBtn);
        btn6 = (Button) findViewById(R.id.cotBtn);
        btn7 = (Button) findViewById(R.id.arcsinBtn);
        btn8 = (Button) findViewById(R.id.arccosBtn);
        btn9 = (Button) findViewById(R.id.arctanBtn);
        btn10 = (Button) findViewById(R.id.arcsecBtn);
        btn11 = (Button) findViewById(R.id.arccosecBtn);
        btn12 = (Button) findViewById(R.id.arccotBtn);
        btn13 = (Button) findViewById(R.id.antilogeBtn);
        btn14 = (Button) findViewById(R.id.logBtn);
        btn15 = (Button) findViewById(R.id.logtenBtn);
        btn16 = (Button) findViewById(R.id.antilogBtn);
        btn17 = (Button) findViewById(R.id.exitBtn);
        btn18 = (Button) findViewById(R.id.clearBtn);
        edTxt = (EditText) findViewById(R.id.edtText);
        txtView = (TextView) findViewById(R.id.txtView4);
    }


}
