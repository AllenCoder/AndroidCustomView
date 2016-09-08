package com.allen.androidcustomview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.allen.comparsechart.CompareIndicator;

public class MainActivity extends AppCompatActivity {


    private com.allen.comparsechart.CompareIndicator CompareIndicator1;
    private com.allen.comparsechart.CompareIndicator CompareIndicator2;
    private com.allen.comparsechart.CompareIndicator CompareIndicator3;
    private android.widget.LinearLayout activitymain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.CompareIndicator1 = (CompareIndicator) findViewById(R.id.CompareIndicator1);
        this.CompareIndicator2 = (CompareIndicator) findViewById(R.id.CompareIndicator2);
        this.CompareIndicator3 = (CompareIndicator) findViewById(R.id.CompareIndicator3);
        CompareIndicator1.updateView(10,90);
        CompareIndicator2.updateView(30,70);
        CompareIndicator3.updateView(70,30);
    }
}
