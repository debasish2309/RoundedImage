package com.example.roundedimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = findViewById(R.id.image1);
        ImageView imageView2 = findViewById(R.id.image2);
        ImageView imageView3 = findViewById(R.id.image3);

        imageView1.setImageResource(R.drawable.ic_android_black_24dp);
        imageView2.setImageResource(R.drawable.ic_android_black_24dp);
        imageView3.setImageResource(R.drawable.ic_android_black_24dp);
    }
}
