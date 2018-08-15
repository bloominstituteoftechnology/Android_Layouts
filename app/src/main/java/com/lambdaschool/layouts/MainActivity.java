package com.lambdaschool.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        // Not required
        image = findViewById(R.id.image_view);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (image.getScaleType() == ImageView.ScaleType.FIT_CENTER) {
                    image.setScaleType(ImageView.ScaleType.CENTER_CROP);
                } else {
                    image.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
            }
        });
    }
}
