package com.example.arturmusayelyan.karofragmenttask;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by artur.musayelyan on 19/12/2017.
 */

public class FragmentSecond extends Fragment {
    private TextView textView;
    private String showData;

    public FragmentSecond() {

    }

    public static FragmentSecond newInstance() {
        Bundle args = new Bundle();
        FragmentSecond fragment = new FragmentSecond();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState==null){
           showData=0+"";
        }
        else {
            showData=savedInstanceState.getString("counter");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.second_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = getActivity().findViewById(R.id.text_view);
        textView.setText(showData);
    }

    public void changeText(String data) {
        showData=data;
        textView.setText(showData);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("counter",textView.getText().toString());
    }
}
