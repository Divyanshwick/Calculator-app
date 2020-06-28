package com.example.calculatorextended;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView img1,img2;
    private Button exitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=(ImageView)findViewById(R.id.imgView1);
        img2=(ImageView)findViewById(R.id.imgView2);
        exitBtn=(Button)findViewById(R.id.exitBtn);
    }
    public void intent1(View view){
        Intent intent=new Intent(MainActivity.this,SimpleCalculator.class);
        startActivity(intent);

    }
    public void intent2(View view){
        Intent intent=new Intent(MainActivity.this,ScientificCalculator.class);
        startActivity(intent);

    }
    public void EXIT(View view){
        System.exit(0);
    }

}
