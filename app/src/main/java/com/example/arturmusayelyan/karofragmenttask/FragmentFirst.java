package com.example.arturmusayelyan.karofragmenttask;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by artur.musayelyan on 19/12/2017.
 */

public class FragmentFirst extends Fragment implements View.OnClickListener, View.OnLongClickListener {
    private Button clickMeButton;
    private int clickMeButtonCount = 0;
    private Communicator communicator;

    public FragmentFirst() {

    }

    public static FragmentFirst newInstance() {
        Bundle args = new Bundle();
        FragmentFirst fragment = new FragmentFirst();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            clickMeButtonCount =0;
        }
        else {
            clickMeButtonCount=savedInstanceState.getInt("counter");

        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.first_fragment, container, false);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", clickMeButtonCount);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //communicator = (Communicator) getActivity();
        clickMeButton = getActivity().findViewById(R.id.plus_button);
        clickMeButton.setOnClickListener(this);
        clickMeButton.setOnLongClickListener(this);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        communicator = (Communicator) getActivity();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.plus_button:
                ++clickMeButtonCount;
                communicator.respond(clickMeButtonCount + "");
                break;
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if (v.getId() == R.id.plus_button) {
            communicator.checkLongClick(true);
            return true;
        }

        communicator.checkLongClick(false);
        return false;
    }
}
