package com.example.doodleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    SecondSurfaceView surfaceView;

    SecondSurfaceView secondSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        surfaceView = findViewById(R.id.surfaceview);

        secondSurfaceView = new SecondSurfaceView(MainActivity.this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return secondSurfaceView.onTouchEvent(event);
    }

    public void onClick(View v){
        surfaceView.clean();
    }
}
