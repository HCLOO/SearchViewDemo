package com.example.huangcl.searchviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchViewFragment fragment=new SearchViewFragment(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).commit();
    }
}
