package com.example.arturmusayelyan.karofragmenttask;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity implements Communicator {
    private FragmentForEdit fragmentForEdit;
    private FragmentForShow fragmentForShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        fragmentForEdit = FragmentForEdit.newInstance();
        fragmentForShow = FragmentForShow.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_for_edit, fragmentForEdit, "editFragment");
        fragmentTransaction.replace(R.id.frame_layout_for_show, fragmentForShow, "showFragment");
        fragmentTransaction.commit();
    }

    @Override
    public void respond(String data) {
        FragmentForShow fragmentForShow = (FragmentForShow) getSupportFragmentManager().findFragmentByTag("showFragment");
        fragmentForShow.changeData(data);
    }

    @Override
    public void checkLongClick(boolean checkButtonClickType) {

    }


}
