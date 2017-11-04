package com.numetriclabz.donut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.numetriclabz.numandroidcharts.ChartData;
import com.numetriclabz.numandroidcharts.DonutChart;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DonutChart donut = (DonutChart) findViewById(R.id.piegraph);

        ChartData values = new ChartData();

        values.setSectorValue(4);
        donut.addSector(values);

        values = new ChartData();
        values.setSectorValue(3);
        donut.addSector(values);

        values = new ChartData();
        values.setSectorValue(8);
        donut.addSector(values);

        values = new ChartData();
        values.setSectorValue(5);
        donut.addSector(values);
    }
}
