package com.appdevteam.myapplication;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
//In the java section that uses gyroscope, use a similar form of the following commented code
//
// private Gyroscope gyroscope;
//...
//protected void onCreate(Bundle savedInstanceState) {
//...
//gyroscope = new Gyroscope(this);
//gyroscope.setListener(new Gyroscope.Listener() {
//            @Override
//            public void onRotation(float rx, float ry, float rz) {
//                if(rz > 1.0f){
//                    ;
//                }
//                else if(rz < -1.0f){
//                    ;
//                }
//
//            }
//        });
//  }
// @Override
//    protected void onResume(){
//        super.onResume();
//        gyroscope.register();
//    }
//
//    @Override
//    protected void onPause(){
//        super.onPause();
//        gyroscope.unregister();
//    }


public class Gyroscope {

    public interface Listener{
        void onRotation(float rx, float ry, float rz);
    }

    private Listener listener;

    public void setListener(Listener l){
        listener = l;
    }

    private SensorManager sensorManager;
    private Sensor sensor;
    private SensorEventListener sensorEventListener;

    Gyroscope(Context context){
        sensorManager =(SensorManager) context.getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        sensorEventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                if(listener !=null){
                    listener.onRotation(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
                }

            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {

            }
        };
    }

    public void register(){
        sensorManager.registerListener(sensorEventListener, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    public void unregister(){
        sensorManager.unregisterListener(sensorEventListener);
    }
}
