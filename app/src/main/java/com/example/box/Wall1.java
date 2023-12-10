package com.example.box;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Wall1 extends AppCompatActivity{
    public static int picture;
    boolean k = true;
    private int a = 0;
    int[] image = {R.drawable.key, R.drawable.key_o};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        final ImageButton imageButton = (ImageButton) findViewById(R.id.key);
        imageButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                a = (a + 1) % 2;
                imageButton.setImageResource(image[a]);
            }
        });

    }
    public void onClick(View v) {
        try{
            Intent intent = new Intent(this, Wall2.class);
            startActivity(intent);
            finish();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void onClicks(View v) {
        try{
            Intent intent = new Intent(this, MainActivity.class);
            //startActivity(intent);
            finish();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
