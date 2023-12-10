package com.example.box;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Case extends AppCompatActivity {
    boolean flag = true;
    int a = 0, b = 0, c = 0;
    int[] image = {R.drawable.red, R.drawable.orange, R.drawable.yellow, R.drawable.gren, R.drawable.blue, R.drawable.purple};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case);
        final ImageView image_2 = (ImageView) findViewById(R.id.imagec);
        final ImageButton blue = (ImageButton) findViewById(R.id.imageBlue);
        blue.setVisibility(View.GONE);
        final ImageButton blueLine = (ImageButton) findViewById(R.id.imageBlue_line);
        blueLine.setVisibility(View.GONE);
        final ImageButton imageButton = (ImageButton) findViewById(R.id.imageCv1);
        imageButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag){
                    a = (a + 1) % 6;
                    imageButton.setImageResource(image[a]);}
                else{
                    a = (a + 1) % 6;
                    imageButton.setImageResource(image[a]);}
                flag = !flag;
            }
        });
        final ImageButton imageCv2 = (ImageButton) findViewById(R.id.imageCv2);
        imageCv2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag){
                    b = (b + 1) % 6;
                    imageCv2.setImageResource(image[b]);}
                else{
                    b = (b + 1) % 6;
                    imageCv2.setImageResource(image[b]);}
                flag = !flag;
            }
        });
        final ImageButton imageCv3 = (ImageButton) findViewById(R.id.imageCv3);
        imageCv3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag){
                    c = (c + 1) % 6;
                    imageCv3.setImageResource(image[c]);}
                else{
                    c = (c + 1) % 6;
                    imageCv3.setImageResource(image[c]);}
                flag = !flag;
            }
        });
        final ImageButton button = (ImageButton) findViewById(R.id.imageButton2);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (a == 1 && b == 0 && c == 5){
                    image_2.setImageResource(R.drawable.cases_open);
                    blue.setVisibility(View.VISIBLE);
                    imageButton.setVisibility(View.GONE);
                    imageCv2.setVisibility(View.GONE);
                    imageCv3.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);
                }
            }
        });
        blue.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                blue.setVisibility(View.GONE);
                blueLine.setVisibility(View.VISIBLE);
            }
        });
    }
    public void onClick(View v) {
        try{
            Intent intent = new Intent(this, Wall2.class);
            intent.putExtra("things","OK");
            startActivity(intent);
            finish();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}