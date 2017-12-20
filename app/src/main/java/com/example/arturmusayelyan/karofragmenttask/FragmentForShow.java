package com.example.arturmusayelyan.karofragmenttask;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by artur.musayelyan on 19/12/2017.
 */

public class FragmentForShow extends Fragment {
    private TextView showTextView;

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
        View view = inflater.inflate(R.layout.show_for_fragment, container, false);
        showTextView = view.findViewById(R.id.text_view_for_show);
        return view;
    }

    public void changeData(String data) {
        if (data.length() > 0) {
            showTextView.setText(data);
        } else {
            Toast.makeText(getActivity(), "Input something...", Toast.LENGTH_LONG).show();
        }
    }
}
