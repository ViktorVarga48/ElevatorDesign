package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    ImageView elevator;
    int currentFloor = 0;
    int moveToFloor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        elevator = (ImageView) findViewById(R.id.elevator);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToFloor = 1;
                float distance = getFloorDifference(moveToFloor);
                ObjectAnimator a = ObjectAnimator.ofFloat(elevator, "y", elevator.getY()+distance);
                a.setDuration(4000);
                a.start();
                currentFloor = moveToFloor;
            }

        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToFloor = 2;
                float distance = getFloorDifference(moveToFloor);
                ObjectAnimator a = ObjectAnimator.ofFloat(elevator, "y", elevator.getY()+distance);
                a.setDuration(4000);
                a.start();
                currentFloor = moveToFloor;

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToFloor = 0;
                float distance = getFloorDifference(moveToFloor);
                ObjectAnimator a = ObjectAnimator.ofFloat(elevator, "y", elevator.getY()+distance);
                a.setDuration(4000);
                a.start();
                currentFloor = moveToFloor;

            }


        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToFloor = 3;
                float distance = getFloorDifference(moveToFloor);
                ObjectAnimator a = ObjectAnimator.ofFloat(elevator, "y", elevator.getY()+distance);
                a.setDuration(4000);
                a.start();
                currentFloor = moveToFloor;

            }


        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToFloor = 4;
                float distance = getFloorDifference(moveToFloor);
                ObjectAnimator a = ObjectAnimator.ofFloat(elevator, "y", elevator.getY()+distance);
                a.setDuration(4000);
                a.start();
                currentFloor = moveToFloor;

            }


        });



    }
    private float getFloorDifference(int floor){
        if (floor == currentFloor) {
            return 0;
        } else {
            float newY = (currentFloor - floor)*250;
            return newY;
        }
    };
}
