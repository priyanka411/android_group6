package com.example.mainproject_2_6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {


   Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                instance();

            }
        });
    }
        public void instance()
        {
            Intent intent = new Intent(this, Activity_3_1.class);
            startActivity(intent);

        }

}
