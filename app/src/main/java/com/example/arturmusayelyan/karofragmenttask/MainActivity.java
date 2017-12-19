package com.example.arturmusayelyan.karofragmenttask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    private TextView textView;
    private Button plusBtn;
    private int buttonClickCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
        plusBtn = findViewById(R.id.plus_button);
        plusBtn.setOnClickListener(this);
        plusBtn.setOnLongClickListener(this);
        buttonClickCount = 0;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.plus_button:
                textView.setText((++buttonClickCount) + "");
                break;
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if (v.getId() == R.id.plus_button) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
            Toast.makeText(this, "Welcome to Second Activity", Toast.LENGTH_LONG).show();
            finish();
            return true;
        }
        return false;
    }
}
