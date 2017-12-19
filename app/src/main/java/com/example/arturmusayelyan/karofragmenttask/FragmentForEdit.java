package com.example.arturmusayelyan.karofragmenttask;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by artur.musayelyan on 19/12/2017.
 */

public class FragmentForEdit extends Fragment implements View.OnClickListener {
    Communicator communicator;
    public FragmentForEdit() {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        communicator=(Communicator)context;
    }

    public static FragmentForEdit newInstance() {
        Bundle args = new Bundle();
        FragmentForEdit fragment = new FragmentForEdit();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.edit_for_fragment, container, false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.send_button:
communicator.respond("button was clicked");
                break;
        }
    }
}
