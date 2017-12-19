package com.example.arturmusayelyan.karofragmenttask;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements Communicator {
    private Button sendButton;
    private EditText sendEditText;
    private TextView showTextView;

    private FragmentForEdit fragmentForEdit;
    private FragmentForShow fragmentForShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//        sendButton = findViewById(R.id.send_button);
//        sendEditText = findViewById(R.id.send_edit_text);
//        showTextView = findViewById(R.id.text_view_for_show);
//        sendButton.setOnClickListener(this);
        fragmentForEdit=FragmentForEdit.newInstance();
        fragmentForShow=FragmentForShow.newInstance();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_for_edit,fragmentForEdit);
        fragmentTransaction.replace(R.id.frame_layout_for_show,fragmentForShow);
        fragmentTransaction.commit();
    }

    @Override
    public void respond(String data) {
      //  FragmentForShow fragmentForShow= getSupportFragmentManager().findFragmentById(R.id.frame_layout_for_show);
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.send_button:
//                String inputedText = sendEditText.getText().toString();
//                if (inputedText.length() > 0) {
////                    showTextView.setText(inputedText);
////                    sendEditText.setText("");
//                    fragmentForEdit.onClick(v);
//                }
//                break;
//        }
//    }
}
