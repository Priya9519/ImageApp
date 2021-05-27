package com.valuepitch.imageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private String url="https://images.unsplash.com/photo-1577234211973-f13523735bbb?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8Mjd8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60";
    // String url="https://www.top13.net/wp-content/uploads/2014/11/20-small-flowers.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {

        imageView=findViewById(R.id.imageView);
        Picasso.get()
                .load(url)
                .resize(getResources().getDisplayMetrics().widthPixels,0)
                .into(imageView);

    }
}