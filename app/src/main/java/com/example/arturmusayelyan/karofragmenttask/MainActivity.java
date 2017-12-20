package com.example.arturmusayelyan.karofragmenttask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void respond(String data) {
        FragmentSecond fragmentSecond = (FragmentSecond) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        fragmentSecond.changeText(data);
    }

    @Override
    public void checkLongClick(boolean checkButtonClickType) {
        if(checkButtonClickType){
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
            Toast.makeText(this, "Welcome to Second Activity", Toast.LENGTH_LONG).show();
        }
    }


}
