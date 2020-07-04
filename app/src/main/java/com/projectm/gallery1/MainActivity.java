package com.projectm.gallery1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView= (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapt(gridView.getContext()));
    }
}