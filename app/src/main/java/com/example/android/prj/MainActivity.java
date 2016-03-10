package com.example.android.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void detail1(View v)
    {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
    public void detail2(View v)
    {
        Intent intent=new Intent(MainActivity.this,Main3Activity.class);
        startActivity(intent);
    }
    public void detail3(View v)
    {
        Intent intent=new Intent(MainActivity.this,Main4Activity.class);
        startActivity(intent);
    }
    public void detail4(View v)
    {
        Intent intent=new Intent(MainActivity.this,Main5Activity.class);
        startActivity(intent);
    }
    public void detail5(View v)
    {
        Intent intent=new Intent(MainActivity.this,Main6Activity.class);
        startActivity(intent);
    }
}
