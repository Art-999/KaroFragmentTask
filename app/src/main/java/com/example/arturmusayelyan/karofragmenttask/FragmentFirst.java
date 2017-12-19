package com.example.arturmusayelyan.karofragmenttask;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by artur.musayelyan on 19/12/2017.
 */

public class FragmentFirst extends Fragment implements View.OnClickListener {
    public FragmentFirst(){

    }

    public static FragmentFirst newInstance() {
         Bundle args = new Bundle();
         FragmentFirst fragment = new FragmentFirst();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.first_fragment,container,false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.plus_button:

                break;
        }
    }
}
