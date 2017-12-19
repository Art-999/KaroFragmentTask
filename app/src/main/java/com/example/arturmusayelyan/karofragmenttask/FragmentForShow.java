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

public class FragmentForShow extends Fragment {
    public FragmentForShow() {

    }

    public static FragmentForShow newInstance() {
        Bundle args = new Bundle();
        FragmentForShow fragment = new FragmentForShow();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.show_for_fragment, container, false);
    }
}
