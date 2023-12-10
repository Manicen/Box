package com.example.box;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Wall3 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

    }
    public void onClick(View v) {
        try{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void onClicks(View v) {
        try{
            Intent intent = new Intent(this, Wall2.class);
            startActivity(intent);
            finish();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}