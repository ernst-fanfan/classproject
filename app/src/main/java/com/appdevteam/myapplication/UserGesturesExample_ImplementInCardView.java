package com.appdevteam.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
//Note: use this example during the card view section and set the left/right tags to move through the card list
public class UserGesturesExample_ImplementInCardView extends AppCompatActivity implements GestureDetector.OnGestureListener {
    private static final String TAG = "Swipe Position";
    private float x1, x2, y1, y2;
    private static int MIN_DISTANCE = 150;
    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.gestureDetector = new GestureDetector(UserGesturesExample_ImplementInCardView.this, this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        gestureDetector.onTouchEvent(event);
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = event.getX();
                y1 = event.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = event.getX();
                y2 = event.getY();
                float valueX = x2-x1;
                float valueY = y2-y1;

                if(Math.abs(valueX) > MIN_DISTANCE){
                    if(x2>x1){
                        Toast.makeText(this, "Right swipe", Toast.LENGTH_SHORT).show();
                        Log.d(TAG, "Right swipe");
                    }
                    else {
                        Toast.makeText(this, "Left swipe", Toast.LENGTH_SHORT).show();
                        Log.d(TAG, "Left swipe");
                    }

                }
                else if(Math.abs(valueY)> MIN_DISTANCE){
                    if(y2 > y1){
                        Toast.makeText(this, "Down swipe", Toast.LENGTH_SHORT).show();
                        Log.d(TAG, "Down swipe");
                    }
                    else{
                        Toast.makeText(this, "Up swipe", Toast.LENGTH_SHORT).show();
                        Log.d(TAG, "Up swipe");
                    }
                }
                break;

        }


        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e){
        return false;
    }
    @Override
    public void onShowPress(MotionEvent e){

    }
    @Override
    public boolean onSingleTapUp(MotionEvent e){
        return false;
    }
    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY){
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }


    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }


}
